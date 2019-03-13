package com.itonglian.fms.service.common.range;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Component
public class SwdjContentFilling extends SFGLContentFilling {
    @Override
    public List<ReplaceBuilder> init() {
        List<ReplaceBuilder> replaceBuilderList = new ArrayList<>();
        replaceBuilderList.add(new ReplaceBuilder("ldpsyj",null,false));
        replaceBuilderList.add(new ReplaceBuilder("cbbmyj",null,false));
        replaceBuilderList.add(new ReplaceBuilder("nbyj",null,false));
        return replaceBuilderList;
    }
}
