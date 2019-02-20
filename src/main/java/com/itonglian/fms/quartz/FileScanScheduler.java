package com.itonglian.fms.quartz;

import com.google.common.util.concurrent.FutureCallback;
import com.itonglian.fms.entity.FMS_FILE;
import com.itonglian.fms.entity.FMS_FILEExample;
import com.itonglian.fms.service.FmsFileService;
import com.itonglian.fms.service.bean.*;
import com.itonglian.fms.service.common.CustomizedContext;
import com.itonglian.fms.service.common.FileStatusManager;
import com.itonglian.fms.service.common.impl.DocApprovalService;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

@Component
@Configurable
@EnableScheduling
@Slf4j
public class FileScanScheduler {

    @Autowired
    FmsFileService fmsFileService;
    @Autowired
    FileStatusManager fileStatusManager;
    @Autowired
    CustomizedContext customizedContext;

    @Scheduled(fixedRate = 1000 * 10,initialDelay = 1000*10)
    public void reportCurrentTime() throws Exception {
        FMS_FILEExample fmsFileExample = new FMS_FILEExample();
        fmsFileExample.or().andStatusEqualTo(100l);
        long count = fmsFileService.countByExample(fmsFileExample);
        log.info("查询到待归档数据数量:"+count);
        if(count==0){
            log.info("不必执行归档...");
            return;
        }
        log.info("开始执行归档...");

        List<FMS_FILE> fmsFiles = fmsFileService.selectByExample(fmsFileExample);

        Iterator<FMS_FILE> iterator = fmsFiles.iterator();

        while(iterator.hasNext()){
            FMS_FILE fmsFile = iterator.next();
            log.info("正在归档的公文:taskId=["+fmsFile.getTaskid()+"]");
            log.info("正在归档的公文类型:fileType=["+fmsFile.getFiletype()+"]");
            fileStatusManager.setStatus(fmsFile, FileStatus.STATUS_101);
            Param param = new Param();
            param.setTaskId(fmsFile.getTaskid());
            int type = fmsFile.getFiletype().intValue();
            param.setType(type);
            param.setTitle(fmsFile.getTitle());
            param.setDrafter(fmsFile.getDraftlogin());
            param.setDrafterName(fmsFile.getDraftname());
            param.setTaskId(fmsFile.getTaskid());
            FtpList ftpList = new FtpList();
            ftpList.setDocFtp(new FtpList.FtpDetail(fmsFile.getTextpath(),fmsFile.getTextname()));
            ftpList.setAttFtp(new FtpList.FtpDetail(fmsFile.getAttachpath(),fmsFile.getAttachname()));
            customizedContext.execute(FileType.parse(type),param,new FutureCallback<String>() {
                @Override
                public void onSuccess(@Nullable String s) {
                    log.info("xmlString:"+s);
                    log.info("归档任务执行结束");
                    fileStatusManager.setStatus(fmsFile, FileStatus.STATUS_102);
                }

                @Override
                public void onFailure(Throwable throwable) {
                    log.error("error",throwable);
                    fileStatusManager.setStatus(fmsFile, FileStatus.STATUS_103);
                }
            });




        }
    }

}
