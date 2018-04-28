package com.trust.admin.mgt.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据库连接配置
 *
 */
@Configuration
public class DataSourcesConfig {
    @Autowired
    Druid druid;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(druid.getDriverClass());
        dataSource.setUrl(druid.getUrl());
        dataSource.setUsername(druid.getUsername());
        dataSource.setPassword(druid.getPassword());
        dataSource.setMaxActive(druid.getMaxActive());
        dataSource.setInitialSize(druid.getInitialSize());
        dataSource.setMaxWait(druid.getMaxWait());
        dataSource.setMinIdle(druid.getMinIdle());
        dataSource.setTimeBetweenEvictionRunsMillis(druid.getTimeBetweenEvictionRunsMillis());
        dataSource.setMinEvictableIdleTimeMillis(druid.getMinEvictableIdleTimeMillis());
        dataSource.setValidationQuery(druid.getValidationQuery());
        dataSource.setTestWhileIdle(druid.getTestWhileIdle());
        dataSource.setTestOnBorrow(druid.getTestOnBorrow());
        dataSource.setTestOnReturn(druid.getTestOnReturn());
        try {
            dataSource.setFilters(druid.getFilters());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    /**
     * druid监控
     *
     * @return
     */
    @Bean
    protected ServletRegistrationBean druidServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        Collection<String> urlMappings = new ArrayList<String>();
        urlMappings.add("/druid/*");
        servletRegistrationBean.setUrlMappings(urlMappings);
        servletRegistrationBean.setServlet(new StatViewServlet());
        Map<String, String> initParameters = new HashMap<>();
        initParameters.put("allow", "127.0.0.1");// IP白名单
        // (没有配置或者为空，则允许所有访问)
        initParameters.put("deny", "");// IP黑名单
        // (存在共同时，deny优先于allow)
        initParameters.put("loginUsername", druid.getLoginUsername());// 用户名
        initParameters.put("loginPassword", druid.getLoginPassword());// 密码
        initParameters.put("resetEnable", "false");// 禁用HTML页面上的“Reset All”功能
        servletRegistrationBean.setInitParameters(initParameters);
        return servletRegistrationBean;
    }
}
