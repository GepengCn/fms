package com.itonglian.fms.service.common;

import com.google.common.util.concurrent.*;
import com.itonglian.fms.entity.FMS_FILE;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.FtpList;
import com.itonglian.fms.service.bean.Param;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

@Component
public abstract class BaseService {

    public abstract FileType getType();


    protected static ListeningExecutorService executorService = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(200));

    public void execute(FMS_FILE fmsFile,FutureCallback<Param> futureCallback){
        ListenableFuture<Param> listenableFuture = executorService.submit(new Task(fmsFile));
        Futures.addCallback(listenableFuture,futureCallback,executorService);
    }


    private Param commonImpl(Param param,FMS_FILE fmsFile) throws Exception{
        param.setTaskId(fmsFile.getTaskid());
        int type = fmsFile.getFiletype().intValue();
        param.setType(type);
        param.setTitle(fmsFile.getTitle());
        param.setDrafter(fmsFile.getDraftlogin());
        param.setDrafterName(fmsFile.getDraftname());
        param.setTaskId(fmsFile.getTaskid());
        FtpList ftpList = new FtpList();
        ftpList.setDocFtp(new FtpList.FtpDetail(fmsFile.getTextpath(),fmsFile.getTextname()));
        ftpList.setAttFtp(new FtpList.FtpDetail(fmsFile.getAttachpath(),fmsFile.getAttachname()));
        return param;
    }

    private class Task implements Callable<Param> {

        private Param param;
        private FMS_FILE fmsFile;
        public Task(FMS_FILE fmsFile) {
            this.fmsFile = fmsFile;
        }
        @Override
        public Param call() throws Exception {
            //实现公共数据封装
            param = commonImpl(param,fmsFile);
            //延迟个性化数据实现
            param = customizedImpl(param);
            return param;
        }
    }

    public abstract Param customizedImpl(Param param) throws Exception;

}
