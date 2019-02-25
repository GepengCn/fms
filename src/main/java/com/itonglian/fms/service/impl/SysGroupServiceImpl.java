package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.primary.SYS_GROUPMapper;
import com.itonglian.fms.entity.SYS_GROUP;
import com.itonglian.fms.entity.SYS_GROUPExample;
import com.itonglian.fms.service.SysGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SysGroupServiceImpl implements SysGroupService {
    @Autowired
    SYS_GROUPMapper sysGroupMapper;

    @Override
    public long countByExample(SYS_GROUPExample example) {
        return sysGroupMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SYS_GROUPExample example) {
        return sysGroupMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long sg00) {
        return sysGroupMapper.deleteByPrimaryKey(sg00);
    }

    @Override
    public int insert(SYS_GROUP record) {
        return sysGroupMapper.insert(record);
    }

    @Override
    public int insertSelective(SYS_GROUP record) {
        return sysGroupMapper.insertSelective(record);
    }

    @Override
    public List<SYS_GROUP> selectByExample(SYS_GROUPExample example) {
        return sysGroupMapper.selectByExample(example);
    }

    @Override
    public SYS_GROUP selectByPrimaryKey(Long sg00) {
        return sysGroupMapper.selectByPrimaryKey(sg00);
    }

    @Override
    public int updateByExampleSelective(SYS_GROUP record, SYS_GROUPExample example) {
        return sysGroupMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SYS_GROUP record, SYS_GROUPExample example) {
        return sysGroupMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SYS_GROUP record) {
        return sysGroupMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SYS_GROUP record) {
        return sysGroupMapper.updateByPrimaryKey(record);
    }
}
