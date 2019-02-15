package com.itonglian.fms.service.cxf.impl;

import com.itonglian.fms.service.cxf.CxfService;

import javax.jws.WebService;

@WebService(targetNamespace="http://coolweb.club/",endpointInterface = "com.itonglian.fms.service.cxf.CxfService")
public class CxfServiceImpl implements CxfService {
    @Override
    public String getInfo() {
        return "cxf,ok";
    }
}
