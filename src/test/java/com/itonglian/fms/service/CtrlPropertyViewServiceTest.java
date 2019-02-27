package com.itonglian.fms.service;

import com.google.common.base.Splitter;
import com.itonglian.fms.entity.CTRLPROPERTY_VIEW;
import com.itonglian.fms.entity.CTRLPROPERTY_VIEWExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class CtrlPropertyViewServiceTest {

    @Autowired
    CtrlPropertyViewService ctrlPropertyViewService;
    Splitter splitter = Splitter.on("\\{");
    @Test
    public void test(){

//and si02='look' and  sp01='node'
        CTRLPROPERTY_VIEWExample ctrlpropertyViewExample = new CTRLPROPERTY_VIEWExample();
        ctrlpropertyViewExample.setOrderByClause("si03 desc");
        ctrlpropertyViewExample.or().andSi02EqualTo("look").andSp01EqualTo("node");
        List<CTRLPROPERTY_VIEW> ctrlpropertyViewList = ctrlPropertyViewService.selectByExample(ctrlpropertyViewExample);

        Iterator<CTRLPROPERTY_VIEW> iterator = ctrlpropertyViewList.iterator();

        while(iterator.hasNext()){
            CTRLPROPERTY_VIEW ctrlpropertyView = iterator.next();
            String commentType = ctrlpropertyView.getSi03();
            if("yldps".equalsIgnoreCase(commentType)||"jldps".equalsIgnoreCase(commentType)||"bmfzryj".equalsIgnoreCase(commentType)){
               /* List<String> list = splitter.splitToList(ctrlpropertyView.getSp02());
                for(String value :list){
                    System.out.println(value);
                }*/
                String[] strings = ctrlpropertyView.getSp02().split("\\{最高人民法院-");
                for (int i = 0; i < strings.length; i++) {
                    String value = strings[i];
                    if(value.indexOf("}")!=-1){
                        value = value.substring(0,value.indexOf("}"));
                        System.out.println(value);
                    }
                }
            }
        }
    }
}