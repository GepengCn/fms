package com.itonglian.fms.log;

import com.alibaba.fastjson.JSON;
import com.itonglian.fms.entity.FMS_LOG;
import com.itonglian.fms.service.FmsLogService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.UUID;

@Aspect
@Slf4j
@Component
public class LogAspect {

    @Autowired
    private FmsLogService fmsLogService;

    @Pointcut("@annotation(com.itonglian.fms.log.OperationLog)")
    public void pointcut() {

    }
    @Around("pointcut()")
    public Object doInvoke(ProceedingJoinPoint pjp) {
        FMS_LOG fmsLog = new FMS_LOG();
        long start = System.currentTimeMillis();
        fmsLog.setStarttime(DateTime.now().toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
        Object result = null;
        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            fmsLog.setEndtime(DateTime.now().toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
            fmsLog.setExectime((System.currentTimeMillis()-start)+"");
            fmsLog.setException(throwable.getMessage());
            save(pjp, fmsLog);
        } finally {
            fmsLog.setEndtime(DateTime.now().toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
            fmsLog.setExectime((System.currentTimeMillis()-start)+"");
            fmsLog.setResult(maxString(JSON.toJSONString(result)));
            save(pjp,fmsLog);
        }

        return result;
    }

    public void save(ProceedingJoinPoint proceedingJoinPoint, FMS_LOG fmsLog) {

        fmsLog = parseJoinPoint(proceedingJoinPoint,fmsLog);

        if (null != fmsLog) {
            fmsLog.setId(UUID.randomUUID().toString());
            fmsLogService.insert(fmsLog);
        }
    }

    public FMS_LOG parseJoinPoint(ProceedingJoinPoint proceedingJoinPoint,FMS_LOG fmsLog) {
        Signature signature = proceedingJoinPoint.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        Object[] args = proceedingJoinPoint.getArgs();
        String targetClassName = proceedingJoinPoint.getTarget().getClass().getName();
        try {
            Class<?> clazz = Class.forName(targetClassName);
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                if (methodName.equals(method.getName())) {
                    if (args.length == method.getParameterCount()) {
                        fmsLog.setClassname(className);
                        fmsLog.setMethodname(methodName);
                        Parameter[] params = method.getParameters();
                        for(int i=0;i<params.length;i++){
                            if("taskId".equals(params[i].getName())){
                                fmsLog.setTaskid((String)args[i]);
                            }
                        }
                        OperationLog operationLog = method.getAnnotation(OperationLog.class);
                        if (null != operationLog) {

                            fmsLog.setArguments(maxString(JSON.toJSONString(args)));
                            fmsLog.setDescription(operationLog.description());
                            return fmsLog;
                        }
                        return null;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    private String maxString(String value){
        if(value.length()>200){
            value = value.substring(0,200);
        }
        return value;
    }
}
