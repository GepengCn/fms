package com.itonglian.fms.service.common;

import com.itonglian.fms.aspose.WordUtils;
import com.itonglian.fms.config.ftp.FtpUtil;
import com.itonglian.fms.service.bean.FtpFile;
import com.itonglian.fms.utils.FileManager;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.zeroturnaround.zip.ZipUtil;

import java.io.File;
import java.util.UUID;

@Component
@Slf4j
public class DocParser {

    @Autowired
    FtpUtil ftpUtil;
    @Value(value = "${template.pdfPath}")
    private String pdfPath;
    @Autowired
    WordUtils wordUtils;
    @Autowired
    FileManager fileManager;

    public void execute(FtpFile ftpFile) throws Exception {

        //临时下载目录
        String downloadPath = pdfPath+ File.separator+ UUID.randomUUID().toString();
        //创建目录
        FileUtils.forceMkdir(new File(downloadPath));
        //下载正文
        ftpUtil.download(ftpFile.getFilePath(),downloadPath);
        //pdf文件目录
        String pdfAbsPath = downloadPath+ File.separator+fileManager.getRandomFileName();

        File[] files = new File(downloadPath).listFiles();

        if(files.length==0){
            log.warn("ftp上没找到此公文的正文...");
            return;
        }
        //word转成pdf
        if(!wordUtils.word2Pdf(files[0].getAbsolutePath(),pdfAbsPath,false)){
            throw new Exception("word转pdf出错...");
        }
        //压缩包目录
        String zipPath = pdfPath+File.separator+UUID.randomUUID().toString()+".zip";

        File zipFile = new File(zipPath);
        //打包正文doc及pdf文件
        ZipUtil.pack(new File(downloadPath),zipFile);
        //删除临时下载目录
        FileUtils.deleteDirectory(new File(downloadPath));
        //上传zip包
        ftpUtil.upload(ftpFile.getFilePath(),zipFile.getName(),zipFile,true);
    }

}
