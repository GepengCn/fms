package com.itonglian.fms.quartz;

import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
public class ResultScheduler {

    @Value(value = "${service.resultCron}")
    String resultCron;
    @Bean(name = "resultJobDetail")
    public MethodInvokingJobDetailFactoryBean detailFactoryBean(ResultJob resultJob) {

        MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();

        // 是否并发执行
        jobDetail.setConcurrent(false);

        // 设置任务的名字
        jobDetail.setName("resultJobDetail");

        // 设置任务的分组，在多任务的时候使用
        jobDetail.setGroup("resultJobDetailGroup");

        // 需要执行的对象
        jobDetail.setTargetObject(resultJob);

        /*
         * 执行QuartzTask类中的需要执行方法
         */
        jobDetail.setTargetMethod("getResult");
        return jobDetail;
    }

    @Bean(name = "jobTrigger")
    public CronTriggerFactoryBean cronJobTrigger(JobDetail jobDetail){

        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();

        cronTriggerFactoryBean.setJobDetail(jobDetail);

        //cron表达式，每天0时执行一次
        cronTriggerFactoryBean.setCronExpression(resultCron);
//        cronTriggerFactoryBean.setCronExpression(" 0/10 * * * * ? *");

        cronTriggerFactoryBean.setName("resultTrigger");

        return cronTriggerFactoryBean;
    }

    /**
     * 调度工厂
     * @param jobTrigger 触发器
     * @return
     */
    @Bean(name = "scheduler")
    public SchedulerFactoryBean schedulerFactory(Trigger jobTrigger) {

        SchedulerFactoryBean factoryBean = new SchedulerFactoryBean();

        // 用于quartz集群,QuartzScheduler 启动时更新己存在的Job
        factoryBean.setOverwriteExistingJobs(true);

        // 延时启动，应用启动1秒后
        factoryBean.setStartupDelay(1);

        // 注册触发器
        factoryBean.setTriggers(jobTrigger);
        return factoryBean;
    }

}
