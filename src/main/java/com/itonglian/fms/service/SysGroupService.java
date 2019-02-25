package com.itonglian.fms.service;

import com.itonglian.fms.entity.SYS_GROUP;
import com.itonglian.fms.entity.SYS_GROUPExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysGroupService {
    long countByExample(SYS_GROUPExample example);

    int deleteByExample(SYS_GROUPExample example);

    int deleteByPrimaryKey(Long sg00);

    int insert(SYS_GROUP record);

    int insertSelective(SYS_GROUP record);

    List<SYS_GROUP> selectByExample(SYS_GROUPExample example);

    SYS_GROUP selectByPrimaryKey(Long sg00);

    int updateByExampleSelective(@Param("record") SYS_GROUP record, @Param("example") SYS_GROUPExample example);

    int updateByExample(@Param("record") SYS_GROUP record, @Param("example") SYS_GROUPExample example);

    int updateByPrimaryKeySelective(SYS_GROUP record);

    int updateByPrimaryKey(SYS_GROUP record);
}
