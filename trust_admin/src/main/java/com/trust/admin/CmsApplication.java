package com.trust.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.trust.dao")
public class CmsApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CmsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
    }

    /**
     * 设定启动端口
     *
     * @param configurableEmbeddedServletContainer
     */
    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8080);

    }
}