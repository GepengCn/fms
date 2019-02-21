package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.FFGL;
import com.itonglian.fms.entity.FMS_FILE;
import com.itonglian.fms.entity.WfTask;
import com.itonglian.fms.service.FFGLService;
import com.itonglian.fms.service.WfTaskService;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.FtpList;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.bean.WjbpdCustomized;
import com.itonglian.fms.service.common.BaseService;
import com.itonglian.fms.service.common.FuturePieceTask;
import com.itonglian.fms.utils.ServiceUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class WjbpdService extends BaseService {


    @Autowired
    FFGLService ffglService;
    @Autowired
    WfTaskService wfTaskService;
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
    private String coverParent;
    private String coverFileName;
    private String catalogParent;
    private String catalogFileName;
    private String refParent;
    private String refFileName;
    private String formParent;
    private String formFileName;

    @Override
    public FileType getType() {
        return FileType.WJPBD;
    }

    @Override
    public Param customizedImpl (Param param,FMS_FILE fmsFile) throws Exception{

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
                param.setCustomized(wjbpdCustomized);
            }
        }));
        FtpList ftpList = new FtpList();
        //封皮
        coverParent = serviceUtils.getParentPath(coverPath,fmsFile.getId());
        coverFileName = serviceUtils.getPdfName();
        serviceUtils.word2PdfThenUploadFtp(executorService,countDownLatch,coverPath,coverPath,catalogFileName);
        //目录
        catalogParent = serviceUtils.getParentPath(catalogPath,fmsFile.getId());
        catalogFileName = serviceUtils.getPdfName();
        serviceUtils.word2PdfThenUploadFtp(executorService, countDownLatch, catalogPath, catalogParent, catalogFileName);
        //备考表
        refParent = serviceUtils.getParentPath(refPath,fmsFile.getId());
        refFileName = serviceUtils.getPdfName();
        serviceUtils.word2PdfThenUploadFtp(executorService, countDownLatch, refPath, refParent, refFileName);
        //公文表单
        formParent = serviceUtils.getParentPath(formPath,fmsFile.getId());
        formFileName = serviceUtils.getPdfName();
        serviceUtils.word2PdfThenUploadFtp(executorService,countDownLatch,formPath,formParent,formFileName);

        if(!countDownLatch.await(15, TimeUnit.MINUTES)){
            throw new Exception("countDownLatch处理超时");
        }
        ftpList.setCoverFtp(new FtpList.FtpDetail(coverParent,coverFileName));
        ftpList.setCatalogFtp(new FtpList.FtpDetail(catalogParent,catalogFileName));
        ftpList.setRefFtp(new FtpList.FtpDetail(refParent,refFileName));
        ftpList.setFormFtp(new FtpList.FtpDetail(formParent,formFileName));
        ftpList.setDocFtp(new FtpList.FtpDetail(fmsFile.getTextpath(),fmsFile.getTextname()));
        ftpList.setAttFtp(new FtpList.FtpDetail(fmsFile.getAttachpath(),fmsFile.getAttachname()));
        param.setFtpList(ftpList);
        log.info("自定义任务执行完毕");
        return param;
    }

}
