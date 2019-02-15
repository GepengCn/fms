package com.itonglian.fms.service.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

public abstract class PieceTask implements Runnable{

    protected CountDownLatch countDownLatch;

    protected final static Logger log = LoggerFactory.getLogger(PieceTask.class);

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
