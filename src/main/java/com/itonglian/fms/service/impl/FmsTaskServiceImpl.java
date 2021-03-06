package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.feapp5.FMS_TASKMapper;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.FMS_TASKExample;
import com.itonglian.fms.service.FmsTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FmsTaskServiceImpl implements FmsTaskService {
    @Autowired
    FMS_TASKMapper fmsTaskMapper;

    @Override
    public long countByExample(FMS_TASKExample example) {
        return fmsTaskMapper.countByExample(example);
    }

    @Override
    public List<FMS_TASK> selectByExample(FMS_TASKExample example) {
        return fmsTaskMapper.selectByExample(example);
    }

    @Override
    public int updateByExample(FMS_TASK record, FMS_TASKExample example) {
        return fmsTaskMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKey(FMS_TASK record) {
        return fmsTaskMapper.updateByPrimaryKey(record);
    }

    @Override
    public FMS_TASK selectByPrimaryKey(Long id) {
        return fmsTaskMapper.selectByPrimaryKey(id);
    }

    @Override
    public FMS_TASK selectByTaskId(String taskId) {
        FMS_TASKExample fmsTaskExample = new FMS_TASKExample();
        fmsTaskExample.or().andTaskidEqualTo(taskId);
        List<FMS_TASK> fmsTaskList = fmsTaskMapper.selectByExample(fmsTaskExample);
        if(fmsTaskList!=null&&fmsTaskList.size()>0){
            return fmsTaskList.get(0);
        }
        return null;
    }

}
