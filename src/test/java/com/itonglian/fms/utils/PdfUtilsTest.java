package com.itonglian.fms.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class PdfUtilsTest {

    @Autowired
    PdfUtils pdfUtils;
    @Test
    public void word2Html() {
        String src = "/Users/gepeng/Downloads/poi/springmvc_day1.doc";
        String pdf = "/Users/gepeng/Downloads/poi/springmvc_day1.pdf";
        pdfUtils.word2Pdf(src,pdf,false);
    }
}