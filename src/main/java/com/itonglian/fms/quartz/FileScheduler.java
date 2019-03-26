package com.itonglian.fms.quartz;

import com.alibaba.fastjson.JSON;
import com.google.common.util.concurrent.FutureCallback;
import com.itonglian.fms.entity.FMS_DATAWithBLOBs;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.FMS_TASKExample;
import com.itonglian.fms.service.FmsDataService;
import com.itonglian.fms.service.FmsTaskService;
import com.itonglian.fms.service.bean.FileStatus;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.BaseContext;
import com.itonglian.fms.service.common.FileStatusManager;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Component
@Configurable
@EnableScheduling
@Slf4j
public class FileScheduler {

    @Autowired
    FmsTaskService fmsTaskService;
    @Autowired
    FileStatusManager fileStatusManager;
    @Autowired
    FmsDataService fmsDataService;
    @Autowired
    FileUpdateJob fileUpdateJob;
    @Autowired
    BaseContext baseContext;

    @Scheduled(fixedRate = 1000 * 10,initialDelay = 1000*10)
    public void execute() throws Exception {
        FMS_TASKExample fmsFileExample = new FMS_TASKExample();
        fmsFileExample.or().andStatusEqualTo(100l);
        long count = fmsTaskService.countByExample(fmsFileExample);
        log.debug("查询到待归档数据数量:[{}]",count);
        if(count==0){
            return;
        }
        List<FMS_TASK> fmsFiles = fmsTaskService.selectByExample(fmsFileExample);

        Iterator<FMS_TASK> iterator = fmsFiles.iterator();

        while(iterator.hasNext()){
            FMS_TASK fmsFile = iterator.next();
            log.debug("开始执行归档...");
            log.debug("正在归档的公文:taskId=[{}]",fmsFile.getTaskid());
            log.debug("正在归档的公文类型:fileType=[{}]",fmsFile.getFiletype());
            fileStatusManager.setStatus(fmsFile, FileStatus.STATUS_101);
            baseContext.execute(fmsFile,new FutureCallback<Param>() {
                @Override
                public void onSuccess(@Nullable Param commonDatas) {
                    log.debug("taskId:[{}]",commonDatas.getTaskId());
                    log.debug("json:[{}]",JSON.toJSONString(commonDatas));

                    fileStatusManager.setStatus(fmsFile, FileStatus.STATUS_102);
                    FMS_DATAWithBLOBs fmsData = new FMS_DATAWithBLOBs();
                    fmsData.setDataid(UUID.randomUUID().toString());
                    fmsData.setDr("N");
                    fmsData.setTs(DateTime.now().toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
                    fmsData.setCommon(JSON.toJSONString(commonDatas).getBytes());
                    fmsData.setCustomized(JSON.toJSONString(commonDatas.getCustomized()).getBytes());
                    fmsDataService.insert(fmsData);
                    fmsFile.setDataid(fmsData.getDataid());
                    fmsFile.setHandlersize((long)commonDatas.getHandlerDetailList().size());
                    fmsTaskService.updateByPrimaryKey(fmsFile);
                    log.debug("归档任务执行结束");
                }

                @Override
                public void onFailure(Throwable throwable) {
                    log.error("error",throwable);
                    fileStatusManager.setStatus(fmsFile, FileStatus.STATUS_103);
                }
            });




        }
    }

    /*@Scheduled(fixedRate = 1000*10,initialDelay = 1000*10)
    public void doFileUpdate() throws Exception {
        fileUpdateJob.doFileUpdate();
    }*/

}
