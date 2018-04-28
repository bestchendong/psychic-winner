package com.trust.common.annotation;

import com.trust.constant.log.RntOperationLogLevel;
import com.trust.constant.log.RntOperationLogModule;

import java.lang.annotation.*;

/**
 * @author 唐亮
 * @create 2018-03-16 16:26
 * @desc 操作日志：日志添加相关设置（设置在调用日志接口的方法上）
 **/
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface OperationLogDes {

    //模块名称
    public RntOperationLogModule moduleName() default RntOperationLogModule.notSet;

    //查看级别
    public RntOperationLogLevel checkLevel() default RntOperationLogLevel.first;

    //操作编码
    public RntOperationLogLevel code() default RntOperationLogLevel.first;

    //备注
    public RntOperationLogLevel remarks() default RntOperationLogLevel.first;

    //状态
    public RntOperationLogLevel status() default RntOperationLogLevel.first;

}
