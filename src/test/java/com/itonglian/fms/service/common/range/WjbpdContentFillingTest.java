package com.itonglian.fms.service.common.range;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class WjbpdContentFillingTest {

    @Autowired
    WjbpdContentFilling wjbpdContentFilling;
    @Test
    public void test(){

        Map<String, List<String>> roleMaps =  wjbpdContentFilling.roleMaps(201305051330270l);
        System.out.println("size="+roleMaps.size());
    }
}