package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.feapp5.SFGLMapper;
import com.itonglian.fms.entity.SFGL;
import com.itonglian.fms.entity.SFGLExample;
import com.itonglian.fms.service.common.SFGLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SFGLServiceImpl implements SFGLService {

    @Autowired
    SFGLMapper sfglMapper;
    @Override
    public long countByExample(SFGLExample example) {
        return sfglMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SFGLExample example) {
        return sfglMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long sf00) {
        return sfglMapper.deleteByPrimaryKey(sf00);
    }

    @Override
    public int insert(SFGL record) {
        return sfglMapper.insert(record);
    }

    @Override
    public int insertSelective(SFGL record) {
        return sfglMapper.insertSelective(record);
    }

    @Override
    public List<SFGL> selectByExample(SFGLExample example) {
        return sfglMapper.selectByExample(example);
    }

    @Override
    public SFGL selectByPrimaryKey(Long sf00) {
        return sfglMapper.selectByPrimaryKey(sf00);
    }

    @Override
    public int updateByExampleSelective(SFGL record, SFGLExample example) {
        return sfglMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SFGL record, SFGLExample example) {
        return sfglMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SFGL record) {
        return sfglMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SFGL record) {
        return sfglMapper.updateByPrimaryKey(record);
    }
}
