package com.itonglian.fms.config.ftp;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

@Component
@Slf4j
public class FtpUtil {

    @Autowired
    FtpConfig ftpConfig;

    @Value("${ftp.host}")
    private String host;
    @Value("${ftp.port}")
    private String port;
    @Value("${ftp.username}")
    private String username;
    @Value("${ftp.password}")
    private String password;



    public FTPClient init(String parentPath){
        FTPClient ftpClient = new FTPClient();
        try {
            int portInt = Integer.parseInt(this.port);
            ftpClient.connect(this.host,portInt);
            ftpClient.login(this.username,this.password);
            log.info("连接FTP服务至:"+host);
            log.info(ftpClient.getReplyString());
            log.info("正在切换目录至:"+parentPath);
            if(!ftpClient.changeWorkingDirectory(parentPath)){
                log.info("目录:"+parentPath+"不存在");
                log.info("创建目录:"+parentPath);
                if(ftpClient.makeDirectory(parentPath)){
                    log.info("成功创建目录:"+parentPath);
                    log.info("开始切换到目录:"+parentPath);
                    if(!ftpClient.changeWorkingDirectory(parentPath)){
                        throw new RuntimeException("切换ftp目录失败");
                    }
                }else{
                    throw new RuntimeException("创建ftp目录失败");
                }
            }
            if(!FTPReply.isPositiveCompletion(ftpClient.getReplyCode())){
                ftpClient.disconnect();
                log.error("连接ftp服务失败...");
            }
            log.info("成功连接ftp服务...");
            return ftpClient;
        }catch (Exception e){
            log.error("error",e);
            return null;
        }
    }
    public boolean upload(String parentPath, String fileName, File srcFile){
        FTPClient ftpClient = null;
        try {
            ftpClient = init(parentPath);
            log.info("上传文件:"+fileName+"至"+parentPath);
            ftpClient.storeFile(fileName,new FileInputStream(srcFile));
            log.info("上传文件成功");
            ftpClient.logout();
        }catch (Exception e){
            log.error("error",e);
            return false;
        }finally {
            if(ftpClient.isConnected()){
                try {
                    ftpClient.disconnect();
                }catch (Exception e){
                    log.error("error",e);
                }
            }
        }
        return true;

    }


    public void download(String parentPath,String destPath){

        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient = init(parentPath);
            FTPFile[] ftpFiles=ftpClient.listFiles();
            for (int i = 0; i <ftpFiles.length ; i++) {
                FTPFile ftpFile = ftpFiles[i];
                File temp =new File(destPath);
                FileUtils.forceMkdir(temp);
                if(!ftpFile.isDirectory()){
                    File file = new File(destPath+"/"+ftpFile.getName());
                    OutputStream outputStream = new FileOutputStream(file);
                    ftpClient.retrieveFile(ftpFile.getName(),outputStream);
                    outputStream.close();
                }
            }
            ftpClient.logout();
        }catch (Exception e){
            log.error("error",e);
        }finally {
            if(ftpClient.isConnected()){
                try {
                    ftpClient.disconnect();
                }catch (Exception e){
                    log.error("error",e);
                }
            }
        }
    }
}
