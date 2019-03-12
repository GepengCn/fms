package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.BaseService;

public class DzfwService extends BaseService {
    @Override
    public FileType getType() {
        return FileType.DZFW;
    }

    @Override
    public Param customizedImpl(Param param, FMS_TASK fmsTask) throws Exception {
        return null;
    }
}
