package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.primary.WF_INFORMapper;
import com.itonglian.fms.entity.WF_INFOR;
import com.itonglian.fms.entity.WF_INFORExample;
import com.itonglian.fms.service.WfInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WfInforServiceImpl implements WfInforService {

    @Autowired
    WF_INFORMapper wfInforMapper;

    @Override
    public List<WF_INFOR> selectByExample(WF_INFORExample example) {
        return wfInforMapper.selectByExample(example);
    }
}
