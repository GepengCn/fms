package com.itonglian.fms.service.bean;

public enum CommentType{
    yldps("yldps"),
    jldps("jldps"),
    bmfzryj("bmfzryj"),
    qfyj("qfyj"),
    shyj("shyj"),
    clyj("clyj"),
    unknown("unknown")
    ;
    private String value;
    CommentType(String value) {
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }

    public static CommentType parse(String value){
        switch (value){
            case "yldps":
                return yldps;
            case "jldps":
                return jldps;
            case "bmfzryj":
                return bmfzryj;
            case "qfyj":
                return qfyj;
            case "shyj":
                return shyj;
            case "clyj":
                return clyj;
            default:
                return unknown;
        }
    }
}