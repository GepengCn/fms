package com.itonglian.fms.dao.feapp5;

import com.itonglian.fms.entity.FMS_FILE;
import com.itonglian.fms.entity.FMS_FILEExample;
import com.itonglian.fms.entity.FMS_FILEWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FMS_FILEMapper {
    long countByExample(FMS_FILEExample example);

    int deleteByExample(FMS_FILEExample example);

    int deleteByPrimaryKey(String id);

    int insert(FMS_FILEWithBLOBs record);

    int insertSelective(FMS_FILEWithBLOBs record);

    List<FMS_FILEWithBLOBs> selectByExampleWithBLOBs(FMS_FILEExample example);

    List<FMS_FILE> selectByExample(FMS_FILEExample example);

    FMS_FILEWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FMS_FILEWithBLOBs record, @Param("example") FMS_FILEExample example);

    int updateByExampleWithBLOBs(@Param("record") FMS_FILEWithBLOBs record, @Param("example") FMS_FILEExample example);

    int updateByExample(@Param("record") FMS_FILE record, @Param("example") FMS_FILEExample example);

    int updateByPrimaryKeySelective(FMS_FILEWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FMS_FILEWithBLOBs record);

    int updateByPrimaryKey(FMS_FILE record);
}