package com.itonglian.fms.utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static List<String> strRoles(String fullRole){
        List<String> stringList = new ArrayList<>();
        String[] strings = fullRole.split("\\{最高人民法院-");
        for (int i = 0; i < strings.length; i++) {
            String value = strings[i];
            if(value.indexOf("}")!=-1){
                value = value.substring(0,value.indexOf("}"));
                stringList.add(value);
            }
        }
        return stringList;
    }
}
