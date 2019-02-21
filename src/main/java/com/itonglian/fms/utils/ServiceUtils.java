package com.itonglian.fms.utils;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.itonglian.fms.aspose.WordUtils;
import com.itonglian.fms.config.ftp.FtpUtil;
import com.itonglian.fms.service.bean.FtpList;
import com.itonglian.fms.service.common.FuturePieceTask;
import com.itonglian.fms.service.common.impl.AttPieceTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

@Component
@Slf4j
public class ServiceUtils {

    @Value(value = "${template.pdfPath}")
    private String pdfPath;
    @Autowired
    WordUtils wordUtils;
    @Autowired
    FtpUtil ftpUtil;


    public String getPdfName(){
        return UUID.randomUUID().toString()+".pdf";
    }

    public String getParentPath(String parentRoot){
        return File.separator+parentRoot+File.separator+ UUID.randomUUID().toString();
    }

    public FtpList.FtpDetail word2PdfThenUploadFtp(ListeningExecutorService executorService, CountDownLatch countDownLatch, String templatePath, String parentRoot){
        //目录
        FtpList.FtpDetail ftpDetail = new FtpList.FtpDetail();
        ftpDetail.setFileName(getPdfName());
        ftpDetail.setFilePath(getParentPath(parentRoot));
        executorService.execute(new AttPieceTask(countDownLatch, new FuturePieceTask() {
            @Override
            public void callback() throws Exception {
                String destPath = pdfPath+ File.separator+getPdfName();
                File destFile = new File(destPath);
                log.info(templatePath+File.separator+ftpDetail.getFileName()+"word转PDF...");
                if(!wordUtils.word2Pdf(templatePath,destPath)){
                    throw new Exception("转换PDF出错");
                }
                log.info(destPath+"上传FTP...");
                if(!ftpUtil.upload(ftpDetail.getFilePath(),ftpDetail.getFileName(),destFile)){
                    throw new Exception("上传FTP服务器出错");
                }
            }
        }));
        return ftpDetail;
    }


}
