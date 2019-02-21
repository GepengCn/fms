package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.feapp5.FMS_DATAMapper;
import com.itonglian.fms.entity.FMS_DATAWithBLOBs;
import com.itonglian.fms.service.common.FmsDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FmsDataServiceImpl implements FmsDataService {
    @Autowired
    FMS_DATAMapper fmsDataMapper;
    @Override
    public int insert(FMS_DATAWithBLOBs record) {
        return fmsDataMapper.insert(record);
    }
}
