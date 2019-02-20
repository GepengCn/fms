package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.feapp5.FFGLMapper;
import com.itonglian.fms.entity.FFGLExample;
import com.itonglian.fms.service.FFGLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FFGLServiceImpl implements FFGLService {

    @Autowired
    FFGLMapper ffglMapper;
    @Override
    public long countByExample(FFGLExample example) {
        return ffglMapper.countByExample(example);
    }
}
