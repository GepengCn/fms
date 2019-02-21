package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.feapp5.FFGLMapper;
import com.itonglian.fms.entity.FFGL;
import com.itonglian.fms.entity.FFGLExample;
import com.itonglian.fms.service.FFGLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FFGLServiceImpl implements FFGLService {

    @Autowired
    FFGLMapper ffglMapper;
    @Override
    public long countByExample(FFGLExample example) {
        return ffglMapper.countByExample(example);
    }

    @Override
    public List<FFGL> selectByExample(FFGLExample example) {
        return ffglMapper.selectByExample(example);
    }

    @Override
    public FFGL selectByPrimaryKey(Long ff00) {
        return ffglMapper.selectByPrimaryKey(ff00);
    }
}
