package com.trust.gateway.filter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.trust.common.model.UserInfoVo;
import com.trust.gateway.common.VerifyUtil;
import com.trust.gateway.service.ucenter.JwtService;
import com.trust.gateway.service.ucenter.UcUserService;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bob.Zhu
 */
@Component
public class AuthenticationFilter extends ZuulFilter {

    @Autowired
    JwtService jwtService;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    UcUserService ucUserService;

    private static final Logger log = LoggerFactory.getLogger(AuthenticationFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 100;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpSession httpSession = requestContext.getRequest().getSession(true);
        System.out.println("httpSession:"+httpSession);
        HttpServletRequest request = requestContext.getRequest();
        HttpServletResponse response = requestContext.getResponse();
        response.setContentType("application/json;charset=UTF-8");
        if (null != httpSession) {
            UserInfoVo userInfo = (UserInfoVo) httpSession.getAttribute("userInfo");
            String memberId = "";
            if (null != userInfo) {
                memberId = userInfo.getMemberId();
            }
            log.info("请求zuul路径:" + request.getRequestURI());
            String path = request.getRequestURI();
            Boolean isPass = true;
            Map retMap = new HashMap();
            String jwt = request.getHeader("jwt");
            PrintWriter writer = null;
            if (path.contains("/user/user/login")) {
                String loginName = request.getParameter("loginName");
                if(loginName==null || "".equals(loginName)){
                    loginName = request.getParameter("phone");
                }
                if(loginName!=null && !"".equals(loginName)){
                    Integer userId = ucUserService.getUserIdByLoginName(loginName);
                    SetOperations setOperations = redisTemplate.opsForSet();
                    if (setOperations.isMember("blackSet", userId)) {//如果在黑名单
                        retMap.put("code", "500");
                        retMap.put("msg", "已入黑名单");
                        retMap.put("data", "");
                        isPass = false;
                    }
                }else{
                    retMap.put("code", "500");
                    retMap.put("msg", "登录参数错误");
                    retMap.put("data", "");
                    isPass = false;
                }
            }else{
                if (ifFilter(request.getRequestURI())) {
                    /**
                     * jwt 来校验
                     */
                    if (jwt != null && !"".equals(jwt)) {
                        System.out.println("JwtVerityFilter jwt:" + jwt);
                        String ret = jwtService.verity(jwt);
                        JSONObject jsonObject = JSONObject.parseObject(ret);
                        System.out.println("JwtVerityFilter jsonObject:" + jsonObject);
                        String code = (String) jsonObject.get("code");
                        if ("200".equals(code)) {

                        } else {
                            retMap.put("code", "500");
                            retMap.put("msg", "jwt已失效");
                            retMap.put("data", "");
                            isPass = false;
                        }
                    } else {
                        retMap.put("code", "500");
                        retMap.put("msg", "请先登录");
                        retMap.put("data", "");
                        isPass = false;
                    }
                } else {
                    log.info("该请求不用过滤");
                }
            }

            if (isPass) {
                requestContext.setSendZuulResponse(true);// 对该请求进行路由
                requestContext.setResponseStatusCode(200);
                requestContext.set("isSuccess", true);// 设值，让下一个Filter看到上一个Filter的状态
            } else {
                try {
                    writer = response.getWriter();
                    writer.write(JSON.toJSONString(retMap));
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    writer.flush();
                    writer.close();
                }
                requestContext.setResponseBody(null);
                requestContext.setSendZuulResponse(false);
            }


           /* // 已经登录
            else {
                //在路由中添加header
                String remortIP = getRemortIP(request);
                log.info("登录IP:" + remortIP);
                requestContext.addZuulRequestHeader("terminalIP", remortIP);
                requestContext.addZuulRequestHeader("memberId", memberId);
                requestContext.setSendZuulResponse(true);// 对该请求进行路由
                requestContext.setResponseStatusCode(200);
//                requestContext.set("isSuccess", true);// 设值，让下一个Filter看到上一个Filter的状态
            }*/
        } else {
            //没有Session,属于系统错误,返回505
            requestContext.setResponseStatusCode(HttpStatus.SC_INTERNAL_SERVER_ERROR);
            if (requestContext.getResponseBody() == null) {
                requestContext.setResponseBody(null);
                requestContext.setSendZuulResponse(false);
            }
        }
        return null;
    }

    public boolean ifFilter(String url) {
        return VerifyUtil.valiToken(url);
    }

    public String getRemortIP(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

}
