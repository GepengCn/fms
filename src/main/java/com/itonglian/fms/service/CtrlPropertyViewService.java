package com.itonglian.fms.service;

import com.itonglian.fms.entity.CTRLPROPERTY_VIEW;
import com.itonglian.fms.entity.CTRLPROPERTY_VIEWExample;

import java.util.List;

public interface CtrlPropertyViewService {
    List<CTRLPROPERTY_VIEW> selectByExample(CTRLPROPERTY_VIEWExample example);

}
