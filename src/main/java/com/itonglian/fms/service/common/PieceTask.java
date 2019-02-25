package com.itonglian.fms.service.common;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
@Slf4j
public abstract class PieceTask implements Callable<Boolean> {

    protected CountDownLatch countDownLatch;

    protected FuturePieceTask futurePieceTask;

    public PieceTask(CountDownLatch countDownLatch,FuturePieceTask futurePieceTask) {
        this.countDownLatch = countDownLatch;
        this.futurePieceTask = futurePieceTask;
    }


    protected boolean execute(){
        try {
            apply();
        }catch (Exception e){
            log.error("error",e);
            return false;
        }finally {
            countDownLatch.countDown();
        }
        return true;
    }

    protected abstract void apply() throws Exception;


    @Override
    public Boolean call() throws Exception {
        try {
            return execute();
        }catch (Exception e){
            log.error("error",e);
            return false;
        }
    }
}
