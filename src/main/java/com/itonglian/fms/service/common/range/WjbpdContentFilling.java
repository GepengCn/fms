package com.itonglian.fms.service.common.range;

import com.aspose.words.*;
import com.google.common.base.Strings;
import com.itonglian.fms.entity.*;
import com.itonglian.fms.service.ContentFilling;
import com.itonglian.fms.service.CtrlPropertyViewService;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.WfInforService;
import com.itonglian.fms.utils.BarcodeUtils;
import com.itonglian.fms.utils.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@Slf4j
@Component
public class WjbpdContentFilling implements ContentFilling {


    @Autowired
    BarcodeUtils barcodeUtils;
    @Autowired
    WfInforService wfInforService;
    @Autowired
    CtrlPropertyViewService ctrlPropertyViewService;
    @Autowired
    SysUsersService sysUsersService;

    private boolean queryFormId = false;

    private Map<String,List<String>> roleMaps = new HashMap<>();

    @Override
    public String execute(Document document, Range range, Map<String, String> contents,long taskId) throws Exception {
        DocumentBuilder builder = new DocumentBuilder(document);
        builder.moveToDocumentEnd();
        builder.getParagraphFormat().setAlignment(ParagraphAlignment.RIGHT);
        String barcode = barcodeUtils.generate(contents.get("FF02"));
        Shape shape = builder.insertImage(barcode);
        shape.setAspectRatioLocked(true);
        shape.setHeight(75);
        FindReplaceOptions findReplaceOptions = new FindReplaceOptions();
        findReplaceOptions.setMatchCase(true);
        findReplaceOptions.setReplacingCallback(new IReplacingCallback() {
            @Override
            public int replacing(ReplacingArgs replacingArgs) throws Exception {
                log.info(replacingArgs.getReplacement());
                return 0;
            }
        });
        WF_INFORExample wfInforExample = new WF_INFORExample();
        wfInforExample.or().andWi01EqualTo(taskId);
        wfInforExample.setOrderByClause("wi08 desc");
        List<WF_INFOR> wfInforList = wfInforService.selectByExample(wfInforExample);
        Iterator<WF_INFOR> iterator = wfInforList.iterator();
        StringBuilder yldpsBuilder = new StringBuilder();
        StringBuilder jldpsBuilder = new StringBuilder();
        StringBuilder bmfzryjBuilder = new StringBuilder();
        while(iterator.hasNext()){
            WF_INFOR wfInfor = iterator.next();
            String commentStr = wfInfor.getWi20();
            if(Strings.isNullOrEmpty(commentStr)){
                continue;
            }
            long formId = Long.parseLong(wfInfor.getWi27());
            Map<String,List<String>> tempMaps = roleMaps(formId);
            CommentType commentType = judgeCommentType(wfInfor.getWi71(),tempMaps);
            if(commentType==CommentType.yldps){
                yldpsBuilder.append(objectToHtml(new Comment(commentStr,new DateTime(wfInfor.getWi11()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")),getUserName(sysUsersService,wfInfor.getWi05()),commentType)));
            }else if(commentType==CommentType.jldps){
                jldpsBuilder.append(objectToHtml(new Comment(commentStr,new DateTime(wfInfor.getWi11()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")),getUserName(sysUsersService,wfInfor.getWi05()),commentType)));
            }else if(commentType==CommentType.bmfzryj){
                bmfzryjBuilder.append(objectToHtml(new Comment(commentStr,new DateTime(wfInfor.getWi11()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")),getUserName(sysUsersService,wfInfor.getWi05()),commentType)));
            }
        }

        builder.moveToBookmark(CommentType.yldps.getValue());
        builder.insertHtml(yldpsBuilder.toString());
        builder.moveToBookmark(CommentType.jldps.getValue());
        builder.insertHtml(jldpsBuilder.toString());
        builder.moveToBookmark(CommentType.bmfzryj.getValue());
        builder.insertHtml(bmfzryjBuilder.toString());
        range.replace(Pattern.compile("\\["+CommentType.yldps.getValue()+"\\]"),"",findReplaceOptions);
        range.replace(Pattern.compile("\\["+CommentType.jldps.getValue()+"\\]"),"",findReplaceOptions);
        range.replace(Pattern.compile("\\["+CommentType.bmfzryj.getValue()+"\\]"),"",findReplaceOptions);
        for (Map.Entry<String, String> entry : contents.entrySet()) {
            String value = entry.getValue();
            if(Strings.isNullOrEmpty(value)){
                value = "";
            }
            range.replace(Pattern.compile("\\["+entry.getKey()+"\\]"),value,findReplaceOptions);

        }
        return barcode;
    }

    public Map<String,List<String>> roleMaps(long formId){
        if(queryFormId){
            return roleMaps;
        }
        CTRLPROPERTY_VIEWExample ctrlpropertyViewExample = new CTRLPROPERTY_VIEWExample();
        ctrlpropertyViewExample.or().andSi02EqualTo("look").andSp01EqualTo("node").andSi01EqualTo(formId);
        List<CTRLPROPERTY_VIEW> ctrlpropertyViewList = ctrlPropertyViewService.selectByExample(ctrlpropertyViewExample);
        Iterator<CTRLPROPERTY_VIEW> iterator = ctrlpropertyViewList.iterator();
        while(iterator.hasNext()){
            CTRLPROPERTY_VIEW ctrlpropertyView = iterator.next();
            CommentType commentType = CommentType.parse(ctrlpropertyView.getSi03());
            if(commentType==CommentType.yldps){
                roleMaps.put(commentType.getValue(), StringUtils.strRoles(ctrlpropertyView.getSp02()));
            }else if(commentType==CommentType.jldps){
                roleMaps.put(commentType.getValue(), StringUtils.strRoles(ctrlpropertyView.getSp02()));
            }else if(commentType==CommentType.bmfzryj){
                roleMaps.put(commentType.getValue(), StringUtils.strRoles(ctrlpropertyView.getSp02()));
            }
        }
        queryFormId = true;
        return roleMaps;
    }
    public CommentType judgeCommentType(String wi71,Map<String,List<String>> tempMaps){
        List<String> yldpsList = tempMaps.get(CommentType.yldps.getValue());
        List<String> jldpsList = tempMaps.get(CommentType.jldps.getValue());
        List<String> bmfzryjList = tempMaps.get(CommentType.bmfzryj.getValue());
        if(yldpsList.contains(wi71)){
            return CommentType.yldps;
        }
        if(jldpsList.contains(wi71)){
            return CommentType.jldps;
        }if(bmfzryjList.contains(wi71)){
            return CommentType.bmfzryj;
        }
        return CommentType.unknown;
    }
    public enum CommentType{
        yldps("yldps"),
        jldps("jldps"),
        bmfzryj("bmfzryj"),
        unknown("unknown")
        ;
        private String value;
        CommentType(String value) {
            this.value = value;
        }
        public String getValue(){
            return this.value;
        }

        public static CommentType parse(String value){
            switch (value){
                case "yldps":
                    return yldps;
                case "jldps":
                    return jldps;
                case "bmfzryj":
                    return bmfzryj;
                default:
                    return unknown;
            }
        }
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Comment{

        private String comment;

        private String time;

        private String author;

        private CommentType commentType;

    }

    private String objectToHtml(Comment comment){
        return "<div style=\"padding: 50px;\">\n" +
                "    <div style=\"font-size: 16px;\">"+comment.getComment()+"</div>\n" +
                "    <div style=\"color: green;font-size: 13px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+comment.getAuthor()+" "+comment.getTime()+"</div>\n" +
                "</div>";
    }

    private String getUserName(SysUsersService sysUsersService,String su00){
        SYS_USERS sysUsers = sysUsersService.selectByPrimaryKey(Long.parseLong(su00));
        if(sysUsers==null){
            return null;
        }
        return sysUsers.getSu02();
    }
}
