package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.*;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.bean.Customized;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.SwdjCustomized;
import com.itonglian.fms.service.common.range.SwdjContentFilling;
import com.itonglian.fms.service.common.task.CustomizedTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;
@Slf4j
@Component
public class SwdjService extends SFGLAdapter {

    @Value(value = "${template.swdjFormPath}")
    private String formPath;

    @Autowired
    SwdjContentFilling swdjContentFilling;

    @Autowired
    CustomizedTask customizedTask;

    @Override
    public ContentFilling getContentFilling() {
        return swdjContentFilling;
    }

    @Override
    public String getFormPath() {
        return formPath;
    }

    @Override
    public Map<String, String> getContents(SFGL sfgl) throws Exception {
        Map<String,String> contents = new HashMap<>();
        contents.put("SF13",sfgl.getSf13());
        contents.put("SF12",sfgl.getSf12());
        contents.put("SF07",sfgl.getSf07());
        contents.put("SF18",sfgl.getSf18());
        contents.put("SF26",sfgl.getSf26());
        contents.put("SF32",sfgl.getSf32());
        contents.put("SF33",sysUsersService.findNameByPrimaryKey(sfgl.getSf33()));
        contents.put("SF32",sysGroupService.selectNameByPrimaryKey(sfgl.getSf32()));
        return contents;
    }

    @Override
    public Customized getCustomized(String taskId,SFGL sfgl) {
        return customizedTask.getSwdjCustomized(taskId,sfgl);
    }

    @Override
    public FileType getType() {
        return FileType.SWDJ;
    }
}
