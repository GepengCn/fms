package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.feapp5.FMS_LOGMapper;
import com.itonglian.fms.entity.FMS_LOG;
import com.itonglian.fms.entity.FMS_LOGExample;
import com.itonglian.fms.service.FmsLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FmsLogServiceImpl implements FmsLogService {

    @Autowired
    FMS_LOGMapper fmsLogMapper;
    @Override
    public long countByExample(FMS_LOGExample example) {
        return fmsLogMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(FMS_LOGExample example) {
        return fmsLogMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return fmsLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FMS_LOG record) {
        return fmsLogMapper.insert(record);
    }

    @Override
    public int insertSelective(FMS_LOG record) {
        return fmsLogMapper.insertSelective(record);
    }

    @Override
    public List<FMS_LOG> selectByExample(FMS_LOGExample example) {
        return fmsLogMapper.selectByExample(example);
    }

    @Override
    public FMS_LOG selectByPrimaryKey(String id) {
        return fmsLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(FMS_LOG record, FMS_LOGExample example) {
        return fmsLogMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(FMS_LOG record, FMS_LOGExample example) {
        return fmsLogMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(FMS_LOG record) {
        return fmsLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FMS_LOG record) {
        return fmsLogMapper.updateByPrimaryKey(record);
    }
}
