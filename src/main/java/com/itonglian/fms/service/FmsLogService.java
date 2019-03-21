package com.itonglian.fms.service;

import com.itonglian.fms.entity.FMS_LOG;
import com.itonglian.fms.entity.FMS_LOGExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FmsLogService {

    long countByExample(FMS_LOGExample example);

    int deleteByExample(FMS_LOGExample example);

    int deleteByPrimaryKey(String id);

    int insert(FMS_LOG record);

    int insertSelective(FMS_LOG record);

    List<FMS_LOG> selectByExample(FMS_LOGExample example);

    FMS_LOG selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FMS_LOG record, @Param("example") FMS_LOGExample example);

    int updateByExample(@Param("record") FMS_LOG record, @Param("example") FMS_LOGExample example);

    int updateByPrimaryKeySelective(FMS_LOG record);

    int updateByPrimaryKey(FMS_LOG record);
}
