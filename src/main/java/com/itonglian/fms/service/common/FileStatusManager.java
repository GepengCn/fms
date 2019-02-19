package com.itonglian.fms.service.common;

import com.itonglian.fms.entity.FmsFile;
import com.itonglian.fms.entity.FmsFileExample;
import com.itonglian.fms.service.FmsFileService;
import com.itonglian.fms.service.bean.FileStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FileStatusManager {

    @Autowired
    FmsFileService fmsFileService;


    public void setStatus(FmsFile fmsFile, FileStatus fileStatus){
        fmsFile.setStatus(fileStatus.getStatus());
        int result = fmsFileService.updateByExample(fmsFile,new FmsFileExample());
        if(result!=-1){
            log.info("此公文归档状态修改为:"+fileStatus.getStatus());
        }
    }
}
