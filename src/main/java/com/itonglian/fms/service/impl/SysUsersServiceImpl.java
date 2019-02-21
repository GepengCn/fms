package com.itonglian.fms.service.impl;

import com.itonglian.fms.dao.primary.SYS_USERSMapper;
import com.itonglian.fms.entity.SYS_USERS;
import com.itonglian.fms.service.SysUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUsersServiceImpl implements SysUsersService {
    @Autowired
    SYS_USERSMapper sysUsersMapper;
    @Override
    public SYS_USERS selectByPrimaryKey(Long su00) {
        return sysUsersMapper.selectByPrimaryKey(su00);
    }
}
