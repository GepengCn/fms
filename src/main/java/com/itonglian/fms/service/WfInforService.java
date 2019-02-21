package com.itonglian.fms.service;

import com.itonglian.fms.entity.WF_INFOR;
import com.itonglian.fms.entity.WF_INFORExample;

import java.util.List;

public interface WfInforService {
    List<WF_INFOR> selectByExample(WF_INFORExample example);
}
