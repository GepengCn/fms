package com.itonglian.fms.service.common.range;

import com.aspose.words.*;
import com.google.common.base.Strings;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.common.CommentTypeParser;
import com.itonglian.fms.service.common.HtmlParser;
import com.itonglian.fms.utils.BarcodeUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.regex.Pattern;

@Slf4j
public abstract class CommonContentFilling implements ContentFilling {

    @Autowired
    BarcodeUtils barcodeUtils;

    @Autowired
    CommentTypeParser commentTypeParser;

    @Autowired
    HtmlParser htmlParser;





    @Override
    public String execute(Document document, Range range, Map<String, String> contents, long taskId) throws Exception {
        DocumentBuilder builder = new DocumentBuilder(document);
        builder.moveToDocumentEnd();
        builder.getParagraphFormat().setAlignment(ParagraphAlignment.RIGHT);
        String barcode = barcodeUtils.generate(contents.get("FF02"));
        Shape shape = builder.insertImage(barcode);
        shape.setAspectRatioLocked(true);
        shape.setHeight(75);
        FindReplaceOptions findReplaceOptions = new FindReplaceOptions();
        findReplaceOptions.setMatchCase(true);
        findReplaceOptions.setReplacingCallback(new IReplacingCallback() {
            @Override
            public int replacing(ReplacingArgs replacingArgs) throws Exception {
//                log.info(replacingArgs.getReplacement());
                return 0;
            }
        });
        fill(taskId,builder,range);
        for (Map.Entry<String, String> entry : contents.entrySet()) {
            String value = entry.getValue();
            if(Strings.isNullOrEmpty(value)){
                value = "";
            }
            range.replace(Pattern.compile("\\["+entry.getKey()+"]"),value,findReplaceOptions);

        }
        return barcode;
    }

    public abstract void fill(long taskId, DocumentBuilder builder, Range range) throws Exception;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    protected class ReplaceBuilder{

        private String key;

        private StringBuilder stringBuilder;

        private boolean used;


    }
}
