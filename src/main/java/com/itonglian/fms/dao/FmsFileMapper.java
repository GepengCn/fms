package com.itonglian.fms.dao;

import com.itonglian.fms.entity.FmsFile;
import com.itonglian.fms.entity.FmsFileExample;
import com.itonglian.fms.entity.FmsFileWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmsFileMapper {
    long countByExample(FmsFileExample example);

    int deleteByExample(FmsFileExample example);

    int insert(FmsFileWithBLOBs record);

    int insertSelective(FmsFileWithBLOBs record);

    List<FmsFileWithBLOBs> selectByExampleWithBLOBs(FmsFileExample example);

    List<FmsFile> selectByExample(FmsFileExample example);

    int updateByExampleSelective(@Param("record") FmsFileWithBLOBs record, @Param("example") FmsFileExample example);

    int updateByExampleWithBLOBs(@Param("record") FmsFileWithBLOBs record, @Param("example") FmsFileExample example);

    int updateByExample(@Param("record") FmsFile record, @Param("example") FmsFileExample example);
}