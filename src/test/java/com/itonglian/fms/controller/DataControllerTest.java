package com.itonglian.fms.controller;

import com.itonglian.fms.config.services.ServiceConfig;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class DataControllerTest {



    @Autowired
    ServiceConfig serviceConfig;

    @Test
    public void findThenUpdate() {
        OkHttpClient client = new OkHttpClient();


        String url = serviceConfig.getLocalUrl();

        HashMap<String,String> paramsMap=new HashMap<>();
        paramsMap.put("startDate","2019-03-13");
        paramsMap.put("endDate","2019-03-15");
        FormBody.Builder builder = new FormBody.Builder();
        for (String key : paramsMap.keySet()) {
            //追加表单信息
            builder.add(key, paramsMap.get(key));
        }
        RequestBody formBody = builder.build();
        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .build();
        Call call=client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                log.error("failure",e);
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
                log.info(response.body().string());
                log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
        });
    }
}