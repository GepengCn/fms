package com.itonglian.fms.config.template;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:template.properties"},ignoreResourceNotFound = true,encoding = "UTF-8")
@ConfigurationProperties(prefix = "template")
@Data
public class TemplateConfig {

    private String formPath;

    private String docPath;

    private String attPath;

    private String coverPath;

    private String catalogPath;

    private String refFtpPath;
}
