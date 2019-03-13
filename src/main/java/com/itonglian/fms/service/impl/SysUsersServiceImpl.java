package com.itonglian.fms.service.impl;

import com.google.common.base.Strings;
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

    @Override
    public String findNameByPrimaryKey(Long su00) {
        SYS_USERS sysUsers = sysUsersMapper.selectByPrimaryKey(su00);
        if(sysUsers==null){
            return null;
        }
        return sysUsers.getSu02();
    }

    @Override
    public String findNameByPrimaryKey(String su00) {
        if(Strings.isNullOrEmpty(su00)){
            return "";
        }
        return findNameByPrimaryKey(Long.parseLong(su00));
    }
}
