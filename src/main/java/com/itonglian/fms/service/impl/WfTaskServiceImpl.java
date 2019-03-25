package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.primary.WfTaskMapper;
import com.itonglian.fms.entity.WfTask;
import com.itonglian.fms.entity.WfTaskExample;
import com.itonglian.fms.service.WfTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WfTaskServiceImpl implements WfTaskService {

    @Autowired
    WfTaskMapper wfTaskMapper;

    @Override
    public long countByExample(WfTaskExample example) {
        return wfTaskMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(WfTaskExample example) {
        return wfTaskMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long wt00) {
        return wfTaskMapper.deleteByPrimaryKey(wt00);
    }

    @Override
    public int insert(WfTask record) {
        return wfTaskMapper.insert(record);
    }

    @Override
    public int insertSelective(WfTask record) {
        return wfTaskMapper.insertSelective(record);
    }

    @Override
    public List<WfTask> selectByExample(WfTaskExample example) {
        return wfTaskMapper.selectByExample(example);
    }

    @Override
    public WfTask selectByPrimaryKey(Long wt00) {
        return wfTaskMapper.selectByPrimaryKey(wt00);
    }

    @Override
    public int updateByExampleSelective(WfTask record, WfTaskExample example) {
        return wfTaskMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(WfTask record, WfTaskExample example) {
        return wfTaskMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(WfTask record) {
        return wfTaskMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WfTask record) {
        return wfTaskMapper.updateByPrimaryKey(record);
    }
}
