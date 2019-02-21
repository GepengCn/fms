package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.primary.SYS_ATTACHMENTMapper;
import com.itonglian.fms.entity.SYS_ATTACHMENT;
import com.itonglian.fms.entity.SYS_ATTACHMENTExample;
import com.itonglian.fms.service.SysAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysAttachmentServiceImpl implements SysAttachmentService {
    @Autowired
    SYS_ATTACHMENTMapper sysAttachmentMapper;
    @Override
    public List<SYS_ATTACHMENT> selectByExample(SYS_ATTACHMENTExample example) {
        return sysAttachmentMapper.selectByExample(example);
    }
}
