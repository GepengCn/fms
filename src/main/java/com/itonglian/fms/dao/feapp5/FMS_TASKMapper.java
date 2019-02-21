package com.itonglian.fms.dao.feapp5;

import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.FMS_TASKExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FMS_TASKMapper {
    long countByExample(FMS_TASKExample example);

    int deleteByExample(FMS_TASKExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FMS_TASK record);

    int insertSelective(FMS_TASK record);

    List<FMS_TASK> selectByExample(FMS_TASKExample example);

    FMS_TASK selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FMS_TASK record, @Param("example") FMS_TASKExample example);

    int updateByExample(@Param("record") FMS_TASK record, @Param("example") FMS_TASKExample example);

    int updateByPrimaryKeySelective(FMS_TASK record);

    int updateByPrimaryKey(FMS_TASK record);
}