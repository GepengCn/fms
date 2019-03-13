package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.FFGL;
import com.itonglian.fms.entity.SYS_ATTACHMENT;
import com.itonglian.fms.entity.SYS_ATTACHMENTExample;
import com.itonglian.fms.entity.WfTask;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.bean.Customized;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.WjbpdCustomized;
import com.itonglian.fms.service.bean.ZyxwCustomized;
import com.itonglian.fms.service.common.range.ZyxwContentFilling;
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
    public Customized getCustomized(FFGL ffgl) {
        ZyxwCustomized zyxwCustomized = new ZyxwCustomized();
        zyxwCustomized.setFF03(ffgl.getFf03());
        zyxwCustomized.setFF04(ffgl.getFf04());
        zyxwCustomized.setFF12(ffgl.getFf12());
        zyxwCustomized.setFF32(ffgl.getFf32());
        zyxwCustomized.setFF31(ffgl.getFf31());
        zyxwCustomized.setFF36(ffgl.getFf36());
        zyxwCustomized.setFF30(ffgl.getFf30());
        zyxwCustomized.setFF02(ffgl.getFf02());
        zyxwCustomized.setFF14(ffgl.getFf14());
        zyxwCustomized.setFF15(ffgl.getFf15());

        SYS_ATTACHMENTExample sysAttachmentExample = new SYS_ATTACHMENTExample();
        sysAttachmentExample.or().andSa01EqualTo(ffgl.getFf52());
        List<SYS_ATTACHMENT> sysAttachmentList = sysAttachmentService.selectByExample(sysAttachmentExample);
        Iterator<SYS_ATTACHMENT> iterator = sysAttachmentList.iterator();
        List<ZyxwCustomized.FF52> refDocList = new ArrayList<>();
        while(iterator.hasNext()){
            SYS_ATTACHMENT sysAttachment = iterator.next();
            String taskId = sysAttachment.getSa02();
            WfTask wfTask1 =  wfTaskService.selectByPrimaryKey(Long.parseLong(taskId));
            if(!"FE_APP5.FFGL".equalsIgnoreCase(wfTask1.getWt03())){
                continue;
            }
            FFGL ffgl1 = ffglService.selectByPrimaryKey(wfTask1.getWt04());
            ZyxwCustomized.FF52 ff52 = new ZyxwCustomized.FF52();
            ff52.setFF02(ffgl1.getFf02());
            ff52.setFF12(ffgl1.getFf12());
            ff52.setFF30(ffgl1.getFf30());
            ff52.setFF31(ffgl1.getFf31());
            ff52.setFF32(ffgl1.getFf32());
            refDocList.add(ff52);
        }
        zyxwCustomized.setRefDocList(refDocList);
        return zyxwCustomized;
    }
}
