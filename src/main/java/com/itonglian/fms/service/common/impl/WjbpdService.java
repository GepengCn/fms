package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.*;
import com.itonglian.fms.service.*;
import com.itonglian.fms.service.bean.*;
import com.itonglian.fms.service.common.BaseService;
import com.itonglian.fms.service.common.FuturePieceTask;
import com.itonglian.fms.utils.ServiceUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class WjbpdService extends BaseService {


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

    @Value(value = "${template.coverPath}")
    private String coverPath;
    @Value(value = "${template.catalogPath}")
    private String catalogPath;
    @Value(value = "${template.refPath}")
    private String refPath;
    @Value(value = "${template.formPath}")
    private String formPath;
    @Autowired
    ServiceUtils serviceUtils;

    @Override
    public FileType getType() {
        return FileType.WJPBD;
    }

    @Override
    public Param customizedImpl (Param param, FMS_TASK fmsTask) throws Exception{

        int taskSize = 5;
        CountDownLatch countDownLatch = new CountDownLatch(taskSize);
        executorService.execute(new AttPieceTask(countDownLatch, new FuturePieceTask() {
            @Override
            public void callback() throws Exception {
                WfTask wfTask = wfTaskService.selectByPrimaryKey(Long.parseLong(param.getTaskId()));
                FFGL ffgl = ffglService.selectByPrimaryKey(wfTask.getWt04());
                WjbpdCustomized wjbpdCustomized = new WjbpdCustomized();
                wjbpdCustomized.setFF03(ffgl.getFf03());
                wjbpdCustomized.setFF04(ffgl.getFf04());
                wjbpdCustomized.setFF02(ffgl.getFf02());
                wjbpdCustomized.setFF12(ffgl.getFf12());
                wjbpdCustomized.setFF14(ffgl.getFf14());
                wjbpdCustomized.setFF15(ffgl.getFf15());
                wjbpdCustomized.setFF30(ffgl.getFf30());
                wjbpdCustomized.setFF31(ffgl.getFf31());
                wjbpdCustomized.setFF32(ffgl.getFf32());
                wjbpdCustomized.setFF36(ffgl.getFf36());
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
                    WjbpdCustomized.FF52 ff52 = new WjbpdCustomized.FF52();
                    ff52.setFF02(ffgl1.getFf02());
                    ff52.setFF12(ffgl1.getFf12());
                    ff52.setFF30(ffgl1.getFf30());
                    ff52.setFF31(ffgl1.getFf31());
                    ff52.setFF32(ffgl1.getFf32());
                    List<WjbpdCustomized.FF52> refDocList = new ArrayList<>();
                    refDocList.add(ff52);
                    wjbpdCustomized.setRefDocList(refDocList);
                }
                param.setCustomized(wjbpdCustomized);


            }
        }));
        executorService.execute(new AttPieceTask(countDownLatch, new FuturePieceTask() {
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
                    handlerDetail.setHandlerUser(sysUsersService.selectByPrimaryKey(Long.parseLong(wfInfor.getWi05())).getSu02());
                    handlerDetail.setLastHandlerUser(sysUsersService.selectByPrimaryKey(Long.parseLong(wfInfor.getWi15())).getSu02());
                    handlerDetail.setHandlerComment(wfInfor.getWi20());
                    handlerDetail.setHandlerStatus(wfInfor.getWi13());
                    Date date = wfInfor.getWi11();
                    handlerDetail.setHandlerTime(date==null?"":date.toString());
                    handlerDetail.setSendTime(wfInfor.getWi08()==null?"":wfInfor.getWi08().toString());
                    handlerDetailList.add(handlerDetail);
                }
                param.setHandlerDetailList(handlerDetailList);
            }
        }));
        FtpList ftpList = new FtpList();
        //封皮
        ftpList.setCoverFtp(serviceUtils.word2PdfThenUploadFtp(executorService,countDownLatch,coverPath,fmsTask.getParentroot()));
        //目录
        ftpList.setCatalogFtp(serviceUtils.word2PdfThenUploadFtp(executorService, countDownLatch, catalogPath,fmsTask.getParentroot()));
        //备考表
        ftpList.setRefFtp(serviceUtils.word2PdfThenUploadFtp(executorService, countDownLatch, refPath, fmsTask.getParentroot()));
        //公文表单
        ftpList.setFormFtp(serviceUtils.word2PdfThenUploadFtp(executorService,countDownLatch,formPath,fmsTask.getParentroot()));
        //正文
        ftpList.setDocFtp(new FtpList.FtpDetail(fmsTask.getTextpath(),fmsTask.getTextname()));
        //附件
        ftpList.setAttFtp(new FtpList.FtpDetail(fmsTask.getAttachpath(),fmsTask.getAttachname()));
        if(!countDownLatch.await(15, TimeUnit.MINUTES)){
            throw new Exception("countDownLatch处理超时");
        }
        param.setFtpList(ftpList);
        log.info("自定义任务执行完毕");
        return param;
    }

}
