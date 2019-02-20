package com.itonglian.fms.dao.primary;

import com.itonglian.fms.entity.WfTask;
import com.itonglian.fms.entity.WfTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfTaskMapper {
    long countByExample(WfTaskExample example);

    int deleteByExample(WfTaskExample example);

    int deleteByPrimaryKey(Long wt00);

    int insert(WfTask record);

    int insertSelective(WfTask record);

    List<WfTask> selectByExample(WfTaskExample example);

    WfTask selectByPrimaryKey(Long wt00);

    int updateByExampleSelective(@Param("record") WfTask record, @Param("example") WfTaskExample example);

    int updateByExample(@Param("record") WfTask record, @Param("example") WfTaskExample example);

    int updateByPrimaryKeySelective(WfTask record);

    int updateByPrimaryKey(WfTask record);
}