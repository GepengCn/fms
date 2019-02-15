package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.service.common.FuturePieceTask;
import com.itonglian.fms.service.common.PieceTask;

import java.util.concurrent.CountDownLatch;

public class DocPieceTask extends PieceTask{

    public DocPieceTask(CountDownLatch countDownLatch, FuturePieceTask futurePieceTask) {
        super(countDownLatch, futurePieceTask);
    }

    @Override
    protected void apply() throws Exception {
        log.info("DocPieceTask start");
        long start = System.currentTimeMillis();
        futurePieceTask.callback();
        log.info("耗时:"+(System.currentTimeMillis()-start)+"秒");
        log.info("DocPieceTask over");
    }

}
