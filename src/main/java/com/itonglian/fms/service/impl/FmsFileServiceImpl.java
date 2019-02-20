package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.feapp5.FMS_FILEMapper;
import com.itonglian.fms.entity.FMS_FILE;
import com.itonglian.fms.entity.FMS_FILEExample;
import com.itonglian.fms.service.FmsFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FmsFileServiceImpl implements FmsFileService {
    @Autowired
    FMS_FILEMapper fmsFileMapper;

    @Override
    public long countByExample(FMS_FILEExample example) {
        return fmsFileMapper.countByExample(example);
    }

    @Override
    public List<FMS_FILE> selectByExample(FMS_FILEExample example) {
        return fmsFileMapper.selectByExample(example);
    }

    @Override
    public int updateByExample(FMS_FILE record, FMS_FILEExample example) {
        return fmsFileMapper.updateByExample(record,example);
    }
}
