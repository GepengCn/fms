package com.itonglian.fms.service.common;

import com.aspose.words.FindReplaceOptions;
import com.aspose.words.Range;
import com.itonglian.fms.entity.CTRLPROPERTY_VIEW;
import com.itonglian.fms.entity.CTRLPROPERTY_VIEWExample;
import com.itonglian.fms.service.CtrlPropertyViewService;
import com.itonglian.fms.utils.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@Component
@Slf4j
public class CommentTypeParser {
    @Autowired
    CtrlPropertyViewService ctrlPropertyViewService;

    private Map<String,List<String>> datas = new HashMap<>();

    public TypeChooser build(Long formId){
        CTRLPROPERTY_VIEWExample ctrlpropertyViewExample = new CTRLPROPERTY_VIEWExample();
        ctrlpropertyViewExample.or().andSi02EqualTo("look").andSp01EqualTo("node").andSi01EqualTo(formId);
        List<CTRLPROPERTY_VIEW> ctrlpropertyViewList = ctrlPropertyViewService.selectByExample(ctrlpropertyViewExample);
        Iterator<CTRLPROPERTY_VIEW> iterator = ctrlpropertyViewList.iterator();
        while(iterator.hasNext()){
            CTRLPROPERTY_VIEW ctrlpropertyView = iterator.next();
            datas.put(ctrlpropertyView.getSi03(), StringUtils.strRoles(ctrlpropertyView.getSp02()));
        }
        return new TypeChooser();
    }

    public Map<String,List<String>> findAll(){
        return datas;
    }

    public void clearAll(Map<String,List<String>> maps, Range range) throws Exception{
        for (Map.Entry<String, List<String>> entry : maps.entrySet()) {
            range.replace(Pattern.compile("\\["+entry.getKey()+"]"),"",new FindReplaceOptions());
        }
    }

    public class TypeChooser{



        public boolean isLoaded(){
            return datas!=null&&datas.size()>0;
        }

        public TypeResult selectType(String typeValue){
            for (Map.Entry<String, List<String>> entry : datas.entrySet()) {
                log.debug("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                List<String> list = entry.getValue();
                if(list.contains(typeValue)){
                    return new TypeResult(true,entry.getKey());
                }
            }
            return new TypeResult(false,null);
        }

    }

    @Data
    @AllArgsConstructor
    public class TypeResult{

        private boolean hasType;

        private String type;

    }
}

