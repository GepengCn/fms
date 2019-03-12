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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
        List<ReplaceBuilder> replaceBuilderList = init();
        while(iterator.hasNext()){
            WF_INFOR wfInfor = iterator.next();

            long formId = Long.parseLong(wfInfor.getWi27());

            CommentTypeParser.TypeChooser typeChooser = commentTypeParser.build(formId);
            if(!typeChooser.isLoaded()){
                break;
            }
            CommentTypeParser.TypeResult typeResult = typeChooser.selectType(wfInfor.getWi71());
            ReplaceBuilder replaceBuilder = new ReplaceBuilder();
            replaceBuilder.setKey(typeResult.getType());
            if(replaceBuilderList.contains(replaceBuilder)){
                replaceBuilderList.remove(replaceBuilder);
            }
            if(!typeResult.isHasType()){
                replaceBuilderList.add(replaceBuilder);
                continue;
            }
            String commentStr = wfInfor.getWi20();
            if(Strings.isNullOrEmpty(commentStr)){
                replaceBuilderList.add(replaceBuilder);
                continue;
            }
            if(replaceBuilderList.contains(typeResult.getType())){
                StringBuilder stringBuilder = replaceBuilder.getStringBuilder();
                stringBuilder.append(htmlParser.parseWjbpd(commentStr,new DateTime(wfInfor.getWi11()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")),sysUsersService.findNameByPrimaryKey(Long.parseLong(wfInfor.getWi05()))));
                replaceBuilder.setStringBuilder(stringBuilder);
                replaceBuilder.setUsed(true);
            }else{
                StringBuilder stringBuilder = new StringBuilder(htmlParser.parseWjbpd(commentStr,new DateTime(wfInfor.getWi11()).toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")),sysUsersService.findNameByPrimaryKey(Long.parseLong(wfInfor.getWi05()))));
                replaceBuilder.setStringBuilder(stringBuilder);
                replaceBuilder.setUsed(true);
            }
            replaceBuilderList.add(replaceBuilder);
        }

        Iterator<ReplaceBuilder> replaceBuilderIterator = replaceBuilderList.iterator();
        while(replaceBuilderIterator.hasNext()){
            ReplaceBuilder replaceBuilder = replaceBuilderIterator.next();
            FindReplaceOptions findReplaceOptions = new FindReplaceOptions();
            findReplaceOptions.setReplacingCallback(new IReplacingCallback() {
                @Override
                public int replacing(ReplacingArgs replacingArgs) throws Exception {
                    if(!replaceBuilder.isUsed()){
                        return 0;
                    }
                    builder.moveTo(replacingArgs.getMatchNode());
                    builder.insertHtml(replaceBuilder.getStringBuilder().toString());
                    return 0;
                }
            });
            range.replace(Pattern.compile("\\["+replaceBuilder.getKey()+"]"),"",findReplaceOptions);
        }
    }

    public abstract List<ReplaceBuilder> init();


}
