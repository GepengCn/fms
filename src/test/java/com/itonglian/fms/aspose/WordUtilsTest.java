package com.itonglian.fms.aspose;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class WordUtilsTest {

    @Autowired
    WordUtils wordUtils;
    @Value(value = "${template.formPath}")
    private String srcFile;
    @Test
    public void word2Pdf() {

        wordUtils.word2Pdf(srcFile,"/Users/gepeng/Downloads/template/test.pdf");

    }
}