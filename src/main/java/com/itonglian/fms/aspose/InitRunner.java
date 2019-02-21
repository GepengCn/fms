package com.itonglian.fms.aspose;

import com.aspose.words.License;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;

@Component
@Order(5)
@Slf4j
public class InitRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        License lic = new License();
        try {
            lic.setLicense(new FileInputStream(ResourceUtils.getFile("classpath:Aspose.Words18.lic")));
            log.info("已注册Aspose证书...");
        } catch (Exception e) {
            log.error("error",e);
        }
    }
}
