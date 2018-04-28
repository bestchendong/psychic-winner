package com.trust.common.exception;

import com.alibaba.druid.support.json.JSONUtils;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Yangcb
 * @Descrintion 统一异常处理
 * @Date create 2017-11-16 15:54
 * @Version 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    protected Logger logger = Logger.getLogger(this.getClass());

    public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(javax.servlet.http.HttpServletRequest request, HttpServletResponse response, Object object, Exception exception) {
        // 判断是否ajax请求
        if (!(request.getHeader("accept").indexOf("application/json") > -1 || (request
                .getHeader("X-Requested-With") != null && request.getHeader(
                "X-Requested-With").indexOf("XMLHttpRequest") > -1))) {
            // 如果不是ajax，模板渲染格式返回
            // 为安全起见，只有业务异常我们对前端可见，否则否则统一归为系统异常
            Map<String, Object> map = new HashMap<String,Object>();
            map.put("success", false);
            if (exception instanceof Object) {
                map.put("errorMsg", exception.getMessage());
            } else {
                map.put("errorMsg", "系统异常！");
            }
            //这里需要手动将异常打印出来，由于没有配置log，实际生产环境应该打印到log里面
            exception.printStackTrace();
            //对于非ajax请求，我们都统一跳转到error页面
            return new ModelAndView("/error", map);
        } else {
            // 如果是ajax请求，JSON格式返回
            try {
                response.setContentType("application/json;charset=UTF-8");
                PrintWriter writer = response.getWriter();
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("success", false);
                // 为安全起见，只有业务异常我们对前端可见，否则统一归为系统异常
                if (exception instanceof Object) {
                    map.put("errorMsg", exception.getMessage());
                } else {
                    map.put("errorMsg", "系统异常！");
                }
                writer.write(JSONUtils.toJSONString(map));
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }





}
