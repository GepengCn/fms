package com.itonglian.fms.dao.primary;

import com.itonglian.fms.entity.SYS_ATTACHMENT;
import com.itonglian.fms.entity.SYS_ATTACHMENTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_ATTACHMENTMapper {
    long countByExample(SYS_ATTACHMENTExample example);

    int deleteByExample(SYS_ATTACHMENTExample example);

    int deleteByPrimaryKey(Long sa00);

    int insert(SYS_ATTACHMENT record);

    int insertSelective(SYS_ATTACHMENT record);

    List<SYS_ATTACHMENT> selectByExampleWithBLOBs(SYS_ATTACHMENTExample example);

    List<SYS_ATTACHMENT> selectByExample(SYS_ATTACHMENTExample example);

    SYS_ATTACHMENT selectByPrimaryKey(Long sa00);

    int updateByExampleSelective(@Param("record") SYS_ATTACHMENT record, @Param("example") SYS_ATTACHMENTExample example);

    int updateByExampleWithBLOBs(@Param("record") SYS_ATTACHMENT record, @Param("example") SYS_ATTACHMENTExample example);

    int updateByExample(@Param("record") SYS_ATTACHMENT record, @Param("example") SYS_ATTACHMENTExample example);

    int updateByPrimaryKeySelective(SYS_ATTACHMENT record);

    int updateByPrimaryKeyWithBLOBs(SYS_ATTACHMENT record);

    int updateByPrimaryKey(SYS_ATTACHMENT record);
}