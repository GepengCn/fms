package com.itonglian.fms.utils;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class HashTest {

    @Test
    public void test() {

        String a = "123";
        int hashCode = a.hashCode();
        System.out.println("hashCode="+hashCode);

        int index = (2 - 1) & hashCode;

        System.out.println("index="+index);
    }
}
