package com.itonglian.fms.service;

import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.FMS_TASKExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FmsTaskService {

    long countByExample(FMS_TASKExample example);

    List<FMS_TASK> selectByExample(FMS_TASKExample example);

    int updateByExample(@Param("record") FMS_TASK record, @Param("example") FMS_TASKExample example);

    int updateByPrimaryKey(FMS_TASK record);


}

