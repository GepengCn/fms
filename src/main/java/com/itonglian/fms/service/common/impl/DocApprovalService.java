package com.itonglian.fms.service.common.impl;

import com.aspose.words.*;
import com.google.common.util.concurrent.FutureCallback;
import com.itonglian.fms.service.bean.DocApprovalParam;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.BaseService;
import com.itonglian.fms.service.common.FuturePieceTask;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.io.*;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class DocApprovalService extends BaseService {
    @Override
    public StringBuilder customizedImpl(Param param) throws Exception{
        StringBuilder stringBuilder = new StringBuilder();
        DocApprovalParam docApprovalParam = (DocApprovalParam)param;
        stringBuilder.append("<div>").append(docApprovalParam.getTaskId()).append(",").append(docApprovalParam.getFlowNo()).append("</div>");
        int taskSize = 1;
        CountDownLatch countDownLatch = new CountDownLatch(taskSize);
        License lic = new License();
        try {
            lic.setLicense(new FileInputStream(new File("/Users/gepeng/Downloads/Aspose.Words18.lic")));
        } catch (Exception e) {
            e.printStackTrace();
        }
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
                       /* doc.setWarningCallback(new IWarningCallback() {
                            @Override
                            public void warning(WarningInfo warningInfo) {
                                //log.warn(warningInfo.getDescription());
                            }
                        });*/
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


    public static void main(String[] args) throws IOException {

       /* for (int i = 0; i <100 ; i++) {
            FileUtils.copyFile(new File("/Users/gepeng/Downloads/Template.doc"),new File("/Users/gepeng/Downloads/wordFolder/Template"+i+".doc"));
        }*/

        new Thread(new Task()).start();


    }

    public static class Task implements Runnable{

        @Override
        public void run() {
            long start = System.currentTimeMillis();
            DocApprovalService docApprovalService = new DocApprovalService();
            DocApprovalParam param = new DocApprovalParam();
            param.setTaskId("123");
            param.setFlowNo("456");
            docApprovalService.execute(param, new FutureCallback<String>() {
                @Override
                public void onSuccess(@Nullable String s) {
                    log.info("xmlString:"+s);
                    log.info("耗时:"+(System.currentTimeMillis()-start)+"秒");
                }

                @Override
                public void onFailure(Throwable throwable) {
                    log.error("error",throwable);
                }
            });
        }
    }
}
