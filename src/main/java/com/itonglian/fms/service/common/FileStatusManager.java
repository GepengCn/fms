package com.itonglian.fms.service.common;

import com.itonglian.fms.entity.FMS_FILE;
import com.itonglian.fms.entity.FMS_FILEExample;
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


    public void setStatus(FMS_FILE fmsFile, FileStatus fileStatus){
        fmsFile.setStatus(fileStatus.getStatus());
        int result = fmsFileService.updateByExample(fmsFile,new FMS_FILEExample());
        if(result!=-1){
            log.info("此公文归档状态修改为:"+fileStatus.getStatus());
        }
    }
}
