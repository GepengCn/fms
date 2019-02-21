package com.itonglian.fms.service.common;

import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.FMS_TASKExample;
import com.itonglian.fms.service.FmsTaskService;
import com.itonglian.fms.service.bean.FileStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FileStatusManager {

    @Autowired
    FmsTaskService fmsTaskService;


    public void setStatus(FMS_TASK fmsTask, FileStatus fileStatus){
        fmsTask.setStatus(fileStatus.getStatus());
        int result = fmsTaskService.updateByExample(fmsTask,new FMS_TASKExample());
        if(result!=-1){
            log.info("此公文归档状态修改为:"+fileStatus.getStatus());
        }
    }
}
