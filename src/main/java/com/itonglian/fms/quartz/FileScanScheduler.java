package com.itonglian.fms.quartz;

import com.google.common.util.concurrent.FutureCallback;
import com.itonglian.fms.entity.FmsFile;
import com.itonglian.fms.entity.FmsFileExample;
import com.itonglian.fms.service.FmsFileService;
import com.itonglian.fms.service.bean.Customized;
import com.itonglian.fms.service.bean.DocApprovalCustomized;
import com.itonglian.fms.service.bean.FileStatus;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.FileStatusManager;
import com.itonglian.fms.service.common.impl.DocApprovalService;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.nullness.qual.Nullable;
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

    @Scheduled(fixedRate = 1000 * 10,initialDelay = 1000*10)
    public void reportCurrentTime(){
        FmsFileExample fmsFileExample = new FmsFileExample();
        fmsFileExample.or().andStatusEqualTo(100);
        long count = fmsFileService.countByExample(fmsFileExample);
        log.info("查询到待归档数据数量:"+count);
        if(count==0){
            log.info("不必执行归档...");
            return;
        }
        log.info("开始执行归档...");

        List<FmsFile> fmsFiles = fmsFileService.selectByExample(fmsFileExample);

        Iterator<FmsFile> iterator = fmsFiles.iterator();

        while(iterator.hasNext()){
            FmsFile fmsFile = iterator.next();
            log.info("正在归档的公文:taskId=["+fmsFile.getTaskid()+"]");
            fileStatusManager.setStatus(fmsFile, FileStatus.STATUS_101);
            DocApprovalService docApprovalService = new DocApprovalService();
            Param param = new Param();
            param.setTaskId(fmsFile.getTaskid());
            DocApprovalCustomized customized = new DocApprovalCustomized();
            //customized.setFlowNo("456");
            param.setCustomized(customized);
            docApprovalService.execute(param, new FutureCallback<String>() {
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
