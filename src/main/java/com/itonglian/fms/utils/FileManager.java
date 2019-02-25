package com.itonglian.fms.utils;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.itonglian.fms.aspose.WordUtils;
import com.itonglian.fms.config.ftp.FtpUtil;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.bean.FileType;
import com.itonglian.fms.service.bean.FtpList;
import com.itonglian.fms.service.bean.TemplateType;
import com.itonglian.fms.service.common.FuturePieceTask;
import com.itonglian.fms.service.common.impl.AttPieceTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

@Component
@Slf4j
public class FileManager {

    @Value(value = "${template.pdfPath}")
    private String pdfPath;
    @Autowired
    WordUtils wordUtils;
    @Autowired
    FtpUtil ftpUtil;

    private static final String WJBPD = "文件报批单";

    private static final String ZYXW = "自由行文";

    private static final String DWFW = "单位发文";

    private static final String DZFW = "党组发文";

    private static final String YFW = "院发文";

    private static final String SWDJ = "收文登记";

    private static final String YJFS = "阅件发送";

    @Value(value = "${template.coverPath}")
    private String coverPath;
    @Value(value = "${template.catalogPath}")
    private String catalogPath;
    @Value(value = "${template.refPath}")
    private String refPath;
    @Value(value = "${template.docPath}")
    private String docPath;
    @Value(value = "${template.attPath}")
    private String attPath;


    public String getRandomFileName(){
        return UUID.randomUUID().toString()+".pdf";
    }

    public String getPdfSuffix(String value){
        return value+".pdf";
    }
    public String getCustomizedFileName(FileType fileType) throws Exception {
        switch (fileType){
            case WJPBD:
                return getPdfSuffix(WJBPD);
            case ZYXW:
                return getPdfSuffix(ZYXW);
            case DWFW:
                return getPdfSuffix(DWFW);
            case DZFW:
                return getPdfSuffix(DZFW);
            case YFW:
                return getPdfSuffix(YFW);
            case SWDJ:
                return getPdfSuffix(SWDJ);
            case YJFS:
                return getPdfSuffix(YJFS);
            default:
                throw new Exception("未知公文");
        }

    }

    public String getCustomizedTemplatePath(TemplateType templateType) throws Exception {
        switch (templateType){
            case doc:
                return docPath;
            case att:
                return attPath;
            case cover:
                return coverPath;
            case catalog:
                return catalogPath;
            case ref:
                return refPath;
            default:
                throw new Exception("未知模版");
        }

    }

    public String getParentPath(String parentRoot){
        return File.separator+parentRoot+File.separator+ UUID.randomUUID().toString();
    }

    public FtpList.FtpDetail handler(ListeningExecutorService executorService, CountDownLatch countDownLatch, String parentDir,TemplateType templateType,FileType fileType) throws Exception {
        FtpList.FtpDetail ftpDetail = new FtpList.FtpDetail();
        String fileName = getRandomFileName();
        ftpDetail.setFileName(fileName);
        ftpDetail.setFilePath(getParentPath(parentDir));
        executorService.execute(new AttPieceTask(countDownLatch, new FuturePieceTask() {
            @Override
            public void callback() throws Exception {
                String tempDestPath = pdfPath+ File.separator+fileName;
                File destFile = new File(tempDestPath);
                String templatePath = getCustomizedTemplatePath(templateType);
                log.info(templatePath+"word转PDF...");
                if(!wordUtils.word2Pdf(templatePath,tempDestPath)){
                    throw new Exception("转换PDF出错");
                }
                log.info(tempDestPath+"上传FTP...");
                if(!ftpUtil.upload(ftpDetail.getFilePath(),ftpDetail.getFileName(),destFile)){
                    throw new Exception("上传FTP服务器出错");
                }
            }
        }));
        return ftpDetail;
    }

    public FtpList.FtpDetail handler(ListeningExecutorService executorService, CountDownLatch countDownLatch, String templatePath, String parentRoot, ContentFilling contentFilling, Map<String,String> contents){
        //目录
        FtpList.FtpDetail ftpDetail = new FtpList.FtpDetail();
        ftpDetail.setFileName(getRandomFileName());
        ftpDetail.setFilePath(getParentPath(parentRoot));
        executorService.execute(new AttPieceTask(countDownLatch, new FuturePieceTask() {
            @Override
            public void callback() throws Exception {
                String destPath = pdfPath+ File.separator+getRandomFileName();
                File destFile = new File(destPath);
                log.info(templatePath+File.separator+ftpDetail.getFileName()+"word转PDF...");
                if(!wordUtils.fillThenWord2Pdf(templatePath,destPath,contentFilling,contents)){
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