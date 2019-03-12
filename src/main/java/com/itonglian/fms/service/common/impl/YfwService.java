package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.FFGL;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.common.range.YfwContentFilling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class YfwService extends FFGLAdapter {


    @Autowired
    SysUsersService sysUsersService;

    @Value(value = "${template.yfwFormPath}")
    private String formPath;

    @Autowired
    YfwContentFilling yfwContentFilling;
    @Override
    public ContentFilling getContentFilling() {
        return yfwContentFilling;
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
        contents.put("FF32",sysGroupService.selectNameByPrimaryKey(ffgl.getFf32()));
        contents.put("FF30",sysGroupService.selectNameByPrimaryKey(ffgl.getFf30()));
        contents.put("FF35",sysGroupService.selectNameByPrimaryKey(ffgl.getFf35()));

        return contents;
    }

    @Override
    public FileType getType() {

        return FileType.YFW;
    }
}
