package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.*;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.bean.Customized;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.SwdjCustomized;
import com.itonglian.fms.service.bean.WjbpdCustomized;
import com.itonglian.fms.service.common.range.WjbpdContentFilling;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Slf4j
@Component
public class WjbpdService extends FFGLAdapter {

    @Autowired
    SysUsersService sysUsersService;

    @Value(value = "${template.wjbpdFormPath}")
    private String formPath;

    @Autowired
    WjbpdContentFilling wjbpdContentFilling;


    @Override
    public FileType getType() {
        return FileType.WJPBD;
    }

    @Override
    public ContentFilling getContentFilling() {
        return wjbpdContentFilling;
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
        contents.put("FF53",ffgl.getFf53());
        contents.put("FF12",ffgl.getFf12());
        contents.put("FF31",ffgl.getFf31());
        contents.put("FF32",sysGroupService.selectNameByPrimaryKey(ffgl.getFf32()));
        contents.put("FF30",sysGroupService.selectNameByPrimaryKey(ffgl.getFf30()));
        contents.put("FF36",sysGroupService.selectNameByPrimaryKey(ffgl.getFf36()));
        return contents;
    }

    @Override
    public Customized getCustomized(FFGL ffgl) {
        WjbpdCustomized wjbpdCustomized = new WjbpdCustomized();
        wjbpdCustomized.setFF03(ffgl.getFf03());
        wjbpdCustomized.setFF04(ffgl.getFf04());
        wjbpdCustomized.setFF53(ffgl.getFf53());
        wjbpdCustomized.setFF12(ffgl.getFf12());
        wjbpdCustomized.setFF32(ffgl.getFf32());
        wjbpdCustomized.setFF31(ffgl.getFf31());
        wjbpdCustomized.setFF36(ffgl.getFf36());
        wjbpdCustomized.setFF30(ffgl.getFf30());
        wjbpdCustomized.setFF02(ffgl.getFf02());
        wjbpdCustomized.setFF14(ffgl.getFf14());
        wjbpdCustomized.setFF15(ffgl.getFf15());

        /*SYS_ATTACHMENTExample sysAttachmentExample = new SYS_ATTACHMENTExample();
        sysAttachmentExample.or().andSa01EqualTo(ffgl.getFf52());
        List<SYS_ATTACHMENT> sysAttachmentList = sysAttachmentService.selectByExample(sysAttachmentExample);
        Iterator<SYS_ATTACHMENT> iterator = sysAttachmentList.iterator();
        List<WjbpdCustomized.FF52> refDocList = new ArrayList<>();
        while(iterator.hasNext()){
            SYS_ATTACHMENT sysAttachment = iterator.next();
            String taskId = sysAttachment.getSa02();
            WfTask wfTask1 =  wfTaskService.selectByPrimaryKey(Long.parseLong(taskId));
            if("FE_APP5.FFGL".equalsIgnoreCase(wfTask1.getWt03())){
                FFGL ffgl1 = ffglService.selectByPrimaryKey(wfTask1.getWt04());
                WjbpdCustomized.FF52 ff52 = new WjbpdCustomized.FF52();
                ff52.setFF02(ffgl1.getFf02());
                ff52.setFF12(ffgl1.getFf12());
                ff52.setFF30(ffgl1.getFf30());
                ff52.setFF31(ffgl1.getFf31());
                ff52.setFF32(ffgl1.getFf32());
                refDocList.add(ff52);
            }else if("FE_APP5.SFGL".equalsIgnoreCase(wfTask1.getWt03())){
                SFGL sfgl1 = sfglService.selectByPrimaryKey(wfTask1.getWt04());
                WjbpdCustomized.FF52 ff52 = new WjbpdCustomized.FF52();
                ff52.setFF02(sfgl1.getSf02());
                ff52.setFF12(sfgl1.getSf13());
                ff52.setFF30(sfgl1.getSf33());
                ff52.setFF31(sfgl1.getSf26());
                ff52.setFF32(sfgl1.getSf32());
                refDocList.add(ff52);
            }
        }
        wjbpdCustomized.setRefDocList(refDocList);*/
        return wjbpdCustomized;
    }


}
