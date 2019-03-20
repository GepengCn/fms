package com.itonglian.fms.controller;

import com.itonglian.fms.service.http.HttpServer;
import lombok.AllArgsConstructor;
import lombok.Data;
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
    public Result getResult() {
        try {
            String info = httpServer.getResult();
            return new Result(0,info);
        } catch (Exception e) {
            log.error("Exception",e);
            return new Result(-1,e.getMessage());
        }
    }

    @RequestMapping("/getResultBetween")
    @ResponseBody
    public Result getResultBetween(String startDate,String endDate) {
        try {
            String info = httpServer.getResult(startDate,endDate);
            return new Result(0,info);
        } catch (Exception e) {
            log.error("Exception",e);
            return new Result(-1,e.getMessage());
        }
    }

    @RequestMapping("serverIndex")
    public ModelAndView serverIndex() {
        ModelAndView modelAndView = new ModelAndView("server");
        return modelAndView;
    }

    @RequestMapping("/findThenUpdate")
    @ResponseBody
    public Result findThenUpdate(String startDate,String endDate) {
        try {
            String info = httpServer.findThenUpdate(startDate,endDate);
            return new Result(0,info);
        } catch (Exception e) {
            log.error("Exception",e);
            return new Result(-1,e.getMessage());
        }
    }

    @Data
    @AllArgsConstructor
    public class Result{
        private int code;
        private String info;
    }

}
