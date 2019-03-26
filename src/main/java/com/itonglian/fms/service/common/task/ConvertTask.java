package com.itonglian.fms.service.common.task;

import com.itonglian.fms.aspose.WordUtils;
import com.itonglian.fms.config.ftp.FtpUtil;
import com.itonglian.fms.log.OperationLog;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.bean.FtpFile;
import com.itonglian.fms.service.common.DocParser;
import com.itonglian.fms.service.common.exception.FileHandlerException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Map;

@Component
@Slf4j
public class ConvertTask implements FileTask {
    @Autowired
    WordUtils wordUtils;

    @Autowired
    FtpUtil ftpUtil;

    @Autowired
    DocParser docParser;

    @Value(value = "${template.pdfPath}")
    private String pdfPath;

    @Value(value = "${template.coverPath}")
    private String coverPath;
    @Value(value = "${template.catalogPath}")
    private String catalogPath;
    @Value(value = "${template.refPath}")
    private String refPath;

    private FtpFile getTemplateFile(String taskId,String parent,String templatePath,int fileSort,int fileType) throws FileHandlerException{
        log.debug("流程id:[{}],封皮文件处理,fileSort:[{}],fileType:[{}],上级目录:[{}]",taskId,parent,fileSort,fileType);
        FtpFile ftpFile = FtpFile.createSimpleFtpFile(parent,fileSort,fileType);
        String tempDestPath = pdfPath+ File.separator+ftpFile.getFileName();
        File destFile = new File(tempDestPath);
        log.debug("执行word转PDF,文件目录为:[{}]...",coverPath);
        if(!wordUtils.word2Pdf(templatePath,tempDestPath)){
            throw new FileHandlerException("转换PDF出错");
        }
        log.debug("执行上传文件到FTP服务器,FTP路径:[{}],FTP文件名:[{}]",ftpFile.getFilePath(),ftpFile.getFileName());
        if(!ftpUtil.upload(ftpFile.getFilePath(),ftpFile.getFileName(),destFile)){
            throw new FileHandlerException("上传FTP服务器出错");
        }
        return ftpFile;
    }
    @Override
    @OperationLog(description = "封皮处理")
    public FtpFile getCoverFile(String taskId,String parent) throws FileHandlerException {
        return getTemplateFile(taskId,parent,coverPath,0,0);
    }

    @Override
    @OperationLog(description = "目录处理")
    public FtpFile getCatalogFile(String taskId,String parent) throws FileHandlerException{
        return getTemplateFile(taskId,parent,catalogPath,1,1);
    }

    @Override
    @OperationLog(description = "备考表处理")
    public FtpFile getRefFile(String taskId,String parent) throws FileHandlerException{
        return getTemplateFile(taskId,parent,refPath,5,5);
    }

    @Override
    @OperationLog(description = "正文处理")
    public FtpFile getTextFile(String taskId,String textPath,String textName) throws FileHandlerException{
        FtpFile docFtpFile = new FtpFile(textPath,textName,3,3);
        if(docParser.executeZip(taskId,docFtpFile)){
            return docFtpFile;
        }
        return null;
    }

    @Override
    @OperationLog(description = "附件处理")
    public FtpFile getAttFile(String taskId,String attPath,String attName) throws FileHandlerException{
        return new FtpFile(attPath,attName,4,4);
    }

    @Override
    @OperationLog(description = "表单处理")
    public FtpFile getFormFile(String taskId,String parent,String templatePath,ContentFilling contentFilling, Map<String, String> contents) throws FileHandlerException {
        log.debug("流程id:[{}],封皮文件处理,fileSort:[{}],fileType:[{}],上级目录:[{}]",taskId,parent,2,2);
        FtpFile ftpFile = FtpFile.createSimpleFtpFile(parent,2,2);
        String tempDestPath = pdfPath+ File.separator+ftpFile.getFileName();
        File destFile = new File(tempDestPath);
        log.debug("执行word转PDF,文件目录为:[{}]...",templatePath);
        if(!wordUtils.fillThenWord2Pdf(templatePath,tempDestPath,contentFilling, contents,Long.parseLong(taskId))){
            throw new FileHandlerException("转换PDF出错");
        }
        log.debug("执行上传文件到FTP服务器,FTP路径:[{}],FTP文件名:[{}]",ftpFile.getFilePath(),ftpFile.getFileName());
        if(!ftpUtil.upload(ftpFile.getFilePath(),ftpFile.getFileName(),destFile)){
            throw new FileHandlerException("上传FTP服务器出错");
        }
        return ftpFile;
    }
}
