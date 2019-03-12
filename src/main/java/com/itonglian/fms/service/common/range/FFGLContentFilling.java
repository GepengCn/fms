package com.itonglian.fms.service.common.range;

import com.aspose.words.*;
import com.google.common.base.Strings;
import com.itonglian.fms.entity.WF_INFOR;
import com.itonglian.fms.entity.WF_INFORExample;
import com.itonglian.fms.service.SysUsersService;
import com.itonglian.fms.service.WfInforService;
import com.itonglian.fms.service.common.CommentTypeParser;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class FFGLContentFilling extends CommonContentFilling {

    @Autowired
    WfInforService wfInforService;

    @Autowired
    SysUsersService sysUsersService;

    @Autowired
    CommentTypeParser commentTypeParser;

    @Override
    public void fill(long taskId, DocumentBuilder builder, Range range) throws Exception {
        WF_INFORExample wfInforExample = new WF_INFORExample();
        wfInforExample.or().andWi01EqualTo(taskId);
        wfInforExample.setOrderByClause("wi08 desc");
        List<WF_INFOR> wfInforList = wfInforService.selectByExample(wfInforExample);
        Iterator<WF_INFOR> iterator = wfInforList.iterator();

        Map<String,StringBuilder> builderMap = new HashMap<>();
        while(iterator.hasNext()){
            WF_INFOR wfInfor = iterator.next();
            String commentStr = wfInfor.getWi20();
            if(Strings.isNullOrEmpty(commentStr)){
                continue;
            }
            long formId = Long.parseLong(wfInfor.getWi27());

            CommentTypeParser.TypeChooser typeChooser = commentTypeParser.build(formId);
            if(!typeChooser.isLoaded()){
                break;
            }
            CommentTypeParser.TypeResult typeResult = typeChooser.selectType(wfInfor.getWi71());
            if(!typeResult.isHasType()){
                continue;
            }
            if(builderMap.containsKey(typeResult.getType())){
                StringBuilder stringBuilder = builderMap.get(typeResult.getType());
                stringBuilder.append(htmlParser.parseWjbpd(commentStr,new DateTime(wfInfor.getWi11()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")),sysUsersService.findNameByPrimaryKey(Long.parseLong(wfInfor.getWi05()))));
                builderMap.replace(typeResult.getType(),stringBuilder);
            }else{
                StringBuilder stringBuilder = new StringBuilder(htmlParser.parseWjbpd(commentStr,new DateTime(wfInfor.getWi11()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")),sysUsersService.findNameByPrimaryKey(Long.parseLong(wfInfor.getWi05()))));
                builderMap.put(typeResult.getType(),stringBuilder);
            }
        }

        for (Map.Entry<String, StringBuilder> map : builderMap.entrySet()) {
            FindReplaceOptions findReplaceOptions = new FindReplaceOptions();
            findReplaceOptions.setReplacingCallback(new IReplacingCallback() {
                @Override
                public int replacing(ReplacingArgs replacingArgs) throws Exception {
                    builder.moveTo(replacingArgs.getMatchNode());
                    builder.insertHtml(map.getValue().toString());
                    replacingArgs.setReplacement("");
                    return 0;
                }
            });
            range.replace(Pattern.compile("\\["+map.getKey()+"]"),"",findReplaceOptions);

        }
    }


}
