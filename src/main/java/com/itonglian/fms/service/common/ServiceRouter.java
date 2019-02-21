package com.itonglian.fms.service.common;

import com.itonglian.fms.service.bean.FileType;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ServiceRouter implements InitializingBean {

    private static final ConcurrentHashMap<FileType, BaseService> routerMap = new ConcurrentHashMap<>();

    @Autowired
    private List<BaseService> baseServiceList;

    @Override
    public void afterPropertiesSet() throws Exception {
        for (BaseService baseService:baseServiceList) {
            routerMap.put(baseService.getType(),baseService);
        }

    }

    public BaseService getBean(FileType fileType){
        return routerMap.get(fileType);
    }
}
