package com.itonglian.fms.service.common;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseContext {

    @Autowired
    WjbpdService wjbpdService;

    @Autowired
    ZyxwService zyxwService;

    @Autowired
    DzfwService dzfwService;

    @Autowired
    DwfwService dwfwService;

    @Autowired
    YfwService yfwService;

    @Autowired
    SwdjService swdjService;


    public void execute(FMS_TASK fmsTask, FutureCallback<Param> futureCallback) throws Exception{
        switch (Integer.parseInt(fmsTask.getFiletype())){
            case 1:
                wjbpdService.execute(fmsTask,futureCallback);
                break;
            case 2:
                zyxwService.execute(fmsTask,futureCallback);
                break;
            case 3:
                dwfwService.execute(fmsTask,futureCallback);
                break;
            case 4:
                dzfwService.execute(fmsTask,futureCallback);
                break;
            case 5:
                yfwService.execute(fmsTask,futureCallback);
                break;
            case 6:
                swdjService.execute(fmsTask,futureCallback);
                break;
            default:
                throw new Exception("不识别的类型");
        }
    }
}
