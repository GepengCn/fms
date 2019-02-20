package com.itonglian.fms.service.bean;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
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
        Param param = new Param();
        param.setTaskId("13464");
        param.setDrafter("zs");
        param.setDrafterName("张三");
        param.setType(0);
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
        DocApprovalCustomized docApprovalCustomized = new DocApprovalCustomized();
        docApprovalCustomized.setFF03("平件");
        docApprovalCustomized.setFF04("内部");
        docApprovalCustomized.setFF02("FB2018000005");
        docApprovalCustomized.setFF12("办理日期屏蔽测试");
        docApprovalCustomized.setFF14("2018051835150100");
        docApprovalCustomized.setFF15("2018051835150200");
        docApprovalCustomized.setFF30("4577");
        docApprovalCustomized.setFF31("2018/5/18");
        docApprovalCustomized.setFF32("902");
        docApprovalCustomized.setFF36("");
        DocApprovalCustomized.FF52 ff52 = new DocApprovalCustomized.FF52();
        ff52.setFF02("FB2018000006");
        ff52.setFF12("有关办理日志屏蔽测试的相关资料");
        ff52.setFF30("4576");
        ff52.setFF31("2018/5/19");
        ff52.setFF32("902");
        DocApprovalCustomized.FF52 ff52_1 = new DocApprovalCustomized.FF52();
        ff52_1.setFF02("FB2018000008");
        ff52_1.setFF12("有关办理日志屏蔽测试的相关资料1");
        ff52_1.setFF30("4577");
        ff52_1.setFF31("2018/5/20");
        ff52_1.setFF32("902");
        List<DocApprovalCustomized.FF52> refDocList = new ArrayList<>();
        refDocList.add(ff52);
        refDocList.add(ff52_1);
        docApprovalCustomized.setRefDocList(refDocList);
        docApprovalCustomized.setFF53("办公平台");
        param.setCustomized(docApprovalCustomized);

        String toJsonString = JSON.toJSONString(param);
        System.out.println(toJsonString);
    }


}
