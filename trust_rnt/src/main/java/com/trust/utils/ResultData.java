package com.trust.utils;

public class ResultData extends Result {
    
    public ResultData(String code, String msg) {
        super(code, msg);
    }

    public ResultData(String code, String msg, Object data) {
        super(code, msg);
        this.put("data",data);
    }

}
