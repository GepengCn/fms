package com.itonglian.fms.config.services;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:service.properties"},ignoreResourceNotFound = true,encoding = "UTF-8")
@ConfigurationProperties(prefix = "service")
@Data
public class ServiceConfig {

    private String url;
}
