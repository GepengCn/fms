package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.*;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.bean.Customized;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.YfwCustomized;
import com.itonglian.fms.service.bean.ZyxwCustomized;
import com.itonglian.fms.service.common.range.YfwContentFilling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

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
    public Customized getCustomized(FFGL ffgl) {
        YfwCustomized yfwCustomized = new YfwCustomized();
        yfwCustomized.setFF07(ffgl.getFf07());
        yfwCustomized.setFF03(ffgl.getFf03());
        yfwCustomized.setFF04(ffgl.getFf04());
        yfwCustomized.setFF17(ffgl.getFf17());
        yfwCustomized.setFF18(ffgl.getFf18());
        yfwCustomized.setFF32(ffgl.getFf32());
        yfwCustomized.setFF30(ffgl.getFf30());
        yfwCustomized.setFF25(ffgl.getFf25());
        yfwCustomized.setFF11(ffgl.getFf11());
        yfwCustomized.setFF35(ffgl.getFf35());
        yfwCustomized.setFF16(ffgl.getFf16());
        yfwCustomized.setFF12(ffgl.getFf12());
        yfwCustomized.setFF02(ffgl.getFf02());
        yfwCustomized.setFF14(ffgl.getFf14());
        yfwCustomized.setFF15(ffgl.getFf15());
        SYS_ATTACHMENTExample sysAttachmentExample = new SYS_ATTACHMENTExample();
        sysAttachmentExample.or().andSa01EqualTo(ffgl.getFf52());
        List<SYS_ATTACHMENT> sysAttachmentList = sysAttachmentService.selectByExample(sysAttachmentExample);
        Iterator<SYS_ATTACHMENT> iterator = sysAttachmentList.iterator();
        List<YfwCustomized.FF52> refDocList = new ArrayList<>();
        while(iterator.hasNext()){
            SYS_ATTACHMENT sysAttachment = iterator.next();
            String taskId = sysAttachment.getSa02();
            WfTask wfTask1 =  wfTaskService.selectByPrimaryKey(Long.parseLong(taskId));
            if("FE_APP5.FFGL".equalsIgnoreCase(wfTask1.getWt03())){
                FFGL ffgl1 = ffglService.selectByPrimaryKey(wfTask1.getWt04());
                YfwCustomized.FF52 ff52 = new YfwCustomized.FF52();
                ff52.setFF02(ffgl1.getFf02());
                ff52.setFF12(ffgl1.getFf12());
                ff52.setFF30(ffgl1.getFf30());
                ff52.setFF31(ffgl1.getFf31());
                ff52.setFF32(ffgl1.getFf32());
                refDocList.add(ff52);
            }else if("FE_APP5.SFGL".equalsIgnoreCase(wfTask1.getWt03())){
                SFGL sfgl1 = sfglService.selectByPrimaryKey(wfTask1.getWt04());
                YfwCustomized.FF52 ff52 = new YfwCustomized.FF52();
                ff52.setFF02(sfgl1.getSf02());
                ff52.setFF12(sfgl1.getSf13());
                ff52.setFF30(sfgl1.getSf33());
                ff52.setFF31(sfgl1.getSf26());
                ff52.setFF32(sfgl1.getSf32());
                refDocList.add(ff52);
            }

        }
        yfwCustomized.setRefDocList(refDocList);
        return yfwCustomized;
    }

    @Override
    public FileType getType() {

        return FileType.YFW;
    }
}
