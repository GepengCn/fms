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
            docParser.executeZip(new FtpFile("/abc/1f152b02-9571-42d2-a7e1-e10a932d829d","springmvc_day1",3,3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}