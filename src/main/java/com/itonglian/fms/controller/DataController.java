package com.itonglian.fms.controller;

import com.alibaba.fastjson.JSON;
import com.itonglian.fms.entity.FMS_DATAExample;
import com.itonglian.fms.entity.FMS_DATAWithBLOBs;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.FMS_TASKExample;
import com.itonglian.fms.service.FmsDataService;
import com.itonglian.fms.service.FmsTaskService;
import com.itonglian.fms.service.bean.FileStatus;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.common.FileStatusManager;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
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
    @RequestMapping("findAll")
    public String findAll() {
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

        return JSON.toJSONString(resultList);
    }
}
