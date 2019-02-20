package com.itonglian.fms.entity;

public class FMS_FILEWithBLOBs extends FMS_FILE {
    private byte[] commondata;

    private byte[] customizeddata;

    public byte[] getCommondata() {
        return commondata;
    }

    public void setCommondata(byte[] commondata) {
        this.commondata = commondata;
    }

    public byte[] getCustomizeddata() {
        return customizeddata;
    }

    public void setCustomizeddata(byte[] customizeddata) {
        this.customizeddata = customizeddata;
    }
}