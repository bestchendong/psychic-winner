package com.trust.common.constant.cache;

public enum CacheConstants {

    //缓存操作类型
    operationType_remove("remove"), //清空缓存
    operationType_query("query");   //获取缓存

    private String temp = null;

    private CacheConstants(String str){
        this.temp = str;
    }

    public String toString(){
        return temp;
    }
}
