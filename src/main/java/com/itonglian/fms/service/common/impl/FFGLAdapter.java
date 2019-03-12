package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.*;
import com.itonglian.fms.service.*;
import com.itonglian.fms.service.bean.*;
import com.itonglian.fms.service.common.BaseService;
import com.itonglian.fms.service.common.DocParser;
import com.itonglian.fms.service.common.FuturePieceTask;
import com.itonglian.fms.service.common.range.DwfwContentFilling;
import com.itonglian.fms.utils.FileManager;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public abstract class FFGLAdapter extends BaseService {

    @Autowired
    FFGLService ffglService;
    @Autowired
    WfTaskService wfTaskService;
    @Autowired
    SysAttachmentService sysAttachmentService;
    @Autowired
    WfInforService wfInforService;
    @Autowired
    SysUsersService sysUsersService;

    private String formPath;
    @Autowired
    FileManager fileManager;
    @Autowired
    DwfwContentFilling dwfwContentFilling;

    @Autowired
    SysGroupService sysGroupService;

    @Autowired
    DocParser docParser;

    public abstract  ContentFilling getContentFilling();
    public abstract String getFormPath();

    public abstract Map<String,String> getContents(FFGL ffgl);
    @Override
    public Param customizedImpl(Param param, FMS_TASK fmsTask) throws Exception {
        this.formPath = getFormPath();
        int taskSize = 7;
        CountDownLatch countDownLatch = new CountDownLatch(taskSize);
        WfTask wfTask = wfTaskService.selectByPrimaryKey(Long.parseLong(param.getTaskId()));
        FFGL ffgl = ffglService.selectByPrimaryKey(wfTask.getWt04());
        Future<Boolean> future = executorService.submit(new AttPieceTask(countDownLatch, new FuturePieceTask() {
            @Override
            public void callback() throws Exception {
                DwfwCustomized dwfwCustomized = new DwfwCustomized();
                dwfwCustomized.setFF02(ffgl.getFf02());
                dwfwCustomized.setFF03(ffgl.getFf03());
                dwfwCustomized.setFF04(ffgl.getFf04());
                dwfwCustomized.setFF07(ffgl.getFf07());
                dwfwCustomized.setFF11(ffgl.getFf11());
                dwfwCustomized.setFF12(ffgl.getFf12());
                dwfwCustomized.setFF14(ffgl.getFf14());
                dwfwCustomized.setFF15(ffgl.getFf15());
                dwfwCustomized.setFF16(ffgl.getFf16());
                dwfwCustomized.setFF17(ffgl.getFf17());
                dwfwCustomized.setFF18(ffgl.getFf18());
                dwfwCustomized.setFF25(ffgl.getFf25()==null?0:ffgl.getFf25());
                dwfwCustomized.setFF30(ffgl.getFf30());
                dwfwCustomized.setFF32(ffgl.getFf32());
                dwfwCustomized.setFF35(ffgl.getFf35());

                /*SYS_ATTACHMENTExample sysAttachmentExample = new SYS_ATTACHMENTExample();
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
                    WjbpdCustomized.FF52 ff52 = new WjbpdCustomized.FF52();
                    ff52.setFF02(ffgl1.getFf02());
                    ff52.setFF12(ffgl1.getFf12());
                    ff52.setFF30(ffgl1.getFf30());
                    ff52.setFF31(ffgl1.getFf31());
                    ff52.setFF32(ffgl1.getFf32());
                    List<WjbpdCustomized.FF52> refDocList = new ArrayList<>();
                    refDocList.add(ff52);
                    zyxwCustomized.setRefDocList(refDocList);
                }*/
                param.setCustomized(dwfwCustomized);


            }
        }));
        Future<Boolean> future1 = executorService.submit(new AttPieceTask(countDownLatch, new FuturePieceTask() {
            @Override
            public void callback() throws Exception {
                WF_INFORExample wfInforExample = new WF_INFORExample();
                wfInforExample.or().andWi01EqualTo(Long.parseLong(param.getTaskId()));
                List<WF_INFOR> wfInforList = wfInforService.selectByExample(wfInforExample);
                Iterator<WF_INFOR> iterator = wfInforList.iterator();
                List<HandlerDetail> handlerDetailList = new ArrayList<>();
                while(iterator.hasNext()){
                    WF_INFOR wfInfor = iterator.next();
                    HandlerDetail handlerDetail = new HandlerDetail();
                    if(wfInfor.getWi05()!=null){
                        handlerDetail.setHandlerUser(sysUsersService.selectByPrimaryKey(Long.parseLong(wfInfor.getWi05())).getSu02());
                    }
                    handlerDetail.setLastHandlerUser(sysUsersService.selectByPrimaryKey(Long.parseLong(wfInfor.getWi15())).getSu02());
                    handlerDetail.setHandlerComment(wfInfor.getWi20());
                    handlerDetail.setHandlerStatus(wfInfor.getWi13());
                    handlerDetail.setHandlerTime(new DateTime(wfInfor.getWi11()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
                    handlerDetail.setSendTime(new DateTime(wfInfor.getWi08()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
                    handlerDetailList.add(handlerDetail);
                }
                param.setHandlerDetailList(handlerDetailList);
            }
        }));
        List<FtpFile> ftpFileList = new ArrayList<>();
        //封皮
        ftpFileList.add(fileManager.handler(executorService,countDownLatch,fmsTask.getParentroot(),TemplateType.cover,FtpFile.createSimpleFtpFile(fmsTask.getParentroot(),0,0)));
        //目录
        ftpFileList.add(fileManager.handler(executorService,countDownLatch,fmsTask.getParentroot(),TemplateType.catalog,FtpFile.createSimpleFtpFile(fmsTask.getParentroot(),1,1)));
        //备考表
        ftpFileList.add(fileManager.handler(executorService,countDownLatch,fmsTask.getParentroot(),TemplateType.ref,FtpFile.createSimpleFtpFile(fmsTask.getParentroot(),5,5)));
        //公文表单
        Map<String,String> contents = getContents(ffgl);

        contents.put("FF02",ffgl.getFf02());

        ftpFileList.add(fileManager.handler(executorService, countDownLatch, formPath, fmsTask.getParentroot(),getContentFilling(),contents,wfTask.getWt00(),FtpFile.createSimpleFtpFile(fmsTask.getParentroot(),2,2)));
        //正文
        FtpFile docFtpFile = new FtpFile(fmsTask.getTextpath(),fmsTask.getTextname(),3,3);
        ftpFileList.add(docFtpFile);
        //附件
        ftpFileList.add(new FtpFile(fmsTask.getAttachpath(),fmsTask.getAttachname(),4,4));

        Future<Boolean> future2 = executorService.submit(new AttPieceTask(countDownLatch, new FuturePieceTask() {
            @Override
            public void callback() throws Exception {
                docParser.execute(docFtpFile);
            }
        }));

        if(!future.get()||!future1.get()||!future2.get()){
            throw new Exception("业务处理出错...");
        }
        if(!countDownLatch.await(15, TimeUnit.MINUTES)){
            throw new Exception("countDownLatch处理超时...");
        }
        param.setFtpList(ftpFileList);

        log.info("自定义任务执行完毕...");
        return param;
    }
}
