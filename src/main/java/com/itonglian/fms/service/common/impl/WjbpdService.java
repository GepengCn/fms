package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.BaseService;
import com.itonglian.fms.service.common.FuturePieceTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class WjbpdService extends BaseService {


    @Override
    public FileType getType() {
        return FileType.WJPBD;
    }

    @Override
    public StringBuilder customizedImpl(Param param) throws Exception{
        StringBuilder stringBuilder = new StringBuilder();

        int taskSize = 1;
        CountDownLatch countDownLatch = new CountDownLatch(taskSize);
        executorService.execute(new AttPieceTask(countDownLatch, new FuturePieceTask() {
            @Override
            public void callback() throws Exception {

            }
        }));

        if(!countDownLatch.await(10, TimeUnit.MINUTES)){
            throw new Exception("countDownLatch处理超时");
        }
        log.info("自定义任务执行完毕");
        return stringBuilder;
    }

}
