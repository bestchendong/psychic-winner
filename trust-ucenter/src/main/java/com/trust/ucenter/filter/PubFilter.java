package com.trust.ucenter.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
public class PubFilter implements Filter {

    private final static Logger logger = LoggerFactory.getLogger(PubFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest)request;
        String uri = req.getRequestURI();
        logger.info("请求uri："+uri);
        HttpSession httpSession = req.getSession();
        System.out.println("请求 sessionId:"+httpSession.getId());
        StringBuffer url = req.getRequestURL();
        logger.info("请求url："+url);
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
