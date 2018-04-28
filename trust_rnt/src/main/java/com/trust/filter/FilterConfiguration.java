package com.trust.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Yangcb
 * @Descrintion 注册过滤器类
 * @Date create 2018-01-31 14:24
 * @Version 1.0
 */
@Configuration
public class FilterConfiguration {
    @Bean
    public FilterRegistrationBean filterRegistertion(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        //注入过滤器
        registrationBean.setFilter(new ApiOriginFilter());
        //拦截规则
        //registrationBean.addUrlPatterns("*.*");
        registrationBean.addUrlPatterns("/*");//拦截所有
        //过滤器名称
        registrationBean.setName("ApiOriginFilter");
        //是否自动注册 false 取消 filter的自动注册
        registrationBean.setEnabled(true);
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
