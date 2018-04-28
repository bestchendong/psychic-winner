package com.trust.constant.log;

public enum RntOperationLogLevel {

    first("1"),second("2"),third("3"),fourth("4");

    private String temp = null;

    private RntOperationLogLevel(String str){
        this.temp = str;
    }
    public String toString(){
        return temp;
    }
}
