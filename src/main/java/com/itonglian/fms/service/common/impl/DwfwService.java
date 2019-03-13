package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.FFGL;
import com.itonglian.fms.entity.SYS_ATTACHMENT;
import com.itonglian.fms.entity.SYS_ATTACHMENTExample;
import com.itonglian.fms.entity.WfTask;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.bean.Customized;
import com.itonglian.fms.service.bean.DwfwCustomized;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.common.range.DwfwContentFilling;
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
    public Customized getCustomized(FFGL ffgl) {
        DwfwCustomized dwfwCustomized = new DwfwCustomized();
        dwfwCustomized.setFF07(ffgl.getFf07());
        dwfwCustomized.setFF03(ffgl.getFf03());
        dwfwCustomized.setFF04(ffgl.getFf04());
        dwfwCustomized.setFF17(ffgl.getFf17());
        dwfwCustomized.setFF18(ffgl.getFf18());
        dwfwCustomized.setFF32(ffgl.getFf32());
        dwfwCustomized.setFF30(ffgl.getFf30());
        dwfwCustomized.setFF25(ffgl.getFf25());
        dwfwCustomized.setFF11(ffgl.getFf11());
        dwfwCustomized.setFF35(ffgl.getFf35());
        dwfwCustomized.setFF16(ffgl.getFf16());
        dwfwCustomized.setFF12(ffgl.getFf12());
        dwfwCustomized.setFF02(ffgl.getFf02());
        dwfwCustomized.setFF14(ffgl.getFf14());
        dwfwCustomized.setFF15(ffgl.getFf15());
        SYS_ATTACHMENTExample sysAttachmentExample = new SYS_ATTACHMENTExample();
        sysAttachmentExample.or().andSa01EqualTo(ffgl.getFf52());
        List<SYS_ATTACHMENT> sysAttachmentList = sysAttachmentService.selectByExample(sysAttachmentExample);
        Iterator<SYS_ATTACHMENT> iterator = sysAttachmentList.iterator();
        while(iterator.hasNext()){
            SYS_ATTACHMENT sysAttachment = iterator.next();
            String taskId = sysAttachment.getSa02();
            WfTask wfTask1 =  wfTaskService.selectByPrimaryKey(Long.parseLong(taskId));
            if(!"FE_APP5.FFGL".equalsIgnoreCase(wfTask1.getWt03())){
                continue;
            }
            FFGL ffgl1 = ffglService.selectByPrimaryKey(wfTask1.getWt04());
            DwfwCustomized.FF52 ff52 = new DwfwCustomized.FF52();
            ff52.setFF02(ffgl1.getFf02());
            ff52.setFF12(ffgl1.getFf12());
            ff52.setFF30(ffgl1.getFf30());
            ff52.setFF31(ffgl1.getFf31());
            ff52.setFF32(ffgl1.getFf32());
            List<DwfwCustomized.FF52> refDocList = new ArrayList<>();
            refDocList.add(ff52);
            dwfwCustomized.setRefDocList(refDocList);
        }
        return dwfwCustomized;
    }

}
