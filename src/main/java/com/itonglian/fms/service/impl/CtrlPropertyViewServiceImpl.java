package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.primary.CTRLPROPERTY_VIEWMapper;
import com.itonglian.fms.entity.CTRLPROPERTY_VIEW;
import com.itonglian.fms.entity.CTRLPROPERTY_VIEWExample;
import com.itonglian.fms.service.CtrlPropertyViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CtrlPropertyViewServiceImpl implements CtrlPropertyViewService {
    @Autowired
    CTRLPROPERTY_VIEWMapper ctrlpropertyViewMapper;
    @Override
    public List<CTRLPROPERTY_VIEW> selectByExample(CTRLPROPERTY_VIEWExample example) {
        return ctrlpropertyViewMapper.selectByExample(example);
    }
}
