package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.*;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.bean.Customized;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.ZyxwCustomized;
import com.itonglian.fms.service.common.range.ZyxwContentFilling;
import com.itonglian.fms.service.common.task.CustomizedTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Slf4j
@Component
public class ZyxwService extends FFGLAdapter {

    @Autowired
    SysUsersService sysUsersService;

    @Value(value = "${template.zyxwFormPath}")
    private String formPath;

    @Autowired
    ZyxwContentFilling zyxwContentFilling;

    @Autowired
    CustomizedTask customizedTask;


    @Override
    public FileType getType() {
        return FileType.ZYXW;
    }

    @Override
    public ContentFilling getContentFilling() {
        return zyxwContentFilling;
    }

    @Override
    public String getFormPath() {
        return formPath;
    }

    @Override
    public Map<String, String> getContents(FFGL ffgl) {
        Map<String,String> contents = new HashMap<>();
        contents.put("FF03",ffgl.getFf03());
        contents.put("FF04",ffgl.getFf04());
        contents.put("FF12",ffgl.getFf12());
        contents.put("FF31",ffgl.getFf31());
        contents.put("FF32",sysGroupService.selectNameByPrimaryKey(ffgl.getFf32()));
        contents.put("FF30",sysGroupService.selectNameByPrimaryKey(ffgl.getFf30()));
        contents.put("FF36",sysGroupService.selectNameByPrimaryKey(ffgl.getFf36()));
        return contents;
    }

    @Override
    public Customized getCustomized(String taskId,FFGL ffgl) {
        return customizedTask.getZyxwCustomized(taskId,ffgl);
    }
}
