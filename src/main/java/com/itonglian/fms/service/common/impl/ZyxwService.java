package com.itonglian.fms.service.common.impl;

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
    public StringBuilder customizedImpl(Param param) throws Exception {
        return null;
    }
}
