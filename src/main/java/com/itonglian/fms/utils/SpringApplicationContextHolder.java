package com.itonglian.fms.utils;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SpringApplicationContextHolder implements ServletContextListener {
    private static WebApplicationContext springContext = null;

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        if (springContext == null) {
            springContext = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
        }
    }

    public static Object getBean(String name) {
        return springContext.getBean(name);
    }

    public static <T> T getBean(Class<T> clazz) {
        return springContext.getBean(clazz);
    }

}
