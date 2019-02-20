package com.itonglian.fms.dao.feapp5;

import com.itonglian.fms.entity.FFGL;
import com.itonglian.fms.entity.FFGLExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FFGLMapper {
    long countByExample(FFGLExample example);

    int deleteByExample(FFGLExample example);

    int deleteByPrimaryKey(Long ff00);

    int insert(FFGL record);

    int insertSelective(FFGL record);

    List<FFGL> selectByExample(FFGLExample example);

    FFGL selectByPrimaryKey(Long ff00);

    int updateByExampleSelective(@Param("record") FFGL record, @Param("example") FFGLExample example);

    int updateByExample(@Param("record") FFGL record, @Param("example") FFGLExample example);

    int updateByPrimaryKeySelective(FFGL record);

    int updateByPrimaryKey(FFGL record);
}