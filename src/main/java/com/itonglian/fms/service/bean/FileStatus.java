package com.itonglian.fms.service.bean;

public enum FileStatus {

    STATUS_100(100),
    STATUS_101(101),
    STATUS_102(102),
    STATUS_103(103),
    STATUS_200(200),
    STATUS_201(201),
    STATUS_300(300),
    STATUS_301(301);

    private long status;
    FileStatus(long status) {
        this.status = status;
    }

    public long getStatus(){
        return status;
    }
}
