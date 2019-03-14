package com.itonglian.fms.config.ftp;

import com.itonglian.fms.config.services.ServiceConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.Charset;

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
    @Autowired
    ServiceConfig serviceConfig;



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
                        throw new Exception("切换ftp目录失败");
                    }
                }else{
                    throw new Exception("创建ftp目录失败");
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
       return upload(parentPath,fileName,srcFile,false);
    }
    public boolean upload(String parentPath, String fileName, File srcFile,boolean clearAll){
        FTPClient ftpClient = null;
        try {
            ftpClient = init(parentPath);
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.setCharset(Charset.forName(serviceConfig.getEncoding()));
            ftpClient.setControlEncoding(serviceConfig.getEncoding());
            if(clearAll){
                FTPFile[] ftpFiles = ftpClient.listFiles();
                for(int i=0;i<ftpFiles.length;i++){
                    String toDelFileName = ftpFiles[i].getName();
                    if(!ftpClient.deleteFile(new String(toDelFileName.getBytes("UTF-8"), "iso-8859-1"))){
                        throw new Exception("删除ftp文件失败..");
                    }
                }
            }
            log.info("上传文件:"+fileName+"至"+parentPath);
            InputStream inputStream = new FileInputStream(srcFile);
            if(!ftpClient.storeFile(fileName,inputStream)){
                throw new Exception("上传文件失败...");
            }
            log.info("上传文件成功");
            inputStream.close();
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
            try {
                FileUtils.forceDelete(srcFile);
            } catch (IOException e) {
                log.error("error",e);
            }
        }
        return true;

    }


    public void download(String parentPath,String destPath){

        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient = init(parentPath);
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.setCharset(Charset.forName(serviceConfig.getEncoding()));
            ftpClient.setControlEncoding(serviceConfig.getEncoding());
            ftpClient.enterLocalPassiveMode();
            FTPFile[] ftpFiles=ftpClient.listFiles();
            ftpClient.listFiles(parentPath);
            for (int i = 0; i <ftpFiles.length ; i++) {
                FTPFile ftpFile = ftpFiles[i];
                if(!ftpFile.isDirectory()){
                    File file = new File(destPath+"/"+ftpFile.getName());
                    OutputStream outputStream = new FileOutputStream(file);
                    String localFileName = new String(ftpFile.getName().getBytes("UTF-8"), "ISO-8859-1");
                    ftpClient.retrieveFile(localFileName,outputStream);
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
