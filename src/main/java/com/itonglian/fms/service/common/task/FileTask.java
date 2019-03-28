package com.itonglian.fms.service.common.task;

import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.bean.FtpFile;
import com.itonglian.fms.service.common.exception.FileHandlerException;

import java.util.Map;

public interface FileTask {

    FtpFile getCoverFile(String taskId,String parent) throws FileHandlerException;

    FtpFile getCatalogFile(String taskId,String parent) throws FileHandlerException;

    FtpFile getRefFile(String taskId,String parent) throws FileHandlerException;

    FtpFile getTextFile(String taskId,String textPath,String textName) throws FileHandlerException, Exception;

    FtpFile getAttFile(String taskId,String attPath,String attName) throws FileHandlerException;

    FtpFile getFormFile(String taskId,String parent,String templatePath, ContentFilling contentFilling, Map<String,String> contents) throws FileHandlerException;
}
