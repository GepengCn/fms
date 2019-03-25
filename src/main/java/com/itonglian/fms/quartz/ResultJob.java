package com.itonglian.fms.quartz;

import com.alibaba.fastjson.JSON;
import com.itonglian.fms.bean.BackResult;
import com.itonglian.fms.config.services.ServiceManager;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.WfTask;
import com.itonglian.fms.service.FmsTaskService;
import com.itonglian.fms.service.WfTaskService;
import com.itonglian.fms.service.bean.FileStatus;
import com.itonglian.fms.service.common.FileStatusManager;
import com.itonglian.fms.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
@Slf4j
public class ResultJob {
    /**
     * 业务逻辑
     */
    @Autowired
    ServiceManager serviceManager;

    @Autowired
    FileStatusManager fileStatusManager;

    @Autowired
    FmsTaskService fmsTaskService;

    @Autowired
    WfTaskService wfTaskService;

    public void getResult(){
        log.info("执行业务处理逻辑:"+new Date());
        DateTime endDate = DateTime.now();
        DateTime startDate = endDate.minusDays(1);
        try {
            String result = serviceManager.execute(DateUtils.toStringDate(startDate),DateUtils.toStringDate(endDate));
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

                if(dataBean.getGdzt()==1){
                    fileStatusManager.setStatus(fmsTask, FileStatus.STATUS_300);
                    WfTask wfTask = wfTaskService.selectByPrimaryKey(Long.parseLong(fmsTask.getTaskid()));
                    wfTask.setFileflag(1l);
                    wfTaskService.updateByPrimaryKey(wfTask);
                }else{
                    fileStatusManager.setStatus(fmsTask, FileStatus.STATUS_301);
                    WfTask wfTask = wfTaskService.selectByPrimaryKey(Long.parseLong(fmsTask.getTaskid()));
                    wfTask.setFileflag(2l);
                    wfTaskService.updateByPrimaryKey(wfTask);
                }

            }
        } catch (IOException e) {
            log.error("IOException",e);
        } catch (Exception e) {
            log.error("Exception",e);
        }
    }



}
