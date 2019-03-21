package com.itonglian.fms.utils;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.converter.PicturesManager;
import org.apache.poi.hwpf.converter.WordToHtmlConverter;
import org.apache.poi.hwpf.usermodel.PictureType;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Entities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.nio.charset.Charset;
import java.util.UUID;

@Component
@Slf4j
public class PdfUtils {

    @Value(value = "${template.images}")
    private String imagesRoot;
    @Value(value = "${template.htmlPath}")
    private String htmlPath;

    private String imagesPath;

    boolean debug = log.isDebugEnabled();

    public String word2Html(String src) throws IOException, ParserConfigurationException, TransformerException {
        HWPFDocument wordDoc = new HWPFDocument(new FileInputStream(src));
        WordToHtmlConverter wordToHtmlConverter = new WordToHtmlConverter(
                DocumentBuilderFactory.newInstance().newDocumentBuilder()
                        .newDocument());
        wordToHtmlConverter.setPicturesManager(new PicturesManager() {
            @Override
            public String savePicture(byte[] bytes, PictureType pictureType, String s, float v, float v1) {
                imagesPath = imagesRoot+File.separator+UUID.randomUUID().toString();
                File dirFile = new File(imagesPath);
                if(!dirFile.exists()){
                    dirFile.mkdirs();
                }
                File image = new File(imagesPath,s);
                FileOutputStream fileOutputStream = null;
                try {
                    fileOutputStream = new FileOutputStream(image);
                    fileOutputStream.write(bytes);
                } catch (FileNotFoundException e) {
                    log.error("FileNotFoundException",e);
                } catch (IOException e) {
                    log.error("IOException",e);
                }finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        log.error("IOException",e);
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
        if(debug){
            log.debug("Word转换成html,src:[{}]",src);
        }
        return content;
    }

    public void saveHtml(String htmlString,String destPath) throws IOException {
        if(debug){
            log.debug("保存html文件,destPath:[{}]",destPath);
        }
        FileOutputStream fos = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(destPath);
            fos = new FileOutputStream(file);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(fos,"UTF-8"));
            bufferedWriter.write(htmlString);
        }finally {
            try {
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                log.error("IOException",e);
            }
            try {
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                log.error("IOException",e);
            }
        }
    }


    public void html2Pdf(String src,String dest) throws IOException, DocumentException {
        if(debug){
            log.debug("HTML文件转换成PDF文件,src:[{}],dest:[{}]",src,dest);
        }
        com.itextpdf.text.Document document = new com.itextpdf.text.Document();
        try {
            PdfWriter pdfWriter = PdfWriter.getInstance(document,new FileOutputStream(dest));
            document.open();
            XMLWorkerHelper.getInstance().parseXHtml(pdfWriter,document,new FileInputStream(src), Charset.forName("UTF-8"));
        }finally {
            if(document!=null){
                document.close();
            }
        }
    }

    public boolean word2Pdf(String src,String dest,boolean delete){
        File dirFile = new File(htmlPath);
        String htmlFile = htmlPath+File.separator+ UUID.randomUUID().toString()+".html";
        boolean result = false;
        try {
            if(!dirFile.exists()){
                dirFile.mkdirs();
            }
            String htmlString = word2Html(src);
            org.jsoup.nodes.Document document = Jsoup.parse(htmlString);
            document.outputSettings().syntax(org.jsoup.nodes.Document.OutputSettings.Syntax.xml).escapeMode(Entities.EscapeMode.xhtml);  //转为 xhtml 格式
            htmlString = document.html();
            saveHtml(htmlString,htmlFile);
            html2Pdf(htmlFile,dest);
            result = true;
        } catch (IOException e) {
            log.error("IOException",e);
        } catch (ParserConfigurationException e) {
            log.error("ParserConfigurationException",e);
        } catch (TransformerException e) {
            log.error("TransformerException",e);
        } catch (DocumentException e) {
            log.error("DocumentException",e);
        }finally {
            if(delete){
                try {
                    FileUtils.forceDelete(new File(src));
                } catch (IOException e1) {
                    log.error("error",e1);
                }
            }
            try {
                FileUtils.deleteDirectory(new File(imagesPath));
            } catch (IOException e) {
                log.error("error",e);
            }
        }
        return result;

    }
}
