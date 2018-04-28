package com.trust.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan({"com.trust.admin.*.dao"})
@ComponentScan({"com.trust.admin.*"})
@EnableEurekaClient
public class UcenterAdminApplication extends SpringBootServletInitializer{

	public UcenterAdminApplication() {
	}

	public static void main(String[] args) {
		SpringApplication.run(UcenterAdminApplication.class, args);
	}
}
