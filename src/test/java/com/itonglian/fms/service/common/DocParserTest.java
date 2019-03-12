package com.itonglian.fms.service.common;

import com.itonglian.fms.service.bean.FtpFile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DocParserTest {

    @Autowired
    DocParser docParser;
    @Test
    public void execute() {
        try {
            docParser.execute(new FtpFile("/20f6a355-4c41-465e-9c94-bb66f678c1b4/98ee3478-8c42-4151-bea5-97d2c729236b","引入正文.doc",3,3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}