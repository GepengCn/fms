package com.itonglian.fms.utils;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.converter.PicturesManager;
import org.apache.poi.hwpf.converter.WordToHtmlConverter;
import org.apache.poi.hwpf.usermodel.PictureType;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.nio.charset.Charset;

@Component
@Slf4j
public class PoiUtils {

    public String word2Html(String src){
        try {
            HWPFDocument wordDoc = new HWPFDocument(new FileInputStream(src));
            WordToHtmlConverter wordToHtmlConverter = new WordToHtmlConverter(
                    DocumentBuilderFactory.newInstance().newDocumentBuilder()
                            .newDocument());
            wordToHtmlConverter.setPicturesManager(new PicturesManager() {
                @Override
                public String savePicture(byte[] bytes, PictureType pictureType, String s, float v, float v1) {
                    File newFile = new File("/Users/gepeng/Downloads/poi/images",s);
                    FileOutputStream fileOutputStream = null;
                    try {
                        fileOutputStream = new FileOutputStream(newFile);
                        fileOutputStream.write(bytes);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return null;
                }
            });
            wordToHtmlConverter.processDocument(wordDoc);
            Document document = wordToHtmlConverter.getDocument();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(byteArrayOutputStream);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING,"utf-8");

            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.setOutputProperty(OutputKeys.METHOD,"html");
            transformer.transform(domSource,streamResult);
            byteArrayOutputStream.close();
            String content = byteArrayOutputStream.toString();

            return content;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } finally {

        }
        return null;

    }

    public void saveHtml(String htmlString,String destPath){
        FileOutputStream fos = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(destPath);
            fos = new FileOutputStream(file);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(fos,"UTF-8"));
            bufferedWriter.write(htmlString);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void html2Pdf(String src,String dest){
        com.itextpdf.text.Document document = new com.itextpdf.text.Document();
        try {
            PdfWriter pdfWriter = PdfWriter.getInstance(document,new FileOutputStream(dest));
            document.open();
            XMLWorkerHelper.getInstance().parseXHtml(pdfWriter,document,new FileInputStream(src), Charset.forName("UTF-8"));
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
