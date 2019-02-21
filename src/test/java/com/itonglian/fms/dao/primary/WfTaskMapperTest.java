package com.itonglian.fms.dao.primary;

import com.itonglian.fms.dao.feapp5.FMS_TASKMapper;
import com.itonglian.fms.entity.FMS_TASKExample;
import com.itonglian.fms.entity.WfTaskExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest
@RunWith(SpringRunner.class)
public class WfTaskMapperTest {


    @Autowired
    WfTaskMapper wfTaskMapper;

    @Autowired
    FMS_TASKMapper fmsTaskMapper;

    @Test
    public void test(){
        WfTaskExample wfTaskExample = new WfTaskExample();
        wfTaskExample.or().andWt00IsNull();
        System.out.println(wfTaskMapper.countByExample(wfTaskExample));
        FMS_TASKExample fmsTaskExample = new FMS_TASKExample();
        fmsTaskExample.or().andAttachpathIsNotNull();
        System.out.println(fmsTaskMapper.countByExample(fmsTaskExample));
    }
}