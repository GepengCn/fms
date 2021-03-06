package com.itonglian.fms.service.common.range;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class DzfwContentFilling extends FFGLContentFilling {

    @Override
    public List<ReplaceBuilder> init() {
        List<ReplaceBuilder> replaceBuilderList = new ArrayList<>();
        replaceBuilderList.add(new ReplaceBuilder("look91922",null,false));
        replaceBuilderList.add(new ReplaceBuilder("look30800",null,false));
        replaceBuilderList.add(new ReplaceBuilder("look75607",null,false));
        replaceBuilderList.add(new ReplaceBuilder("look83042",null,false));
        return replaceBuilderList;
    }
}
