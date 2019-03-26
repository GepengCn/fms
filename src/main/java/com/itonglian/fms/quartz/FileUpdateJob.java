package com.itonglian.fms.quartz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.itonglian.fms.config.services.ServiceConfig;
import com.itonglian.fms.entity.FMS_DATAWithBLOBs;
import com.itonglian.fms.entity.FMS_TASK;
import com.itonglian.fms.entity.FMS_TASKExample;
import com.itonglian.fms.entity.WF_INFORExample;
import com.itonglian.fms.service.FmsDataService;
import com.itonglian.fms.service.FmsTaskService;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.WfInforService;
import com.itonglian.fms.service.bean.*;
import com.itonglian.fms.service.common.BaseService;
import com.itonglian.fms.service.common.ServiceRouter;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

@Component
@Slf4j
public class FileUpdateJob {

    @Autowired
    FmsDataService fmsDataService;
    @Autowired
    FmsTaskService fmsTaskService;
    @Autowired
    ServiceConfig serviceConfig;
    @Autowired
    WfInforService wfInforService;
    @Autowired
    SysUsersService sysUsersService;
    @Autowired
    ServiceRouter serviceRouter;

    public void doFileUpdate() throws Exception {

        FMS_TASKExample fmsTaskExample = new FMS_TASKExample();
        fmsTaskExample.or().andStatusEqualTo(FileStatus.STATUS_300.getStatus());
        List<FMS_TASK> fmsTaskList = fmsTaskService.selectByExample(fmsTaskExample);

        Iterator<FMS_TASK> iterator = fmsTaskList.iterator();

        while(iterator.hasNext()){

            FMS_TASK fmsTask = iterator.next();

            String taskId = fmsTask.getTaskid();

            //查询dbCount
            long dbCount = fmsTask.getHandlersize()==null?0:fmsTask.getHandlersize();
            WF_INFORExample wfInforExample = new WF_INFORExample();
            wfInforExample.or().andWi01EqualTo(Long.parseLong(taskId));
            long nowCount = wfInforService.countByExample(wfInforExample);

            log.debug("doFileUpdate=[{}]", DateTime.now().toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
            log.debug("dbCount=[{}],nowCount=[{}]",dbCount,nowCount);

            if(dbCount==nowCount){
                continue;
            }

            //查询FMS_Data

            FMS_DATAWithBLOBs fmsDataWithBLOBs = fmsDataService.selectByPrimaryKey(fmsTask.getDataid());

            //更新FMS_DATA
            BaseService baseService = serviceRouter.getBean(FileType.parse(Integer.parseInt(fmsTask.getFiletype())));

            switch (Integer.parseInt(fmsTask.getFiletype())){
                case 1:
                    WjbpdParam wjbpdParam = JSONObject.parseObject(new String(fmsDataWithBLOBs.getCommon(), Charset.forName(serviceConfig.getEncoding())),WjbpdParam.class);

                    wjbpdParam.setHandlerDetailList(baseService.setHandlerDetailList(wjbpdParam));

                    fmsDataWithBLOBs.setCommon(JSON.toJSONString(wjbpdParam).getBytes());

                    fmsTask.setHandlersize((long)wjbpdParam.getHandlerDetailList().size());
                    break;
                case 2:
                    ZyxwParam zyxwParam = JSONObject.parseObject(new String(fmsDataWithBLOBs.getCommon(), Charset.forName(serviceConfig.getEncoding())),ZyxwParam.class);

                    zyxwParam.setHandlerDetailList(baseService.setHandlerDetailList(zyxwParam));

                    fmsDataWithBLOBs.setCommon(JSON.toJSONString(zyxwParam).getBytes());

                    fmsTask.setHandlersize((long)zyxwParam.getHandlerDetailList().size());
                    break;
                case 3:
                    DwfwParam dwfwParam = JSONObject.parseObject(new String(fmsDataWithBLOBs.getCommon(), Charset.forName(serviceConfig.getEncoding())),DwfwParam.class);

                    dwfwParam.setHandlerDetailList(baseService.setHandlerDetailList(dwfwParam));

                    fmsDataWithBLOBs.setCommon(JSON.toJSONString(dwfwParam).getBytes());

                    fmsTask.setHandlersize((long)dwfwParam.getHandlerDetailList().size());
                    break;
                case 4:
                    DzfwParam dzfwParam = JSONObject.parseObject(new String(fmsDataWithBLOBs.getCommon(), Charset.forName(serviceConfig.getEncoding())),DzfwParam.class);

                    dzfwParam.setHandlerDetailList(baseService.setHandlerDetailList(dzfwParam));

                    fmsDataWithBLOBs.setCommon(JSON.toJSONString(dzfwParam).getBytes());

                    fmsTask.setHandlersize((long)dzfwParam.getHandlerDetailList().size());
                    break;
                case 5:
                    YfwParam yfwParam = JSONObject.parseObject(new String(fmsDataWithBLOBs.getCommon(), Charset.forName(serviceConfig.getEncoding())),YfwParam.class);

                    yfwParam.setHandlerDetailList(baseService.setHandlerDetailList(yfwParam));

                    fmsDataWithBLOBs.setCommon(JSON.toJSONString(yfwParam).getBytes());

                    fmsTask.setHandlersize((long)yfwParam.getHandlerDetailList().size());
                    break;
                case 6:
                    SwdjParam swdjParam = JSONObject.parseObject(new String(fmsDataWithBLOBs.getCommon(), Charset.forName(serviceConfig.getEncoding())),SwdjParam.class);

                    swdjParam.setHandlerDetailList(baseService.setHandlerDetailList(swdjParam));

                    fmsDataWithBLOBs.setCommon(JSON.toJSONString(swdjParam).getBytes());

                    fmsTask.setHandlersize((long)swdjParam.getHandlerDetailList().size());
                    break;
                default:
                    break;
            }
            fmsDataService.updateByPrimaryKey(fmsDataWithBLOBs);
            //更新dbCount
            fmsTaskService.updateByPrimaryKey(fmsTask);

        }

    }
}
