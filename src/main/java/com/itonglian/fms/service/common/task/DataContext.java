package com.itonglian.fms.service.common.task;

import com.itonglian.fms.service.FFGLService;
import com.itonglian.fms.service.WfTaskService;
import com.itonglian.fms.service.bean.Param;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataContext {

    @Autowired
    WfTaskService wfTaskService;

    @Autowired
    FFGLService ffglService;

    public void test(Param param){
        /*WfTask wfTask = wfTaskService.selectByPrimaryKey(Long.parseLong(param.getTaskId()));

        FFGL ffgl = ffglService.selectByPrimaryKey(wfTask.getWt04());

        param.setCustomized(getCustomized(taskId,ffgl));

        param.setHandlerDetailList(setHandlerDetailList(param));*/
    }
}
