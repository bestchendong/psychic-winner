package com.trust.utils;

public class ResultData extends Result {
    
    public ResultData(String rspCode, String rspMsg) {
        super(rspCode, rspMsg);
    }

    public ResultData(String rspCode, String rspMsg, Object data) {
        super(rspCode, rspMsg);
        this.put("data",data);
    }

}
