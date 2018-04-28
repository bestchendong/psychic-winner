package com.trust.constant.log;

public enum RntOperationLogType {

    add("add"),delete("delete"),edit("edit"),query("query");

    private String temp = null;

    private RntOperationLogType(String str){
        this.temp = str;
    }

    public String toString(){
        return temp;
    }
}
