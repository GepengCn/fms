package com.itonglian.fms.service.http;

import org.joda.time.DateTime;

public interface HttpServer {

    void getResult(DateTime startDate, DateTime endDate) throws Exception;

    void getResult() throws Exception;

    void getResult(String startDate, String endDate) throws Exception;

    void findThenUpdate(String startDate, String endDate);

}
