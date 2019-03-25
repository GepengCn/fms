package com.itonglian.fms.service.common;

import com.itonglian.fms.aspose.WordUtils;
import com.itonglian.fms.config.ftp.FtpUtil;
import com.itonglian.fms.service.bean.FtpFile;
import com.itonglian.fms.utils.FileManager;
import com.itonglian.fms.utils.ZipUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.UUID;

@Component
@Slf4j
public class DocParser {

    @Autowired
    FtpUtil ftpUtil;
    @Value(value = "${template.pdfPath}")
    private String pdfPath;

    @Value(value = "${zip.deleteTemp}")
    private boolean deleteTemp;

    @Value(value = "${ftp.deleteDoc}")
    private boolean deleteDoc;

    @Autowired
    WordUtils wordUtils;
    @Autowired
    FileManager fileManager;

    @Autowired
    ZipUtils zipUtils;

    public void execute(FtpFile ftpFile) throws Exception {

        //临时下载目录
        String downloadPath = pdfPath+ File.separator+ UUID.randomUUID().toString();
        //创建目录
        FileUtils.forceMkdir(new File(downloadPath));
        //下载正文
        ftpUtil.download(ftpFile.getFilePath(),downloadPath);
        //pdf文件目录

        String pdfName = fileManager.getRandomFileName();

        String pdfAbsPath = downloadPath+ File.separator+pdfName;

        File[] files = new File(downloadPath).listFiles();

        if(files.length==0){
            log.warn("ftp上没找到此公文的正文...");
            return;
        }
        //word转成pdf
        if(!wordUtils.word2Pdf(files[0].getAbsolutePath(),pdfAbsPath,false)){
//            throw new Exception("word转pdf出错...");
            return;
        }
        //上传zip包
        ftpUtil.upload(ftpFile.getFilePath(),pdfName,new File(pdfAbsPath),false);
    }

    public boolean executeZip(FtpFile ftpFile) {

        try {
            //临时下载目录
            String downloadPath = pdfPath+ File.separator+ UUID.randomUUID().toString();
            //创建目录
            FileUtils.forceMkdir(new File(downloadPath));
            //下载正文
            ftpUtil.download(ftpFile.getFilePath(),downloadPath);
            //pdf文件目录
            String pdfAbsPath = downloadPath+ File.separator+fileManager.getRandomFileName();

            File[] files = new File(downloadPath).listFiles();
            File destFile = null;
            for(int i=0;i<files.length;i++){
                File tempFile = files[i];
                if(tempFile.getName().equals(ftpFile.getFileName())){
                    destFile = tempFile;
                    break;
                }
            }
            if(destFile==null){
                log.warn("ftp上没找到此公文的正文...");
                //throw new Exception("ftp上没找到此公文的正文...");
                return false;
            }
            //word转成pdf
            log.info("正文路径:[{}]",destFile.getAbsolutePath());
            if(!wordUtils.word2Pdf(destFile.getAbsolutePath(),pdfAbsPath,false)){
                throw new Exception("word转pdf出错...");
            }
            //压缩包目录
            String zipPath = pdfPath+File.separator+UUID.randomUUID().toString()+".zip";

            File zipFile = new File(zipPath);
            //打包正文doc及pdf文件
            zipUtils.zip(downloadPath, zipPath);
            //删除临时下载目录
            if(deleteTemp){
                FileUtils.deleteDirectory(new File(downloadPath));
            }
            //上传zip包
            ftpUtil.upload(ftpFile.getFilePath(),zipFile.getName(),zipFile,deleteDoc);

            return true;
        }catch (Exception e){
            log.error("Exception",e);
            return false;
        }

    }

}
