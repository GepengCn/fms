package com.itonglian.fms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.base.Strings;
import com.itonglian.fms.bean.FindListResult;
import com.itonglian.fms.config.ftp.FtpUtil;
import com.itonglian.fms.config.services.ServiceConfig;
import com.itonglian.fms.entity.FMS_DATAExample;
import com.itonglian.fms.entity.FMS_DATAWithBLOBs;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.FMS_TASKExample;
import com.itonglian.fms.service.FmsDataService;
import com.itonglian.fms.service.FmsTaskService;
import com.itonglian.fms.service.bean.FileStatus;
import com.itonglian.fms.service.bean.FtpFile;
import com.itonglian.fms.service.bean.Param;
import com.itonglian.fms.service.common.FileStatusManager;
import com.itonglian.fms.utils.FileManager;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.zeroturnaround.zip.ZipUtil;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("dataController")
@Slf4j
public class DataController {

    @Autowired
    FmsDataService fmsDataService;
    @Autowired
    FileStatusManager fileStatusManager;
    @Autowired
    FmsTaskService fmsTaskService;
    @Autowired
    FtpUtil ftpUtil;
    @Value(value = "${template.pdfPath}")
    private String pdfPath;

    @Autowired
    ServiceConfig serviceConfig;

    @Autowired
    FileManager fileManager;


    @ApiOperation(value="待归档数据查询接口", notes="调用后，归档状态为200(已发送)" ,httpMethod="POST")
    @RequestMapping("findThenUpdate")
    public FindListResult findThenUpdate(String startDate,String endDate,@RequestParam(required = false,defaultValue = "true") boolean debug) {
        FindListResult findListResult = new FindListResult();
        List<String> resultList = new ArrayList<>();
        try {
            FMS_DATAExample fmsDataExample = new FMS_DATAExample();
            FMS_DATAExample.Criteria criteria = fmsDataExample.or().andDrEqualTo("N");
            if(!Strings.isNullOrEmpty(startDate)&&!Strings.isNullOrEmpty(endDate)){
                criteria.andTsBetween(startDate,endDate);
            }
            if(!Strings.isNullOrEmpty(startDate)&&Strings.isNullOrEmpty(endDate)){
                criteria.andTsGreaterThanOrEqualTo(startDate);
            }
            if(Strings.isNullOrEmpty(startDate)&&!Strings.isNullOrEmpty(endDate)){
                criteria.andTsLessThanOrEqualTo(endDate);
            }
            List<FMS_DATAWithBLOBs> fmsDataList = fmsDataService.selectByExampleWithBLOBs(fmsDataExample);
            Iterator<FMS_DATAWithBLOBs> iterator = fmsDataList.iterator();
            while(iterator.hasNext()){
                FMS_DATAWithBLOBs fmsData = iterator.next();
                resultList.add(new String(fmsData.getCommon(), Charset.forName(serviceConfig.getEncoding())));
                if(!debug){
                    FMS_TASKExample fmsTaskExample = new FMS_TASKExample();
                    fmsTaskExample.or().andDataidEqualTo(fmsData.getDataid());
                    List<FMS_TASK> fmsTaskList = fmsTaskService.selectByExample(fmsTaskExample);
                    Iterator<FMS_TASK> iterator1 = fmsTaskList.iterator();
                    while(iterator1.hasNext()){
                        FMS_TASK fmsTask = iterator1.next();
                        fmsTask.setStatus(FileStatus.STATUS_200.getStatus());
                        fmsTaskService.updateByPrimaryKey(fmsTask);
                        fmsData.setDr("Y");
                        fmsDataService.updateByPrimaryKey(fmsData);
                    }
                }
            }
        }catch (Exception e){
            log.error("error",e);
            findListResult.setCode(1);
            findListResult.setCodeInfo("调用出错,原因是:["+e.getMessage()+"]");
            findListResult.setDataList(null);
            return findListResult;
        }
        findListResult.setCode(0);
        findListResult.setCodeInfo("调用成功");
        findListResult.setDataList(resultList);
        return findListResult;
    }
    @ApiOperation(value="待归档数据查询接口", notes="查询不会更新",httpMethod="POST")
    @RequestMapping("findAll")
    public List<String> findAll() {
        FMS_DATAExample fmsDataExample = new FMS_DATAExample();
        fmsDataExample.or().andDrEqualTo("N");
        List<FMS_DATAWithBLOBs> fmsDataList = fmsDataService.selectByExampleWithBLOBs(fmsDataExample);
        List<String> resultList = new ArrayList<>();
        Iterator<FMS_DATAWithBLOBs> iterator = fmsDataList.iterator();
        while(iterator.hasNext()){
            FMS_DATAWithBLOBs fmsData = iterator.next();
            resultList.add(new String(fmsData.getCommon(), Charset.forName(serviceConfig.getEncoding())));
        }

        return resultList;
    }


