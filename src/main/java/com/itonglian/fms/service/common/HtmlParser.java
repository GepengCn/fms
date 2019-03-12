package com.itonglian.fms.service.common;

import org.springframework.stereotype.Component;

@Component
public class HtmlParser {

    public String parseWjbpd(String comment,String time,String author){
        return "<div style=\"padding: 50px;\">\n" +
                "    <div style=\"font-size: 16px;\">"+comment+"</div>\n" +
                "    <div style=\"color: green;font-size: 13px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+author+" "+time+"</div>\n" +
                "</div>";
    }
}
