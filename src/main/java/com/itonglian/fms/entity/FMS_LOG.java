package com.itonglian.fms.entity;

public class FMS_LOG {
    private String id;

    private String taskid;

    private String location;

    private String description;

    private String classname;

    private String methodname;

    private String arguments;

    private String result;

    private String starttime;

    private String endtime;

    private String exectime;

    private String exception;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname == null ? null : methodname.trim();
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments == null ? null : arguments.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getExectime() {
        return exectime;
    }

    public void setExectime(String exectime) {
        this.exectime = exectime == null ? null : exectime.trim();
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }

    public String format() {
        return "流程ID: {},注解位置: {}, 方法描述: {}, 目标类名: {}, 目标方法: {}, 调用参数: {}, 返回结果: {}, 开始时间: {},结束时间: {},花费时间: {},异常信息: {}";
    }

    public Object[] args() {
        return new Object[]{this.taskid, this.location, this.description, this.classname, this.methodname, this.arguments, this.result, this.starttime,this.endtime,this.exectime,this.exception};
    }
}