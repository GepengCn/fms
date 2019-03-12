package com.itonglian.fms.service.common.range;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class YfwContentFilling extends FFGLContentFilling {
    @Override
    public List<ReplaceBuilder> init() {
        List<ReplaceBuilder> replaceBuilderList = new ArrayList<>();
        replaceBuilderList.add(new ReplaceBuilder("qfyj",null,false));
        replaceBuilderList.add(new ReplaceBuilder("shyj",null,false));
        return replaceBuilderList;
    }
}
