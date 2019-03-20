package com.itonglian.fms.controller;

import com.itonglian.fms.service.http.HttpServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("server")
@Slf4j
public class ServerController {

    @Autowired
    HttpServer httpServer;
    @RequestMapping("/getResult")
    @ResponseBody
    public void getResult() throws Exception {
        httpServer.getResult();
    }

    @RequestMapping("/getResultBetween")
    @ResponseBody
    public int getResultBetween(String startDate,String endDate) {
        try {
            httpServer.getResult(startDate,endDate);
        } catch (Exception e) {
            log.error("Exception",e);
            return -1;
        }
        return 0;
    }

    @RequestMapping("serverIndex")
    public ModelAndView serverIndex() {
        ModelAndView modelAndView = new ModelAndView("server");
        return modelAndView;
    }

    @RequestMapping("/findThenUpdate")
    @ResponseBody
    public int findThenUpdate(String startDate,String endDate) {
        try {
            httpServer.findThenUpdate(startDate,endDate);
        } catch (Exception e) {
            log.error("Exception",e);
            return -1;
        }
        return 0;
    }

}
