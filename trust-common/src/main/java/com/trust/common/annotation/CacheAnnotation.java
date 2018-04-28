package com.trust.common.annotation;


import com.trust.common.constant.cache.CacheConstants;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface CacheAnnotation {

    //操作类型
    public CacheConstants operationType() default CacheConstants.operationType_query;

    //缓存map外部key
    public String moduleName();

}
