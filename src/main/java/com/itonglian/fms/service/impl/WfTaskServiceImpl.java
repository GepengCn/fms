package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.primary.WfTaskMapper;
import com.itonglian.fms.entity.WfTask;
import com.itonglian.fms.service.WfTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WfTaskServiceImpl implements WfTaskService {

    @Autowired
    WfTaskMapper wfTaskMapper;
    @Override
    public WfTask selectByPrimaryKey(Long wt00) {
        return wfTaskMapper.selectByPrimaryKey(wt00);
    }
}
