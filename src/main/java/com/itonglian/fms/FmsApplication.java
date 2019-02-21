package com.itonglian.fms;

import com.itonglian.fms.config.ftp.FtpConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@ServletComponentScan
@SpringBootApplication
@EnableConfigurationProperties(FtpConfig.class)
//@MapperScan({"com.itonglian.fms.dao.primary","com.itonglian.fms.dao.feapp5"})
public class FmsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FmsApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(FmsApplication.class);
	}
}

