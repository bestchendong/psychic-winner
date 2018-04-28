package com.trust.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
*@Author Yangcb
*@Descrintion Spring
*@Date create 2018/3/21 17:01
*@Version 1.0
*/
@Component
class WebConfigurer extends WebMvcConfigurerAdapter {
	@Autowired
	TrustRntConfig trustRntConfig;
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/files/**").addResourceLocations("file:///"+trustRntConfig.getUploadpath());
	}

}