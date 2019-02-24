package com.itonglian.fms.service.common.range;

import com.aspose.words.*;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.utils.BarcodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.regex.Pattern;

@Slf4j
@Component
public class WjbpdContentFilling implements ContentFilling {


    @Autowired
    BarcodeUtils barcodeUtils;

    @Override
    public void execute(Document document, Range range, Map<String, String> contents) throws Exception {
        DocumentBuilder builder = new DocumentBuilder(document);

        Section section = document.getFirstSection();
        builder.moveToSection(section.getDocument().indexOf(section));
        builder.moveToHeaderFooter(HeaderFooterType.HEADER_PRIMARY);
        builder.getParagraphFormat().setAlignment(ParagraphAlignment.RIGHT);

        Shape shape = builder.insertImage(barcodeUtils.generate(""));
        shape.setAspectRatioLocked(true);
        shape.setHeight(50);
        FindReplaceOptions findReplaceOptions = new FindReplaceOptions();
        findReplaceOptions.setMatchCase(true);
        findReplaceOptions.setReplacingCallback(new IReplacingCallback() {
            @Override
            public int replacing(ReplacingArgs replacingArgs) throws Exception {
                log.info(replacingArgs.getReplacement());
                return 0;
            }
        });
        for (Map.Entry<String, String> entry : contents.entrySet()) {
            range.replace(Pattern.compile("\\["+entry.getKey()+"\\]"),entry.getValue(),findReplaceOptions);
        }
    }
}
