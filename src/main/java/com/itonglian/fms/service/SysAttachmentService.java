package com.itonglian.fms.service;

import com.itonglian.fms.entity.SYS_ATTACHMENT;
import com.itonglian.fms.entity.SYS_ATTACHMENTExample;

import java.util.List;

public interface SysAttachmentService {
    List<SYS_ATTACHMENT> selectByExample(SYS_ATTACHMENTExample example);
}
