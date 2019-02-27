package com.itonglian.fms.aspose;

import com.aspose.words.Document;
import com.aspose.words.IWarningCallback;
import com.aspose.words.Range;
import com.aspose.words.WarningInfo;
import com.itonglian.fms.service.ContentFilling;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Component
@Slf4j
public class WordUtils {

    public synchronized boolean word2Pdf(String srcFile, String destFile){
        Document doc;
        try {
            doc = new Document(srcFile);
            doc.setWarningCallback(new IWarningCallback() {
                @Override
                public void warning(WarningInfo warningInfo) {
                    log.warn(warningInfo.getDescription());
                }
            });
            doc.save(destFile);
        } catch (Exception e) {
            log.error("error",e);
            try {
                FileUtils.forceDelete(new File(srcFile));
            } catch (IOException e1) {
                log.error("error",e1);
            }
            return false;
        }
        return true;
    }
    public synchronized boolean fillThenWord2Pdf(String srcFile, String destFile,ContentFilling contentFilling, Map<String,String> contents){
        Document doc;
        String barcode ="";
        try {
            doc = new Document(srcFile);
            Range range = doc.getRange();
            barcode = contentFilling.execute(doc,range,contents);
            doc.setWarningCallback(new IWarningCallback() {
                @Override
                public void warning(WarningInfo warningInfo) {
                    log.warn(warningInfo.getDescription());
                }
            });
            doc.save(destFile);
        } catch (Exception e) {
            log.error("error",e);
            return false;
        }finally {
            try {
                FileUtils.forceDelete(new File(barcode));
            } catch (IOException e) {
                log.error("error",e);
            }
        }
        return true;

    }

}
