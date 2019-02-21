package com.itonglian.fms.dao.primary;

import com.itonglian.fms.entity.SYS_USERS;
import com.itonglian.fms.entity.SYS_USERSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_USERSMapper {
    long countByExample(SYS_USERSExample example);

    int deleteByExample(SYS_USERSExample example);

    int deleteByPrimaryKey(Long su00);

    int insert(SYS_USERS record);

    int insertSelective(SYS_USERS record);

    List<SYS_USERS> selectByExample(SYS_USERSExample example);

    SYS_USERS selectByPrimaryKey(Long su00);

    int updateByExampleSelective(@Param("record") SYS_USERS record, @Param("example") SYS_USERSExample example);

    int updateByExample(@Param("record") SYS_USERS record, @Param("example") SYS_USERSExample example);

    int updateByPrimaryKeySelective(SYS_USERS record);

    int updateByPrimaryKey(SYS_USERS record);
}