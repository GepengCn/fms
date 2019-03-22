package com.itonglian.fms.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ZipUtilsTest {

    @Autowired
    ZipUtils zipUtils;

    @Test
    public void zip() {
        String srcFolder = "/Users/gepeng/Downloads/htmlPath";
        String zipFile = "/Users/gepeng/Downloads/test.zip";
        try {
            zipUtils.zip(srcFolder,zipFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}