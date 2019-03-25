package com.itonglian.fms.service;

import com.itonglian.fms.entity.WF_INFOR;
import com.itonglian.fms.entity.WF_INFORExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WfInforService {
    long countByExample(WF_INFORExample example);

    int deleteByExample(WF_INFORExample example);

    int deleteByPrimaryKey(Long wi00);

    int insert(WF_INFOR record);

    int insertSelective(WF_INFOR record);

    List<WF_INFOR> selectByExample(WF_INFORExample example);

    WF_INFOR selectByPrimaryKey(Long wi00);

    int updateByExampleSelective(@Param("record") WF_INFOR record, @Param("example") WF_INFORExample example);

    int updateByExample(@Param("record") WF_INFOR record, @Param("example") WF_INFORExample example);

    int updateByPrimaryKeySelective(WF_INFOR record);

    int updateByPrimaryKey(WF_INFOR record);
}
