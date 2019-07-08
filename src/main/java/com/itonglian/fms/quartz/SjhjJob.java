package com.itonglian.fms.quartz;

import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
@Configurable
@EnableScheduling
@Slf4j
public class SjhjJob {
    /**
     * 定时任务：定时调办公平台的汇聚功能，
     * 参数：begintime,endtime（yyyyMMdd HH:mm:ss）
     * "${service.resultCron}"
     */
    @Scheduled(cron = "${service.sjhjCron}")
    private void sjhjService(){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH,-1);
        String stamp = format.format(c.getTime());
        String begintime = stamp+" 00:00:00";
        String endtime = stamp+" 23:59:59";
//        String url = "http://192.168.1.118:8090/sjhjServlet?begintime="+begintime+"&endtime="+endtime;
        String url = "http://192.0.101.56:7001/sjhjServlet";
        Map<String,String> map = new HashMap<String,String>();
        map.put("begintime",begintime);
        map.put("endtime",endtime);
        doget(url, map);
        //System.out.println(url);
        System.out.println("定时任务！时间戳："+stamp);
    }
    private void doget(String url, Map<String, String> parameters){
        String result = "";// 返回的结果
        BufferedReader in = null;// 读取响应输入流
        StringBuffer sb = new StringBuffer();// 存储参数
        String params = "";// 编码之后的参数
        try {
            // 编码请求参数
            if (parameters.size() == 1) {
                for (String name : parameters.keySet()) {
                    sb.append(name).append("=").append(
                            java.net.URLEncoder.encode(parameters.get(name),
                                    "UTF-8"));
                }
                params = sb.toString();
            } else {
                for (String name : parameters.keySet()) {
                    sb.append(name).append("=").append(
                            java.net.URLEncoder.encode(parameters.get(name),
                                    "UTF-8")).append("&");
                }
                String temp_params = sb.toString();
                params = temp_params.substring(0, temp_params.length() - 1);
            }
            String full_url = url + "?" + params;
            System.out.println(full_url);
            // 创建URL对象
            java.net.URL connURL = new java.net.URL(full_url);
            // 打开URL连接
            java.net.HttpURLConnection httpConn = (java.net.HttpURLConnection) connURL
                    .openConnection();
            // 设置通用属性
            httpConn.setRequestProperty("Accept", "*/*");
            httpConn.setRequestProperty("Connection", "Keep-Alive");
            httpConn.setRequestProperty("User-Agent",
                    "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");
            // 建立实际的连接
            httpConn.connect();
            // 响应头部获取
            Map<String, List<String>> headers = httpConn.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : headers.keySet()) {
                System.out.println(key + "\t：\t" + headers.get(key));
            }
            // 定义BufferedReader输入流来读取URL的响应,并设置编码方式
            in = new BufferedReader(new InputStreamReader(httpConn
                    .getInputStream(), "UTF-8"));
            String line;
            // 读取返回的内容
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("调用办公平台数据汇聚servlet ：error");
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("---------------"+result);
//        return result;
    }

}
