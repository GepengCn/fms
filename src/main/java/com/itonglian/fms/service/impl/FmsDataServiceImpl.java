package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.feapp5.FMS_DATAMapper;
import com.itonglian.fms.entity.FMS_DATA;
import com.itonglian.fms.entity.FMS_DATAExample;
import com.itonglian.fms.entity.FMS_DATAWithBLOBs;
import com.itonglian.fms.service.FmsDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FmsDataServiceImpl implements FmsDataService {
    @Autowired
    FMS_DATAMapper fmsDataMapper;
    @Override
    public int insert(FMS_DATAWithBLOBs record) {
        return fmsDataMapper.insert(record);
    }

    @Override
    public List<FMS_DATA> selectByExample(FMS_DATAExample example) {
        return fmsDataMapper.selectByExample(example);
    }

    @Override
    public List<FMS_DATAWithBLOBs> selectByExampleWithBLOBs(FMS_DATAExample example) {
        return fmsDataMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public int updateByPrimaryKey(FMS_DATA record) {
        return fmsDataMapper.updateByPrimaryKey(record);
    }
}
