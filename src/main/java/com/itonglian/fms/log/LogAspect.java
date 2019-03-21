package com.itonglian.fms.log;

import com.alibaba.fastjson.JSON;
import com.itonglian.fms.entity.FMS_LOG;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@Aspect
@Slf4j
@Component
public class LogAspect {

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
            log.error(throwable.getMessage(), throwable);
            save(pjp, null, System.currentTimeMillis()-start,throwable.getMessage());
        } finally {
            fmsLog.setEndtime(DateTime.now().toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
            save(pjp, result, System.currentTimeMillis()-start,null);
        }

        return result;
    }

    private void save(ProceedingJoinPoint proceedingJoinPoint, Object result, long execTime,String exception) {

        FMS_LOG fmsLog = parseJoinPoint(proceedingJoinPoint);

        if (null != fmsLog) {
            fmsLog.setResult(JSON.toJSONString(result));
            fmsLog.setExectime(execTime+"");
            fmsLog.setExectime(exception);
            log.info(fmsLog.format(), fmsLog.args());
        }
    }

    private FMS_LOG parseJoinPoint(ProceedingJoinPoint proceedingJoinPoint) {
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

                        FMS_LOG fmsLog = new FMS_LOG();
                        fmsLog.setClassname(className);
                        fmsLog.setMethodname(methodName);
                        Parameter[] params = method.getParameters();
                        for(int i=0;i<params.length;i++){
                            if("logKey".equals(params[i].getName())){
                                fmsLog.setTaskid((String)args[i]);
                            }
                        }
                        OperationLog operationLog = method.getAnnotation(OperationLog.class);
                        if (null != operationLog) {
                            fmsLog.setArguments(JSON.toJSONString(args));
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
}
