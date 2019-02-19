package com.itonglian.fms.service;

import com.itonglian.fms.entity.FmsFile;
import com.itonglian.fms.entity.FmsFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FmsFileService {

    long countByExample(FmsFileExample example);

    List<FmsFile> selectByExample(FmsFileExample example);

    int updateByExample(@Param("record") FmsFile record, @Param("example") FmsFileExample example);

}

