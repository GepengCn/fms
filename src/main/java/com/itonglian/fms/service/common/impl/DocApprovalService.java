package com.itonglian.fms.service.common.impl;

import com.aspose.words.Document;
import com.aspose.words.FindReplaceDirection;
import com.aspose.words.FindReplaceOptions;
import com.aspose.words.License;
import com.itonglian.fms.service.bean.DocApprovalCustomized;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.BaseService;
import com.itonglian.fms.service.common.FuturePieceTask;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Slf4j
public class DocApprovalService extends BaseService {
    @Override
    public StringBuilder customizedImpl(Param param) throws Exception{
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<div>").append(param.getTaskId()).append(",").append(((DocApprovalCustomized)param.getCustomized()).getFF02()).append("</div>");
        int taskSize = 1;
        CountDownLatch countDownLatch = new CountDownLatch(taskSize);
        final String dataDir = "/Users/gepeng/Downloads/wordFolder/";

        for (int i = 0; i < taskSize; i++) {
            String filePath = dataDir+"Template"+i+".doc";
            InputStream in = new BufferedInputStream(new FileInputStream(new File(filePath)));
            executorService.execute(new AttPieceTask(countDownLatch, new FuturePieceTask() {
                @Override
                public void callback() throws Exception {
                    Document doc;
                    try {
                        doc = new Document(in);
                        doc.getRange().replace("#{userName}","gp",new FindReplaceOptions(FindReplaceDirection.FORWARD));
                        doc.setWarningCallback((warningInfo)->log.warn(warningInfo.getDescription()));
                        doc.save(dataDir +"/pdfFolder/"+ UUID.randomUUID().toString()+".pdf");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }));
        }

        if(!countDownLatch.await(10, TimeUnit.MINUTES)){
            throw new Exception("countDownLatch处理超时");
        }
        log.info("自定义任务执行完毕");
        return stringBuilder;
    }

}
