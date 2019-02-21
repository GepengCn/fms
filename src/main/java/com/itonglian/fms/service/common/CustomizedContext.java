package com.itonglian.fms.service.common;

import com.google.common.util.concurrent.FutureCallback;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.Param;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomizedContext {



    @Autowired
    ServiceRouter serviceRouter;

    public void execute(FileType fileType, Param param, FutureCallback<String> futureCallback) throws Exception {
        BaseService baseService = serviceRouter.getBean(fileType);
        baseService.execute(param,futureCallback);

    }

}
