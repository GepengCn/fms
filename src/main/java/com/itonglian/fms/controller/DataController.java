package com.itonglian.fms.controller;

import com.alibaba.fastjson.JSONObject;
import com.itonglian.fms.entity.FMS_DATAExample;
import com.itonglian.fms.entity.FMS_DATAWithBLOBs;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.FMS_TASKExample;
import com.itonglian.fms.service.FmsDataService;
import com.itonglian.fms.service.FmsTaskService;
import com.itonglian.fms.service.bean.FileStatus;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.FileStatusManager;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("dataController")
@Slf4j
public class DataController {

    @Autowired
    FmsDataService fmsDataService;
    @Autowired
    FileStatusManager fileStatusManager;
    @Autowired
    FmsTaskService fmsTaskService;

    @ApiOperation(value="待归档数据查询接口", notes="调用后，归档状态为200(已发送)" ,httpMethod="POST")
    @RequestMapping("findAllThenUpdate")
    public List<String> findAllThenUpdate() {
        FMS_DATAExample fmsDataExample = new FMS_DATAExample();
        fmsDataExample.or().andDrEqualTo("N");
        List<FMS_DATAWithBLOBs> fmsDataList = fmsDataService.selectByExampleWithBLOBs(fmsDataExample);
        List<String> resultList = new ArrayList<>();
        Iterator<FMS_DATAWithBLOBs> iterator = fmsDataList.iterator();
        while(iterator.hasNext()){
            FMS_DATAWithBLOBs fmsData = iterator.next();
            resultList.add(new String(fmsData.getCommon(), Charset.forName("UTF-8")));
            FMS_TASKExample fmsTaskExample = new FMS_TASKExample();
            fmsTaskExample.or().andDataidEqualTo(fmsData.getDataid());
            List<FMS_TASK> fmsTaskList = fmsTaskService.selectByExample(fmsTaskExample);
            Iterator<FMS_TASK> iterator1 = fmsTaskList.iterator();
            while(iterator1.hasNext()){
                FMS_TASK fmsTask = iterator1.next();
                try {
                    fmsTask.setStatus(FileStatus.STATUS_200.getStatus());
                    fmsTaskService.updateByPrimaryKey(fmsTask);
                    fmsData.setDr("Y");
                    fmsDataService.updateByPrimaryKey(fmsData);
                }catch (Exception e){
                    log.error("error",e);
                    fmsTask.setStatus(FileStatus.STATUS_201.getStatus());
                }
            }
        }

        return resultList;
    }
    @ApiOperation(value="待归档数据查询接口", notes="查询不会更新",httpMethod="POST")
    @RequestMapping("findAll")
    public List<String> findAll() {
        FMS_DATAExample fmsDataExample = new FMS_DATAExample();
        fmsDataExample.or().andDrEqualTo("N");
        List<FMS_DATAWithBLOBs> fmsDataList = fmsDataService.selectByExampleWithBLOBs(fmsDataExample);
        List<String> resultList = new ArrayList<>();
        Iterator<FMS_DATAWithBLOBs> iterator = fmsDataList.iterator();
        while(iterator.hasNext()){
            FMS_DATAWithBLOBs fmsData = iterator.next();
            resultList.add(new String(fmsData.getCommon(), Charset.forName("UTF-8")));
        }

        return resultList;
    }


    @RequestMapping("dataIndex")
    public ModelAndView dataIndex() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<FMS_TASK> fmsTaskList = fmsTaskService.selectByExample(new FMS_TASKExample());
        modelAndView.addObject("datas",fmsTaskList);
        return modelAndView;
    }

    @RequestMapping("detail")
    public String detail(String dataId, Model model) {
        FMS_DATAExample fmsDataExample = new FMS_DATAExample();
        fmsDataExample.or().andDataidEqualTo(dataId);
        FMS_DATAWithBLOBs fmsData = fmsDataService.selectByPrimaryKey(dataId);
        Param params = JSONObject.parseObject(new String(fmsData.getCommon(),Charset.forName("UTF-8")), Param.class);
        model.addAttribute("params",params);
        return "detail";
    }
}
