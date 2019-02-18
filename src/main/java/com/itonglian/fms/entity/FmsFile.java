package com.itonglian.fms.entity;

public class FmsFile {
    private String id;

    private String taskid;

    private String draftlogin;

    private String draftname;

    private Integer status;

    private String createtime;

    private String modifytime;

    private String textpath;

    private String attachpath;

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

    public String getDraftlogin() {
        return draftlogin;
    }

    public void setDraftlogin(String draftlogin) {
        this.draftlogin = draftlogin == null ? null : draftlogin.trim();
    }

    public String getDraftname() {
        return draftname;
    }

    public void setDraftname(String draftname) {
        this.draftname = draftname == null ? null : draftname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime == null ? null : modifytime.trim();
    }

    public String getTextpath() {
        return textpath;
    }

    public void setTextpath(String textpath) {
        this.textpath = textpath == null ? null : textpath.trim();
    }

    public String getAttachpath() {
        return attachpath;
    }

    public void setAttachpath(String attachpath) {
        this.attachpath = attachpath == null ? null : attachpath.trim();
    }
}