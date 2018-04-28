package com.trust;

import feign.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/**
*@Author Yangcb
*@Descrintion 启动入口类
*@Date create 2018/3/21 17:13
*@Version 1.0
*/
@ComponentScan
@EnableEurekaClient
@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@EnableFeignClients
@EnableAspectJAutoProxy
@MapperScan(basePackages = {"com.trust.dao","com.trust.entity"})
public class TrustRntApplication extends SpringBootServletInitializer{

    /**
     * feign日志
     * @return
     */
   @Bean
   public Logger.Level feignLoggerLevel(){
       return Logger.Level.FULL;
   }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TrustRntApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TrustRntApplication.class, args);
    }


}