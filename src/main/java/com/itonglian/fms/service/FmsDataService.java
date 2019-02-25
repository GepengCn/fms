package com.itonglian.fms.service;

import com.itonglian.fms.entity.FMS_DATA;
import com.itonglian.fms.entity.FMS_DATAExample;
import com.itonglian.fms.entity.FMS_DATAWithBLOBs;

import java.util.List;

public interface FmsDataService {
    int insert(FMS_DATAWithBLOBs record);

    List<FMS_DATA> selectByExample(FMS_DATAExample example);

    List<FMS_DATAWithBLOBs> selectByExampleWithBLOBs(FMS_DATAExample example);

    int updateByPrimaryKey(FMS_DATA record);

    FMS_DATAWithBLOBs selectByPrimaryKey(String dataid);


}
