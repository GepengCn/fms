package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.FmsFileMapper;
import com.itonglian.fms.entity.FmsFileExample;
import com.itonglian.fms.service.FmsFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FmsFileServiceImpl implements FmsFileService {
    @Autowired
    FmsFileMapper fmsFileMapper;
    @Override
    public long countByExample(FmsFileExample example) {
        return fmsFileMapper.countByExample(example);
    }
}
