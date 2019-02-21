package com.itonglian.fms.entity;

public class FMS_DATAWithBLOBs extends FMS_DATA {
    private byte[] common;

    private byte[] customized;

    public byte[] getCommon() {
        return common;
    }

    public void setCommon(byte[] common) {
        this.common = common;
    }

    public byte[] getCustomized() {
        return customized;
    }

    public void setCustomized(byte[] customized) {
        this.customized = customized;
    }
}