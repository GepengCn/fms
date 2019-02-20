package com.itonglian.fms.service.common;

import com.google.common.util.concurrent.FutureCallback;
import com.itonglian.fms.service.bean.Customized;
import com.itonglian.fms.service.bean.DocApprovalCustomized;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.impl.DocApprovalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomizedContext {

    BaseService baseService;


    public void execute(FileType fileType, Param param, FutureCallback<String> futureCallback) throws Exception {
        Customized customized = null;
        switch (fileType){

            case WJPBD:
                baseService = new DocApprovalService();
                customized = new DocApprovalCustomized();
                break;
            case ZYXW:
                break;
            case DWFW:
                break;
            case DZFW:
                break;
            case YFW:
                break;
            case SWDJ:
                break;
            case YJFS:
                break;
            default:
                throw new Exception("未识别的类型");
        }
        param.setCustomized(customized);
        baseService.execute(param,futureCallback);

    }

}
