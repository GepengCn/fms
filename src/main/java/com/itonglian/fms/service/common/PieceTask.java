package com.itonglian.fms.service.common;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
@Slf4j
public abstract class PieceTask implements Runnable{

    protected CountDownLatch countDownLatch;

    protected FuturePieceTask futurePieceTask;

    public PieceTask(CountDownLatch countDownLatch,FuturePieceTask futurePieceTask) {
        this.countDownLatch = countDownLatch;
        this.futurePieceTask = futurePieceTask;
    }


    protected void execute(){
        try {
            apply();
        }catch (Exception e){
            log.error("error",e);
        }finally {
            countDownLatch.countDown();
        }
    }

    protected abstract void apply() throws Exception;

    @Override
    public void run() {
        execute();
    }
}
