package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.*;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.bean.Customized;
import com.itonglian.fms.service.bean.DwfwCustomized;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.common.range.DwfwContentFilling;
import com.itonglian.fms.service.common.task.CustomizedTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Slf4j
@Component
public class DwfwService extends FFGLAdapter {

    @Autowired
    SysUsersService sysUsersService;

    @Value(value = "${template.dwfwFormPath}")
    private String formPath;

    @Autowired
    DwfwContentFilling dwfwContentFilling;

    @Autowired
    CustomizedTask customizedTask;

    @Override
    public FileType getType() {
        return FileType.DWFW;
    }

    @Override
    public ContentFilling getContentFilling() {
        return dwfwContentFilling;
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
        contents.put("FF07",ffgl.getFf07());
        contents.put("FF11",ffgl.getFf11());
        contents.put("FF12",ffgl.getFf12());
        contents.put("FF16",ffgl.getFf16());
        contents.put("FF17",ffgl.getFf17());
        contents.put("FF18",ffgl.getFf18());
        contents.put("FF25",ffgl.getFf25()==null?"0":ffgl.getFf25()+"");
        contents.put("FF31",ffgl.getFf31());
        contents.put("FF32",sysGroupService.selectNameByPrimaryKey(ffgl.getFf32()));
        contents.put("FF30",sysGroupService.selectNameByPrimaryKey(ffgl.getFf30()));
        contents.put("FF35",sysGroupService.selectNameByPrimaryKey(ffgl.getFf35()));
        contents.put("FF36",sysGroupService.selectNameByPrimaryKey(ffgl.getFf36()));
        return contents;
    }

    @Override
    public Customized getCustomized(String taskId,FFGL ffgl) {
        return customizedTask.getDwfwCustomized(taskId,ffgl);
    }

}
