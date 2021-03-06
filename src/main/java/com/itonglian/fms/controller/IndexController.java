package com.itonglian.fms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public ModelAndView index(){
        return new ModelAndView("redirect:/dataController/dataIndex");
    }

    @RequestMapping(value = "/demo")
    public String demo(){
        return "table-list";
    }
}
