package com.itonglian.fms.aspose;

import com.aspose.words.Document;
import com.aspose.words.IWarningCallback;
import com.aspose.words.WarningInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WordUtils {


    public boolean word2Pdf(String srcFile, String destFile){
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
            return false;
        }
        return true;

    }

}
