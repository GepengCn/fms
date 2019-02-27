package com.itonglian.fms.dao.primary;

import com.itonglian.fms.entity.CTRLPROPERTY_VIEW;
import com.itonglian.fms.entity.CTRLPROPERTY_VIEWExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CTRLPROPERTY_VIEWMapper {
    long countByExample(CTRLPROPERTY_VIEWExample example);

    int deleteByExample(CTRLPROPERTY_VIEWExample example);

    int insert(CTRLPROPERTY_VIEW record);

    int insertSelective(CTRLPROPERTY_VIEW record);

    List<CTRLPROPERTY_VIEW> selectByExample(CTRLPROPERTY_VIEWExample example);

    int updateByExampleSelective(@Param("record") CTRLPROPERTY_VIEW record, @Param("example") CTRLPROPERTY_VIEWExample example);

    int updateByExample(@Param("record") CTRLPROPERTY_VIEW record, @Param("example") CTRLPROPERTY_VIEWExample example);
}