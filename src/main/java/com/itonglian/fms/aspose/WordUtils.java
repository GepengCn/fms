package com.itonglian.fms.aspose;

import com.aspose.words.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.regex.Pattern;

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
    public boolean fillThenWord2Pdf(String srcFile, String destFile,FillCallBack fillCallBack){
        Document doc;
        try {
            doc = new Document(srcFile);
            Range range = doc.getRange();
            fillCallBack.execute(range);
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

    public interface FillCallBack{

        public void execute(Range range);

    }

    public static void main(String[] args) {
        License lic = new License();
        try {
            lic.setLicense(new FileInputStream(ResourceUtils.getFile("classpath:Aspose.Words18.lic")));
            log.info("已注册Aspose证书...");
        } catch (Exception e) {
            log.error("error",e);
        }
        String srcFile = "/Users/gepeng/Downloads/range/文件报批单.doc";
        String destFile = "/Users/gepeng/Downloads/range/文件报批单.pdf";
        Document doc;
        try {
            doc = new Document(srcFile);
            Range range = doc.getRange();
            FindReplaceOptions findReplaceOptions = new FindReplaceOptions();
            findReplaceOptions.setMatchCase(true);
            findReplaceOptions.setReplacingCallback(new IReplacingCallback() {
                @Override
                public int replacing(ReplacingArgs replacingArgs) throws Exception {
                    log.info(replacingArgs.getReplacement());
                    return 0;
                }
            });
            range.replace(Pattern.compile("\\[mj\\]"),"加密",findReplaceOptions);
            range.replace(Pattern.compile("\\[hjcd\\]"),"平件",findReplaceOptions);
            doc.setWarningCallback(new IWarningCallback() {
                @Override
                public void warning(WarningInfo warningInfo) {
                    log.warn(warningInfo.getDescription());
                }
            });
            doc.save(destFile);
        } catch (Exception e) {
            log.error("error",e);
        }
    }

}
