package com.itonglian.fms.service.common.range;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class WjbpdContentFilling extends FFGLContentFilling {
    @Override
    public List<ReplaceBuilder> init() {
        List<ReplaceBuilder> replaceBuilderList = new ArrayList<>();
        replaceBuilderList.add(new ReplaceBuilder("yldps",null,false));
        replaceBuilderList.add(new ReplaceBuilder("jldps",null,false));
        replaceBuilderList.add(new ReplaceBuilder("bmfzryj",null,false));
        return replaceBuilderList;
    }

}
