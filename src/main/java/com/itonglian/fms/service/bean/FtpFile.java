package com.itonglian.fms.service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FtpFile {
    private String filePath;

    private String fileName;

    private int fileSort;

    private int fileType;

    public static FtpFile createSimpleFtpFile(String parentPath,int fileSort,int fileType){
        parentPath = parentPath+ File.separator+UUID.randomUUID().toString();
        return new FtpFile(parentPath,UUID.randomUUID().toString()+".pdf",fileSort,fileType);
    }
}
