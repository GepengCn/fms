package com.itonglian.fms.service.cxf;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CxfService {

    @WebMethod
    String getInfo();
}
