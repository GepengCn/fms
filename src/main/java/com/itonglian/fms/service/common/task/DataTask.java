package com.itonglian.fms.service.common.task;

import com.itonglian.fms.entity.FFGL;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.bean.Customized;

import java.util.Map;

public interface DataTask {


    ContentFilling getContentFilling();

    Map<String,String> getContents(FFGL ffgl);

    Customized getCustomized(String taskId,FFGL ffgl);
}
