package com.itonglian.fms.service.common.task;

import com.itonglian.fms.entity.WF_INFOR;
import com.itonglian.fms.entity.WF_INFORExample;
import com.itonglian.fms.log.OperationLog;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.WfInforService;
import com.itonglian.fms.service.bean.HandlerDetail;
import com.itonglian.fms.service.bean.Param;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CommonTask {

    @Autowired
    WfInforService wfInforService;

    @Autowired
    SysUsersService sysUsersService;

    @OperationLog(description = "查询办理详情")
    public List<HandlerDetail> setHandlerDetailList(String taskId,Param param) throws Exception {
        WF_INFORExample wfInforExample = new WF_INFORExample();
        wfInforExample.or().andWi01EqualTo(Long.parseLong(param.getTaskId()));
        List<WF_INFOR> wfInforList = wfInforService.selectByExample(wfInforExample);
        Iterator<WF_INFOR> iterator = wfInforList.iterator();
        List<HandlerDetail> handlerDetailList = new ArrayList<>();
        while(iterator.hasNext()){
            WF_INFOR wfInfor = iterator.next();
            HandlerDetail handlerDetail = new HandlerDetail();
            handlerDetail.setHandlerUser(sysUsersService.findNameByPrimaryKey(wfInfor.getWi05()));
            handlerDetail.setLastHandlerUser(sysUsersService.findNameByPrimaryKey(wfInfor.getWi15()));
            handlerDetail.setHandlerComment(wfInfor.getWi20());
            handlerDetail.setHandlerStatus(wfInfor.getWi13());
            handlerDetail.setHandlerTime(new DateTime(wfInfor.getWi11()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
            handlerDetail.setSendTime(new DateTime(wfInfor.getWi08()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
            handlerDetailList.add(handlerDetail);
        }
        return handlerDetailList;
    }

}
