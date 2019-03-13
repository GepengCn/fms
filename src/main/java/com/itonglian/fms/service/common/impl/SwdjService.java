package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.*;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.bean.Customized;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.SwdjCustomized;
import com.itonglian.fms.service.common.range.SwdjContentFilling;
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

    @Override
    public ContentFilling getContentFilling() {
        return swdjContentFilling;
    }

    @Override
    public String getFormPath() {
        return formPath;
    }

    @Override
    public Map<String, String> getContents(SFGL sfgl) {
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
    public Customized getCustomized(SFGL sfgl) {
        SwdjCustomized swdjCustomized = new SwdjCustomized();
        swdjCustomized.setSF13(sfgl.getSf13());
        swdjCustomized.setSF12(sfgl.getSf12());
        swdjCustomized.setSF18(sfgl.getSf18());
        swdjCustomized.setSF04(sfgl.getSf04());
        swdjCustomized.setSF26(sfgl.getSf26());
        swdjCustomized.setSF07(sfgl.getSf07());
        swdjCustomized.setSF32(sfgl.getSf32());
        swdjCustomized.setSF33(sfgl.getSf33());
        swdjCustomized.setSF02(sfgl.getSf02());
        swdjCustomized.setSF15(sfgl.getSf15());
        swdjCustomized.setSF16(sfgl.getSf16());
        SYS_ATTACHMENTExample sysAttachmentExample = new SYS_ATTACHMENTExample();
        sysAttachmentExample.or().andSa01EqualTo(sfgl.getSf56());
        List<SYS_ATTACHMENT> sysAttachmentList = sysAttachmentService.selectByExample(sysAttachmentExample);
        Iterator<SYS_ATTACHMENT> iterator = sysAttachmentList.iterator();
        List<SwdjCustomized.SF56> refDocList = new ArrayList<>();
        while(iterator.hasNext()){
            SYS_ATTACHMENT sysAttachment = iterator.next();
            String taskId = sysAttachment.getSa02();
            WfTask wfTask1 =  wfTaskService.selectByPrimaryKey(Long.parseLong(taskId));
            if("FE_APP5.SFGL".equalsIgnoreCase(wfTask1.getWt03())){
                SFGL sfgl1 = sfglService.selectByPrimaryKey(wfTask1.getWt04());
                SwdjCustomized.SF56 sf56 = new SwdjCustomized.SF56();
                sf56.setSF02(sfgl1.getSf02());
                sf56.setSF13(sfgl1.getSf13());
                sf56.setSF26(sfgl1.getSf26());
                sf56.setSF32(sfgl1.getSf32());
                sf56.setSF33(sfgl1.getSf33());
                refDocList.add(sf56);
            }else if("FE_APP5.FFGL".equalsIgnoreCase(wfTask1.getWt03())){
                FFGL ffgl = ffglService.selectByPrimaryKey(wfTask1.getWt04());
                SwdjCustomized.SF56 sf56 = new SwdjCustomized.SF56();
                sf56.setSF02(ffgl.getFf02());
                sf56.setSF13(ffgl.getFf12());
                sf56.setSF26(ffgl.getFf31());
                sf56.setSF32(ffgl.getFf32());
                sf56.setSF33(ffgl.getFf30());
                refDocList.add(sf56);
            }
        }
        swdjCustomized.setRefDocList(refDocList);
        return swdjCustomized;
    }

    @Override
    public FileType getType() {
        return FileType.SWDJ;
    }
}
