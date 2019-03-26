package com.itonglian.fms.service.common.task;

import com.itonglian.fms.entity.*;
import com.itonglian.fms.log.OperationLog;
import com.itonglian.fms.service.FFGLService;
import com.itonglian.fms.service.SysAttachmentService;
import com.itonglian.fms.service.WfTaskService;
import com.itonglian.fms.service.bean.*;
import com.itonglian.fms.service.common.SFGLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CustomizedTask {

    @Autowired
    SysAttachmentService sysAttachmentService;

    @Autowired
    WfTaskService wfTaskService;

    @Autowired
    FFGLService ffglService;

    @Autowired
    SFGLService sfglService;

    @OperationLog(description = "查询个性化数据")
    public Customized getWjbpdCustomized(String taskId, FFGL ffgl) {
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

        SYS_ATTACHMENTExample sysAttachmentExample = new SYS_ATTACHMENTExample();
        sysAttachmentExample.or().andSa01EqualTo(ffgl.getFf52());
        List<SYS_ATTACHMENT> sysAttachmentList = sysAttachmentService.selectByExample(sysAttachmentExample);
        Iterator<SYS_ATTACHMENT> iterator = sysAttachmentList.iterator();
        List<WjbpdCustomized.FF52> refDocList = new ArrayList<>();
        while(iterator.hasNext()){
            SYS_ATTACHMENT sysAttachment = iterator.next();
            WfTask wfTask1 =  wfTaskService.selectByPrimaryKey(Long.parseLong(sysAttachment.getSa02()));
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
        wjbpdCustomized.setRefDocList(refDocList);
        return wjbpdCustomized;
    }

    @OperationLog(description = "查询个性化数据")
    public Customized getZyxwCustomized(String taskId, FFGL ffgl) {
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
            WfTask wfTask1 =  wfTaskService.selectByPrimaryKey(Long.parseLong(sysAttachment.getSa02()));
            if("FE_APP5.FFGL".equalsIgnoreCase(wfTask1.getWt03())){
                FFGL ffgl1 = ffglService.selectByPrimaryKey(wfTask1.getWt04());
                ZyxwCustomized.FF52 ff52 = new ZyxwCustomized.FF52();
                ff52.setFF02(ffgl1.getFf02());
                ff52.setFF12(ffgl1.getFf12());
                ff52.setFF30(ffgl1.getFf30());
                ff52.setFF31(ffgl1.getFf31());
                ff52.setFF32(ffgl1.getFf32());
                refDocList.add(ff52);
            }else if("FE_APP5.SFGL".equalsIgnoreCase(wfTask1.getWt03())){
                SFGL sfgl1 = sfglService.selectByPrimaryKey(wfTask1.getWt04());
                ZyxwCustomized.FF52 ff52 = new ZyxwCustomized.FF52();
                ff52.setFF02(sfgl1.getSf02());
                ff52.setFF12(sfgl1.getSf13());
                ff52.setFF30(sfgl1.getSf33());
                ff52.setFF31(sfgl1.getSf26());
                ff52.setFF32(sfgl1.getSf32());
                refDocList.add(ff52);
            }

        }
        zyxwCustomized.setRefDocList(refDocList);
        return zyxwCustomized;
    }
    @OperationLog(description = "查询个性化数据")
    public Customized getDwfwCustomized(String taskId,FFGL ffgl) {
        DwfwCustomized dwfwCustomized = new DwfwCustomized();
        dwfwCustomized.setFF07(ffgl.getFf07());
        dwfwCustomized.setFF03(ffgl.getFf03());
        dwfwCustomized.setFF04(ffgl.getFf04());
        dwfwCustomized.setFF17(ffgl.getFf17());
        dwfwCustomized.setFF18(ffgl.getFf18());
        dwfwCustomized.setFF32(ffgl.getFf32());
        dwfwCustomized.setFF30(ffgl.getFf30());
        dwfwCustomized.setFF25(ffgl.getFf25()==null?0:ffgl.getFf25());
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
        List<DwfwCustomized.FF52> refDocList = new ArrayList<>();
        while(iterator.hasNext()){
            SYS_ATTACHMENT sysAttachment = iterator.next();
            WfTask wfTask1 =  wfTaskService.selectByPrimaryKey(Long.parseLong(sysAttachment.getSa02()));
            if("FE_APP5.FFGL".equalsIgnoreCase(wfTask1.getWt03())){
                FFGL ffgl1 = ffglService.selectByPrimaryKey(wfTask1.getWt04());
                DwfwCustomized.FF52 ff52 = new DwfwCustomized.FF52();
                ff52.setFF02(ffgl1.getFf02());
                ff52.setFF12(ffgl1.getFf12());
                ff52.setFF30(ffgl1.getFf30());
                ff52.setFF31(ffgl1.getFf31());
                ff52.setFF32(ffgl1.getFf32());
                refDocList.add(ff52);
            }else if("FE_APP5.SFGL".equalsIgnoreCase(wfTask1.getWt03())){
                SFGL sfgl1 = sfglService.selectByPrimaryKey(wfTask1.getWt04());
                DwfwCustomized.FF52 ff52 = new DwfwCustomized.FF52();
                ff52.setFF02(sfgl1.getSf02());
                ff52.setFF12(sfgl1.getSf13());
                ff52.setFF30(sfgl1.getSf33());
                ff52.setFF31(sfgl1.getSf26());
                ff52.setFF32(sfgl1.getSf32());
                refDocList.add(ff52);
            }

        }
        dwfwCustomized.setRefDocList(refDocList);
        return dwfwCustomized;
    }
    @OperationLog(description = "查询个性化数据")
    public Customized getDzfwCustomized(String taskId,FFGL ffgl) {
        DzfwCustomized dzfwCustomized = new DzfwCustomized();
        dzfwCustomized.setFF02(ffgl.getFf02());
        dzfwCustomized.setFF03(ffgl.getFf03());
        dzfwCustomized.setFF04(ffgl.getFf04());
        dzfwCustomized.setFF07(ffgl.getFf07());
        dzfwCustomized.setFF12(ffgl.getFf12());
        dzfwCustomized.setFF14(ffgl.getFf14());
        dzfwCustomized.setFF15(ffgl.getFf15());
        dzfwCustomized.setFF17(ffgl.getFf17());
        dzfwCustomized.setFF18(ffgl.getFf18());
        dzfwCustomized.setFF22(ffgl.getFf22());
        dzfwCustomized.setFF23(ffgl.getFf23());
        dzfwCustomized.setFF25(ffgl.getFf25()==null?0:ffgl.getFf25());
        dzfwCustomized.setFF30(ffgl.getFf30());
        dzfwCustomized.setFF32(ffgl.getFf32());
        dzfwCustomized.setFF35(ffgl.getFf35());
        return dzfwCustomized;
    }
    @OperationLog(description = "查询个性化数据")
    public Customized getYfwCustomized(String taskId,FFGL ffgl) {
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
            WfTask wfTask1 =  wfTaskService.selectByPrimaryKey(Long.parseLong(sysAttachment.getSa02()));
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
    @OperationLog(description = "查询个性化数据")
    public Customized getSwdjCustomized(String taskId,SFGL sfgl) {
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
            WfTask wfTask1 =  wfTaskService.selectByPrimaryKey(Long.parseLong(sysAttachment.getSa02()));
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
}
