package com.itonglian.fms.config.ftp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:ftp.properties"},ignoreResourceNotFound = true,encoding = "UTF-8")
@ConfigurationProperties(prefix = "ftp")
@Data
public class FtpConfig {

    private String host;

    private String port;

    private String username;

    private String password;
}
