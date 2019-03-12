package com.itonglian.fms.service;

import com.itonglian.fms.entity.SYS_USERS;

public interface SysUsersService {
    SYS_USERS selectByPrimaryKey(Long su00);

    String findNameByPrimaryKey(Long su00);
}
