package com.itonglian.fms.service.common;

import com.google.common.util.concurrent.*;
import com.itonglian.fms.service.bean.Param;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public abstract class BaseService {


    protected static ListeningExecutorService executorService = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(200));

    public void execute(Param param,FutureCallback<String> futureCallback){
        ListenableFuture<String> listenableFuture = executorService.submit(new Task(param));
        Futures.addCallback(listenableFuture,futureCallback,executorService);
    }


    private StringBuilder commonImpl(Param param) throws Exception{
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param.getTaskId());
        return stringBuilder;
    }

    private class Task implements Callable<String> {

        private Param param;
        public Task(Param param) {
            this.param = param;
        }
        @Override
        public String call() throws Exception {
            //实现公共数据封装
            StringBuilder commonString = commonImpl(param);
            //延迟个性化数据实现
            StringBuilder customizedString = customizedImpl(param);
            //合并公共数据与个性化数据
            commonString.append(customizedString);

            return commonString.toString();
        }
    }

    public abstract StringBuilder customizedImpl(Param param) throws Exception;

}
