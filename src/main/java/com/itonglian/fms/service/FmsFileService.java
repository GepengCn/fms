package com.itonglian.fms.service;

import com.itonglian.fms.entity.FMS_FILE;
import com.itonglian.fms.entity.FMS_FILEExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FmsFileService {

    long countByExample(FMS_FILEExample example);

    List<FMS_FILE> selectByExample(FMS_FILEExample example);

    int updateByExample(@Param("record") FMS_FILE record, @Param("example") FMS_FILEExample example);

}

