package com.itonglian.fms.service;

import com.itonglian.fms.entity.FFGL;
import com.itonglian.fms.entity.FFGLExample;

import java.util.List;

public interface FFGLService {
    long countByExample(FFGLExample example);

    List<FFGL> selectByExample(FFGLExample example);

    FFGL selectByPrimaryKey(Long ff00);

}
