package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ZyxwService extends BaseService {
    @Override
    public FileType getType() {
        return FileType.ZYXW;
    }

    @Override
    public Param customizedImpl(Param param,final FMS_TASK fmsTask) throws Exception {
        return param;
    }
}
