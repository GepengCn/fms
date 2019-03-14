package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.*;
import com.itonglian.fms.service.*;
import com.itonglian.fms.service.bean.*;
import com.itonglian.fms.service.common.BaseService;
import com.itonglian.fms.service.common.DocParser;
import com.itonglian.fms.service.common.FuturePieceTask;
import com.itonglian.fms.service.common.SFGLService;
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
public abstract class SFGLAdapter extends BaseService {

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
    SFGLService sfglService;

    @Autowired
    FFGLService ffglService;

    @Autowired
    DocParser docParser;

    @Autowired
    SysGroupService sysGroupService;

    public abstract ContentFilling getContentFilling();
    public abstract String getFormPath();

    public abstract Map<String,String> getContents(SFGL sfgl);

    public abstract Customized getCustomized(SFGL sfgl);

    @Override
    public Param customizedImpl(Param param, FMS_TASK fmsTask) throws Exception {
        this.formPath = getFormPath();
        int taskSize = 7;
        CountDownLatch countDownLatch = new CountDownLatch(taskSize);
        WfTask wfTask = wfTaskService.selectByPrimaryKey(Long.parseLong(param.getTaskId()));
        SFGL sfgl = sfglService.selectByPrimaryKey(wfTask.getWt04());
        Future<Boolean> future = executorService.submit(new AttPieceTask(countDownLatch, new FuturePieceTask() {
            @Override
            public void callback() throws Exception {
                param.setCustomized(getCustomized(sfgl));
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
        Map<String,String> contents = getContents(sfgl);

        contents.put("SF02",sfgl.getSf02());
        contents.put("BARCODE",sfgl.getSf02());

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
