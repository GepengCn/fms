package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.FmsFileMapper;
import com.itonglian.fms.entity.FmsFile;
import com.itonglian.fms.entity.FmsFileExample;
import com.itonglian.fms.service.FmsFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FmsFileServiceImpl implements FmsFileService {
    @Autowired
    FmsFileMapper fmsFileMapper;
    @Override
    public long countByExample(FmsFileExample example) {
        return fmsFileMapper.countByExample(example);
    }

    @Override
    public List<FmsFile> selectByExample(FmsFileExample example) {
        return fmsFileMapper.selectByExample(example);
    }

    @Override
    public int updateByExample(FmsFile record, FmsFileExample example) {
        return fmsFileMapper.updateByExample(record,example);
    }
}
