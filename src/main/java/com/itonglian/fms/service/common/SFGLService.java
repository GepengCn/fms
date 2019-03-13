package com.itonglian.fms.service.common;

import com.itonglian.fms.entity.SFGL;
import com.itonglian.fms.entity.SFGLExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SFGLService {

    long countByExample(SFGLExample example);

    int deleteByExample(SFGLExample example);

    int deleteByPrimaryKey(Long sf00);

    int insert(SFGL record);

    int insertSelective(SFGL record);

    List<SFGL> selectByExample(SFGLExample example);

    SFGL selectByPrimaryKey(Long sf00);

    int updateByExampleSelective(@Param("record") SFGL record, @Param("example") SFGLExample example);

    int updateByExample(@Param("record") SFGL record, @Param("example") SFGLExample example);

    int updateByPrimaryKeySelective(SFGL record);

    int updateByPrimaryKey(SFGL record);
}
