package com.itonglian.fms.service.common.impl;

import com.itonglian.fms.entity.FMS_LOGExample;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.SFGL;
import com.itonglian.fms.entity.WfTask;
import com.itonglian.fms.service.*;
import com.itonglian.fms.service.bean.Customized;
import com.itonglian.fms.service.bean.FtpFile;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.BaseService;
import com.itonglian.fms.service.common.DocParser;
import com.itonglian.fms.service.common.SFGLService;
import com.itonglian.fms.service.common.task.CommonTask;
import com.itonglian.fms.service.common.task.ConvertTask;
import com.itonglian.fms.utils.FileManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public abstract class SFGLAdapter extends BaseService {

    @Autowired
    WfTaskService wfTaskService;
    @Autowired
    SysAttachmentService sysAttachmentService;
    @Autowired
    WfInforService wfInforService;
    @Autowired
    SysUsersService sysUsersService;

    private String formPath;
    @Autowired
    FileManager fileManager;

    @Autowired
    SFGLService sfglService;

    @Autowired
    FFGLService ffglService;

    @Autowired
    DocParser docParser;

    @Autowired
    SysGroupService sysGroupService;

    @Autowired
    CommonTask commonTask;

    @Autowired
    ConvertTask convertTask;

    @Autowired
    FmsLogService fmsLogService;

    public abstract ContentFilling getContentFilling();
    public abstract String getFormPath();

    public abstract Map<String,String> getContents(SFGL sfgl) throws Exception;

    public abstract Customized getCustomized(String taskId,SFGL sfgl);

    @Override
    public Param customizedImpl(Param param, FMS_TASK fmsTask) throws Exception {

        this.formPath = getFormPath();

        String taskId = fmsTask.getTaskid();

        String parent = fmsTask.getParentroot();

        FMS_LOGExample fmsLogExample = new FMS_LOGExample();

        fmsLogExample.or().andTaskidEqualTo(taskId);

        fmsLogService.deleteByExample(fmsLogExample);

        WfTask wfTask = wfTaskService.selectByPrimaryKey(Long.parseLong(param.getTaskId()));

        SFGL sfgl = sfglService.selectByPrimaryKey(wfTask.getWt04());

        param.setCustomized(getCustomized(taskId,sfgl));

        param.setHandlerDetailList(commonTask.setHandlerDetailList(taskId,param));
        List<FtpFile> ftpFileList = new ArrayList<>();
        //封皮
        ftpFileList.add(convertTask.getCoverFile(taskId,parent));
        //目录
        ftpFileList.add(convertTask.getCatalogFile(taskId,parent));
        //备考表
        ftpFileList.add(convertTask.getRefFile(taskId,parent));
        //公文表单
        Map<String,String> contents = getContents(sfgl);

        contents.put("SF02",sfgl.getSf02());
        contents.put("BARCODE",sfgl.getSf02());

        ftpFileList.add(convertTask.getFormFile(taskId,parent,formPath,getContentFilling(),contents));
        //正文
        FtpFile docFtpFile = convertTask.getTextFile(taskId,fmsTask.getTextpath(),fmsTask.getTextname());
        if(docFtpFile!=null){
            ftpFileList.add(docFtpFile);
        }
        //附件
        ftpFileList.add(convertTask.getAttFile(taskId,fmsTask.getAttachpath(),fmsTask.getAttachname()));

        param.setFtpList(ftpFileList);

        log.info("自定义任务执行完毕...");
        return param;
    }
}
