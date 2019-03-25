package com.itonglian.fms.config.services;

import com.alibaba.fastjson.JSONObject;
import com.itonglian.fms.bean.BackResult;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ServiceManager {

    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    @Autowired
    ServiceConfig serviceConfig;

    public String execute(String startDate,String endDate) throws IOException {

        OkHttpClient client = new OkHttpClient();

        String url = serviceConfig.getUrl()+encodeBlank(startDate)+"/"+encodeBlank(endDate);
        log.info("url="+url);
//        RequestBody body = RequestBody.create(JSON,startDate+"/"+endDate);
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        log.info("startDate="+startDate);
        log.info("endDate="+endDate);
        Response response = client.newCall(request).execute();
        if(response.isSuccessful()){
            return response.body().string();
        }else {
            throw new IOException("Unexpected code " + response);
        }
    }

    public String proxyExecute(String startDate,String endDate) throws IOException {
        BackResult backResult = new BackResult();
        backResult.setCode(0);
        backResult.setCodeInfo("调用成功");
        List<BackResult.DataBean> dataBeanList = new ArrayList<>();
        dataBeanList.add(new BackResult.DataBean("290395",0,"2019-03-13 10:23:18"));
        backResult.setDataList(dataBeanList);
        return JSONObject.toJSONString(backResult);
    }

    private String encodeBlank(String value) throws UnsupportedEncodingException {
        while(value.indexOf(" ")!=-1){
            value = value.replace(" ","%20");
        }
        return value;
    }
}
