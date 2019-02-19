package com.itonglian.fms.quartz;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ResultJob {
    /**
     * 业务逻辑
     */
    public void getResult(){
        System.out.println("执行业务处理逻辑："+new Date());
    }

}
