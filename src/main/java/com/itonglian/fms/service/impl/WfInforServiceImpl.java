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
    public long countByExample(WF_INFORExample example) {
        return wfInforMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(WF_INFORExample example) {
        return wfInforMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long wi00) {
        return wfInforMapper.deleteByPrimaryKey(wi00);
    }

    @Override
    public int insert(WF_INFOR record) {
        return wfInforMapper.insert(record);
    }

    @Override
    public int insertSelective(WF_INFOR record) {
        return wfInforMapper.insertSelective(record);
    }

    @Override
    public List<WF_INFOR> selectByExample(WF_INFORExample example) {
        return wfInforMapper.selectByExample(example);
    }

    @Override
    public WF_INFOR selectByPrimaryKey(Long wi00) {
        return wfInforMapper.selectByPrimaryKey(wi00);
    }

    @Override
    public int updateByExampleSelective(WF_INFOR record, WF_INFORExample example) {
        return wfInforMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(WF_INFOR record, WF_INFORExample example) {
        return wfInforMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(WF_INFOR record) {
        return wfInforMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WF_INFOR record) {
        return wfInforMapper.updateByPrimaryKey(record);
    }
}
