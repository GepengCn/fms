package com.itonglian.fms.controller;

import com.itonglian.fms.service.http.HttpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("server")
public class ServerController {

    @Autowired
    HttpServer httpServer;
    @RequestMapping("/getResult")
    @ResponseBody
    public void getResult(){
        httpServer.getResult();
    }

    @RequestMapping("/getResultBetween")
    @ResponseBody
    public void getResultBetween(String startDate,String endDate){
        httpServer.getResult(startDate,endDate);
    }

}
