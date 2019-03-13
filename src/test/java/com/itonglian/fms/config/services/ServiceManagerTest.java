package com.itonglian.fms.config.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceManagerTest {

    @Autowired
    ServiceManager serviceManager;
    @Test
    public void execute() {
        try {
            serviceManager.execute("2019-03-11 15:02:05","2019-03-13 15:02:05");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}