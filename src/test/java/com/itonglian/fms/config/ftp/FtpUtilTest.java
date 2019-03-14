package com.itonglian.fms.config.ftp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.UUID;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class FtpUtilTest {


    @Autowired
    FtpUtil ftpUtil;
/*//    @Test
    public void upload() {
        String fileName = "test.pdf";
        ftpUtil.upload(UUID.randomUUID().toString(),fileName,new File("/Users/gepeng/Downloads/template/",fileName));
    }*/

    @Test
    public void download() {
        /*String ftpPath = "/104e1557-9b4d-4c2f-bb3b-d2a9d36d6b65/069b0cad-a29f-44df-873e-63acb3ec4b3d/";
        String destPath = "/Users/gepeng/Downloads/template";
        ftpUtil.download(ftpPath,destPath);*/
        SortedMap<String,Charset> stringCharsetSortedMap =  Charset.availableCharsets();
        Collection<Charset> charsets = stringCharsetSortedMap.values();
        Iterator<Charset> iterator = charsets.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().name());
        }
    }
}