    @RequestMapping("dataIndex")
    public ModelAndView dataIndex(@RequestParam(required = false,defaultValue = "1") int pageNum,
                                  @RequestParam(required = false,defaultValue = "") String taskId) {
        PageHelper.startPage(pageNum, 10);
        ModelAndView modelAndView = new ModelAndView("table-list");
        FMS_TASKExample fmsTaskExample = new FMS_TASKExample();
        fmsTaskExample.setOrderByClause("CREATETIME DESC");
        if(!Strings.isNullOrEmpty(taskId)){
            fmsTaskExample.or().andTaskidLike(taskId);
        }
        List<FMS_TASK> fmsTaskList = fmsTaskService.selectByExample(fmsTaskExample);
        PageInfo<FMS_TASK> pageInfo = new PageInfo<>(fmsTaskList);
        modelAndView.addObject("datas",fmsTaskList);
        modelAndView.addObject("pageInfo",pageInfo);
        return modelAndView;
    }

    @RequestMapping("refresh")
    @ResponseBody
    public List<FMS_TASK> refresh() {
        List<FMS_TASK> fmsTaskList = fmsTaskService.selectByExample(new FMS_TASKExample());
        return fmsTaskList;
    }

    @RequestMapping("detail")
    public ModelAndView detail(String dataId) {
        ModelAndView modelAndView = new ModelAndView();
        FMS_DATAExample fmsDataExample = new FMS_DATAExample();
        fmsDataExample.or().andDataidEqualTo(dataId);
        FMS_DATAWithBLOBs fmsData = fmsDataService.selectByPrimaryKey(dataId);
        Param params = JSONObject.parseObject(new String(fmsData.getCommon(),Charset.forName(serviceConfig.getEncoding())), Param.class);
        modelAndView.addObject("params",params);
        modelAndView.addObject("common",JSON.toJSONString(params));
        modelAndView.addObject("ftpList",params.getFtpList());
        modelAndView.addObject("dataid",fmsData.getDataid());
        modelAndView.setViewName("table-detail");
        return modelAndView;
    }


    @RequestMapping("retry")
    public ModelAndView retry(Long id) {
        FMS_TASK fmsTask = fmsTaskService.selectByPrimaryKey(id);
        if(fmsTask!=null){
            fileStatusManager.setStatus(fmsTask, FileStatus.STATUS_100);
        }
        return new ModelAndView("redirect:/dataController/dataIndex");
    }

    @RequestMapping("jsonPretty")
    @ResponseBody
    public String jsonPretty(String dataid) {
        FMS_DATAWithBLOBs fmsData = fmsDataService.selectByPrimaryKey(dataid);

        String common = new String(fmsData.getCommon(),Charset.forName(serviceConfig.getEncoding()));
        return JSON.toJSONString(common);
    }

    @RequestMapping("download")
    @ResponseBody
    public ResponseEntity<byte[]> download(int fileType,String dataId) {
        FMS_DATAExample fmsDataExample = new FMS_DATAExample();
        fmsDataExample.or().andDataidEqualTo(dataId);

        FMS_DATAWithBLOBs fmsData = fmsDataService.selectByPrimaryKey(dataId);

        Param params = JSONObject.parseObject(new String(fmsData.getCommon(),Charset.forName(serviceConfig.getEncoding())), Param.class);

        FtpFile ftpFile = fileManager.parseFileList(params.getFtpList(),fileType);

        if(ftpFile==null){
            log.error("解析不到此类型的公文...");
            return null;
        }
        String filePath = ftpFile.getFilePath();
        String temp = pdfPath+File.separator+ UUID.randomUUID().toString();
        File tempFile = new File(temp);
        File zip = new File(pdfPath+File.separator+UUID.randomUUID().toString()+".zip");
        try {
            FileUtils.forceMkdir(tempFile);
            ftpUtil.download(filePath,temp);

            if(tempFile.listFiles().length==0){
                return null;
            }
            ZipUtil.pack(tempFile,zip);

            HttpHeaders headers = new HttpHeaders();

            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

            headers.setContentDispositionFormData("attachment", zip.getName());


            return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(zip),
                    headers, HttpStatus.CREATED);
        } catch (IOException e) {
            log.error("IOException",e);
        }finally {
            try {
                FileUtils.deleteDirectory(tempFile);
                FileUtils.forceDelete(zip);
            } catch (IOException e) {
                log.error("IOException",e);
            }

        }
        return null;
    }
}
