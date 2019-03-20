package com.itonglian.fms.entity;

public class FMS_TASK {
    private Long id;

    private String taskid;

    private String draftlogin;

    private String draftname;

    private Long status;

    private String createtime;

    private String modifytime;

    private String textpath;

    private String attachpath;

    private String filetype;

    private String title;

    private String textname;

    private String attachname;

    private String parentroot;

    private String dataid;

    private String prologin;

    private String proname;

    private String protime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
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

    public String getParentroot() {
        return parentroot;
    }

    public void setParentroot(String parentroot) {
        this.parentroot = parentroot == null ? null : parentroot.trim();
    }

    public String getDataid() {
        return dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid == null ? null : dataid.trim();
    }

    public String getPrologin() {
        return prologin;
    }

    public void setPrologin(String prologin) {
        this.prologin = prologin == null ? null : prologin.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getProtime() {
        return protime;
    }

    public void setProtime(String protime) {
        this.protime = protime == null ? null : protime.trim();
    }
}