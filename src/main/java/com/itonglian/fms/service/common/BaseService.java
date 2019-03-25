package com.itonglian.fms.service.common;

import com.google.common.util.concurrent.*;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.WF_INFOR;
import com.itonglian.fms.entity.WF_INFORExample;
import com.itonglian.fms.log.OperationLog;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.WfInforService;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.HandlerDetail;
import com.itonglian.fms.service.bean.Param;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

@Component
public abstract class BaseService {

    public abstract FileType getType();


    protected static ListeningExecutorService executorService = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(200));

    public void execute(FMS_TASK fmsTask, FutureCallback<Param> futureCallback){
        ListenableFuture<Param> listenableFuture = executorService.submit(new Task(fmsTask));
        Futures.addCallback(listenableFuture,futureCallback,executorService);
    }


    private Param commonImpl(Param param,FMS_TASK fmsTask) throws Exception{
        param.setTaskId(fmsTask.getTaskid());
        int type = Integer.parseInt(fmsTask.getFiletype());
        param.setType(type);
        param.setCourt(0);
        param.setTitle(fmsTask.getTitle());
        param.setDrafter(fmsTask.getDraftlogin());
        param.setDrafterName(fmsTask.getDraftname());
        param.setTaskId(fmsTask.getTaskid());
        param.setDraftTime(fmsTask.getCreatetime());
        return param;
    }

    public static  List<HandlerDetail> setHandlerDetailList(WfInforService wfInforService, Param param, SysUsersService sysUsersService){
        WF_INFORExample wfInforExample = new WF_INFORExample();
        wfInforExample.or().andWi01EqualTo(Long.parseLong(param.getTaskId()));
        List<WF_INFOR> wfInforList = wfInforService.selectByExample(wfInforExample);
        Iterator<WF_INFOR> iterator = wfInforList.iterator();
        List<HandlerDetail> handlerDetailList = new ArrayList<>();
        while(iterator.hasNext()){
            WF_INFOR wfInfor = iterator.next();
            HandlerDetail handlerDetail = new HandlerDetail();
            if(wfInfor.getWi05()!=null){
                handlerDetail.setHandlerUser(sysUsersService.selectByPrimaryKey(Long.parseLong(wfInfor.getWi05())).getSu02());
            }
            handlerDetail.setLastHandlerUser(sysUsersService.selectByPrimaryKey(Long.parseLong(wfInfor.getWi15())).getSu02());
            handlerDetail.setHandlerComment(wfInfor.getWi20());
            handlerDetail.setHandlerStatus(wfInfor.getWi13());
            handlerDetail.setHandlerTime(new DateTime(wfInfor.getWi11()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
            handlerDetail.setSendTime(new DateTime(wfInfor.getWi08()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
            handlerDetailList.add(handlerDetail);
        }
        return handlerDetailList;
    }

    private class Task implements Callable<Param> {

        private Param param;
        private FMS_TASK fmsTask;
        public Task(FMS_TASK fmsTask) {
            this.fmsTask = fmsTask;
            param = new Param();
        }
        @Override
        public Param call() throws Exception {
            //实现公共数据封装
            param = commonImpl(param,fmsTask);
            //延迟个性化数据实现
            param = customizedImpl(param,fmsTask);
            return param;
        }
    }
    @OperationLog(description = "customizedImpl")
    public abstract Param customizedImpl(Param param,FMS_TASK fmsTask) throws Exception;

}
