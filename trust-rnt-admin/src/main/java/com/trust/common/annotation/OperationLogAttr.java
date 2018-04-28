package com.trust.common.annotation;

import java.lang.annotation.*;

/**
 * @author 唐亮
 * @create 2018-03-16 16:26
 * @desc 操作日志：实体属性描述（设置在实体属性上）
 **/
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface OperationLogAttr {

    //属性描述：用在实体类属性上
    public String attributeDes() default "密码";

}
