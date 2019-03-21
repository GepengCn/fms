package com.itonglian.fms.log;

import lombok.Data;

import java.io.Serializable;

@Data
public class LogBean implements Serializable {

    private String taskId;

    private String location;

    private String description;

    private String className;

    private String methodName;

    private String arguments;

    private String result;

    private String startTime;

    private String endTime;

    private Long execTime;

    private String exception;

    public String format() {
        return "流程ID: {},注解位置: {}, 方法描述: {}, 目标类名: {}, 目标方法: {}, 调用参数: {}, 返回结果: {}, 开始时间: {},结束时间: {},花费时间: {},异常信息: {}";
    }

    public Object[] args() {
        return new Object[]{this.taskId, this.location, this.description, this.className, this.methodName, this.arguments, this.result, this.startTime,this.endTime,this.execTime,this.exception};
    }
}
