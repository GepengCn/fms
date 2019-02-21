package com.itonglian.fms.dao.feapp5;

import com.itonglian.fms.entity.FMS_DATA;
import com.itonglian.fms.entity.FMS_DATAExample;
import com.itonglian.fms.entity.FMS_DATAWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FMS_DATAMapper {
    long countByExample(FMS_DATAExample example);

    int deleteByExample(FMS_DATAExample example);

    int deleteByPrimaryKey(String dataid);

    int insert(FMS_DATAWithBLOBs record);

    int insertSelective(FMS_DATAWithBLOBs record);

    List<FMS_DATAWithBLOBs> selectByExampleWithBLOBs(FMS_DATAExample example);

    List<FMS_DATA> selectByExample(FMS_DATAExample example);

    FMS_DATAWithBLOBs selectByPrimaryKey(String dataid);

    int updateByExampleSelective(@Param("record") FMS_DATAWithBLOBs record, @Param("example") FMS_DATAExample example);

    int updateByExampleWithBLOBs(@Param("record") FMS_DATAWithBLOBs record, @Param("example") FMS_DATAExample example);

    int updateByExample(@Param("record") FMS_DATA record, @Param("example") FMS_DATAExample example);

    int updateByPrimaryKeySelective(FMS_DATAWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FMS_DATAWithBLOBs record);

    int updateByPrimaryKey(FMS_DATA record);
}