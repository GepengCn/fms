package com.itonglian.fms.service.http.impl;

import com.alibaba.fastjson.JSON;
import com.itonglian.fms.bean.BackResult;
import com.itonglian.fms.config.services.ServiceManager;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.service.FmsTaskService;
import com.itonglian.fms.service.bean.FileStatus;
import com.itonglian.fms.service.common.FileStatusManager;
import com.itonglian.fms.service.http.HttpServer;
import com.itonglian.fms.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
@Slf4j
public class HttpServerImpl implements HttpServer {

    @Autowired
    ServiceManager serviceManager;

    @Autowired
    FileStatusManager fileStatusManager;

    @Autowired
    FmsTaskService fmsTaskService;


    @Override
    public void getResult(DateTime startDate, DateTime endDate) throws Exception{
        getResult(DateUtils.toStringDate(startDate),DateUtils.toStringDate(endDate));

    }

    @Override
    public void getResult() throws Exception{
        DateTime endDate = DateTime.now();
        DateTime startDate = endDate.minusDays(1);
        getResult(DateUtils.toStringDate(startDate),DateUtils.toStringDate(endDate));
    }

    @Override
    public void getResult(String startDate, String endDate) throws Exception{
        log.info("执行业务处理逻辑:"+new Date());
        String result = serviceManager.execute(startDate,endDate);
        BackResult backResult = JSON.parseObject(result,BackResult.class);
        if(backResult.getCode()!=0){
            throw new Exception(backResult.getCodeInfo());
        }
        List<BackResult.DataBean> dataBeanList = backResult.getDataList();

        if(dataBeanList==null||dataBeanList.size()==0){
            return;
        }
        Iterator<BackResult.DataBean> iterator = dataBeanList.iterator();

        while(iterator.hasNext()){
            BackResult.DataBean dataBean = iterator.next();

            FMS_TASK fmsTask = fmsTaskService.selectByTaskId(dataBean.getId());

            if(dataBean.getGdzt()==0){
                fileStatusManager.setStatus(fmsTask, FileStatus.STATUS_300);
            }else{
                fileStatusManager.setStatus(fmsTask, FileStatus.STATUS_301);
            }

        }
    }
}
