package com.itonglian.fms.config.ftp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.UUID;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class FtpUtilTest {


    @Autowired
    FtpUtil ftpUtil;
    @Test
    public void upload() {
        String fileName = "test.pdf";
        ftpUtil.upload(UUID.randomUUID().toString(),fileName,new File("/Users/gepeng/Downloads/template/",fileName));
    }

    @Test
    public void download() {
    }
}