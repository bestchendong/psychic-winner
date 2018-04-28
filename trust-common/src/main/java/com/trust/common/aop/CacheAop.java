package com.trust.common.aop;

import com.trust.common.annotation.CacheAnnotation;
import com.trust.common.constant.cache.CacheConstants;
import com.trust.common.utils.cache.CacheUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 唐亮
 * @create 2018-03-01 9:19
 * @desc 缓存环绕AOP
 **/
@Aspect
@Component
@Order(1)
public class CacheAop {

    public CacheAop(){
        //System.out.println("============ CacheAop ===========");
    }

    @Around(value = "@annotation(cacheAnnotation)")
    public Object cacheAround(ProceedingJoinPoint jp,CacheAnnotation cacheAnnotation) {
        Object result;
        Object[] args = jp.getArgs();
        MethodSignature methodSignature = (MethodSignature) jp.getSignature();
        Method method = methodSignature.getMethod();
        //获取缓存对象
        CacheUtil cache = CacheUtil.getInstance();
        //目标方法上的注解
        CacheConstants operationType = cacheAnnotation.operationType();
        String moduleName = cacheAnnotation.moduleName();
        try {
            //查询操作
            if (operationType.equals(CacheConstants.operationType_query)){
                String innerKey = method.getName();
                //缓存数据结构：map< muduleName , map<methodName+args, Object> >
                if (cache.contains(moduleName)){
                    System.out.println("==================== 操作缓存 ====================");
                    Map<String, Object> cacheValue = (Map<String, Object>) (cache.get(moduleName));
                    if (args!=null && args.length!=0){
                        for (Object arg : args) {
                            innerKey = innerKey + arg;
                        }
                    }
                    if (cacheValue.containsKey(innerKey)){
                        System.out.println("==================== 缓存数据 ====================");
                        result = cacheValue.get(innerKey);
                    }else{
                        System.out.println("==================== 添加小缓存 ====================");
                        result = jp.proceed();
                        cacheValue.put(innerKey,result);
                    }
                }else{
                    System.out.println("==================== 添加大缓存 ====================");
                    result = jp.proceed();
                    HashMap<String, Object> cacheValue = new HashMap<>();
                    if (args!=null && args.length!=0){
                        for (Object arg : args) {
                            innerKey = innerKey + arg;
                        }
                    }
                    cacheValue.put(innerKey,result);
                    System.out.println("==================== 添加小缓存 ====================");
                    cache.put(moduleName,cacheValue);
                }
                //其他操作
            }else{
                System.out.println("==================== 未操作缓存 ====================");
                if (args!=null && args.length!=0){
                    result = jp.proceed(args);
                }else{
                    result = jp.proceed();
                }
                //非查询操作删除缓存
                cache.remove(moduleName);
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
        return result;
    }
}
