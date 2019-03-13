package com.itonglian.fms.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class DateUtils {

    public static String toStringDate(DateTime dateTime){
        return dateTime.toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
