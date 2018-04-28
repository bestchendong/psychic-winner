package com.trust.filter;

import org.springframework.context.annotation.ComponentScan;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 跨域设置
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-15T03:06:26.991Z")
@ComponentScan
public class ApiOriginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // 支持HTTP 1.1.
        res.setHeader("Pragma", "no-cache"); // 支持HTTP 1.0. response.setHeader("Expires", "0");
        res.setHeader("Access-Control-Allow-Origin", "*");
        res.setHeader("Access-Control-Max-Age", "0");
        res.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
        res.setHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}

