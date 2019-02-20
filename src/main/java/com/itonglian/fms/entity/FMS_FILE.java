package com.itonglian.fms.entity;

public class FMS_FILE {
    private String id;

    private String taskid;

    private String draftlogin;

    private String draftname;

    private Long status;

    private String createtime;

    private String modifytime;

    private String textpath;

    private String attachpath;

    private Long filetype;

    private String title;

    private String textname;

    private String attachname;

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

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
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

    public Long getFiletype() {
        return filetype;
    }

    public void setFiletype(Long filetype) {
        this.filetype = filetype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTextname() {
        return textname;
    }

    public void setTextname(String textname) {
        this.textname = textname == null ? null : textname.trim();
    }

    public String getAttachname() {
        return attachname;
    }

    public void setAttachname(String attachname) {
        this.attachname = attachname == null ? null : attachname.trim();
    }
}