package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.service.common.FuturePieceTask;
import com.itonglian.fms.service.common.PieceTask;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

@Slf4j
public class AttPieceTask extends PieceTask{

    public AttPieceTask(CountDownLatch countDownLatch, FuturePieceTask futurePieceTask) {
        super(countDownLatch, futurePieceTask);
    }

    @Override
    protected void apply() throws Exception {
        futurePieceTask.callback();
    }

}
