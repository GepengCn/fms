package com.itonglian.fms.service.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Param {
    private String taskId;

    private String title;

    private String drafter;

    private String drafterName;

    private String draftTime;

    private FtpList ftpList;

    private Customized customized;

    private int type;


    public static void main(String[] args) {
       /* Param param = new Param();
        param.setTaskId("13464");
        param.setDrafter("zs");
        param.setDrafterName("张三");
        param.setType(1);
        param.setDraftTime("2019-02-20 10:14:32");
        param.setTitle("全国政协委员马全林：保护生态就是保护民生");
        FtpList ftpList = new FtpList();
        ftpList.setAttFtp(new FtpList.FtpDetail("/"+ UUID.randomUUID().toString()+"/","att.zip"));
        ftpList.setCatalogFtp(new FtpList.FtpDetail("/"+ UUID.randomUUID().toString()+"/","目录.pdf"));
        ftpList.setCoverFtp(new FtpList.FtpDetail("/"+ UUID.randomUUID().toString()+"/","卷皮.pdf"));
        ftpList.setDocFtp(new FtpList.FtpDetail("/"+ UUID.randomUUID().toString()+"/","正文.pdf"));
        ftpList.setFormFtp(new FtpList.FtpDetail("/"+ UUID.randomUUID().toString()+"/","表单.pdf"));
        ftpList.setRefFtp(new FtpList.FtpDetail("/"+ UUID.randomUUID().toString()+"/","备考表.pdf"));
        param.setFtpList(ftpList);
        WjbpdCustomized wjbpdCustomized = new WjbpdCustomized();
        wjbpdCustomized.setFF03("平件");
        wjbpdCustomized.setFF04("内部");
        wjbpdCustomized.setFF02("FB2018000005");
        wjbpdCustomized.setFF12("办理日期屏蔽测试");
        wjbpdCustomized.setFF14("2018051835150100");
        wjbpdCustomized.setFF15("2018051835150200");
        wjbpdCustomized.setFF30("4577");
        wjbpdCustomized.setFF31("2018/5/18");
        wjbpdCustomized.setFF32("902");
        wjbpdCustomized.setFF36("");
        WjbpdCustomized.FF52 ff52 = new WjbpdCustomized.FF52();
        ff52.setFF02("FB2018000006");
        ff52.setFF12("有关办理日志屏蔽测试的相关资料");
        ff52.setFF30("4576");
        ff52.setFF31("2018/5/19");
        ff52.setFF32("902");
        WjbpdCustomized.FF52 ff52_1 = new WjbpdCustomized.FF52();
        ff52_1.setFF02("FB2018000008");
        ff52_1.setFF12("有关办理日志屏蔽测试的相关资料1");
        ff52_1.setFF30("4577");
        ff52_1.setFF31("2018/5/20");
        ff52_1.setFF32("902");
        List<WjbpdCustomized.FF52> refDocList = new ArrayList<>();
        refDocList.add(ff52);
        refDocList.add(ff52_1);
        wjbpdCustomized.setRefDocList(refDocList);
        wjbpdCustomized.setFF53("办公平台");
        param.setCustomized(wjbpdCustomized);

        String toJsonString = JSON.toJSONString(param);
        String jsonStr = "{\"customized\":{\"fF02\":\"FB2018000005\",\"fF03\":\"平件\",\"fF04\":\"内部\",\"fF12\":\"办理日期屏蔽测试\",\"fF14\":\"2018051835150100\",\"fF15\":\"2018051835150200\",\"fF30\":\"4577\",\"fF31\":\"2018/5/18\",\"fF32\":\"902\",\"fF36\":\"\",\"fF53\":\"办公平台\",\"refDocList\":[{\"fF02\":\"FB2018000006\",\"fF12\":\"有关办理日志屏蔽测试的相关资料\",\"fF30\":\"4576\",\"fF31\":\"2018/5/19\",\"fF32\":\"902\"},{\"fF02\":\"FB2018000008\",\"fF12\":\"有关办理日志屏蔽测试的相关资料1\",\"fF30\":\"4577\",\"fF31\":\"2018/5/20\",\"fF32\":\"902\"}]},\"draftTime\":\"2019-02-20 10:14:32\",\"drafter\":\"zs\",\"drafterName\":\"张三\",\"ftpList\":{\"attFtp\":{\"fileName\":\"att.zip\",\"filePath\":\"/04405190-9da7-4b11-925b-599cbfa210d3/\"},\"catalogFtp\":{\"fileName\":\"目录.pdf\",\"filePath\":\"/3edaca7b-684c-41e1-b391-eca94b0bdfb0/\"},\"coverFtp\":{\"fileName\":\"卷皮.pdf\",\"filePath\":\"/99a15f4d-a7e4-4839-86fe-6bf7b0c93565/\"},\"docFtp\":{\"fileName\":\"正文.pdf\",\"filePath\":\"/f646a8d0-522e-4b0a-9026-10448ec27b9e/\"},\"formFtp\":{\"fileName\":\"表单.pdf\",\"filePath\":\"/afd8097d-c433-4339-afac-a2d9a0d8be9d/\"},\"refFtp\":{\"fileName\":\"备考表.pdf\",\"filePath\":\"/29613684-ed64-4d74-80a7-fdac93ee56ed/\"}},\"taskId\":\"13464\",\"title\":\"全国政协委员马全林：保护生态就是保护民生\",\"type\":1}\n";
        Param param1 = JSONObject.parseObject(jsonStr,Param.class);
        System.out.println(toJsonString);
        System.out.println(param1.getTaskId());*/
    }


}
