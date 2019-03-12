package com.itonglian.fms.service.common;

import com.google.common.util.concurrent.*;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.Param;
import org.springframework.stereotype.Component;

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

    public abstract Param customizedImpl(Param param,FMS_TASK fmsTask) throws Exception;

}
