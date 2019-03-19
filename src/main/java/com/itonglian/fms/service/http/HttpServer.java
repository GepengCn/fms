package com.itonglian.fms.service.http;

import org.joda.time.DateTime;

public interface HttpServer {

    void getResult(DateTime startDate, DateTime endDate);

    void getResult();

    void getResult(String startDate, String endDate);

}
