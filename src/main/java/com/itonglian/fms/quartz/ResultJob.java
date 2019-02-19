package com.itonglian.fms.quartz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class ResultJob {
    /**
     * 业务逻辑
     */
    public void getResult(){
        log.info("执行业务处理逻辑:"+new Date());
    }

}
