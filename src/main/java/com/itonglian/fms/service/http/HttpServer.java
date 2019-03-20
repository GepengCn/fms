package com.itonglian.fms.service.http;

import org.joda.time.DateTime;

import java.io.IOException;

public interface HttpServer {

    String getResult(DateTime startDate, DateTime endDate) throws Exception;

    String getResult() throws Exception;

    String getResult(String startDate, String endDate) throws Exception;

    String findThenUpdate(String startDate, String endDate) throws IOException;

}
