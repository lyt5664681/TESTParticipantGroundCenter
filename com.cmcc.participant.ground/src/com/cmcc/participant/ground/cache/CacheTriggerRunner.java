package com.cmcc.participant.ground.cache;

import java.io.File;
import java.io.InputStream;

import org.apache.commons.lang.StringUtils;
import org.quartz.CronExpression;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

import com.cmcc.participant.ground.resolve.Configuration;
import com.primeton.workflow.commons.logging.LogService;
import com.primeton.workflow.service.notifaction.impl.helper.WFMessageLog;

/**
 * 启动调度器
 * 
 * @author YunTao.Li
 * 
 */
public class CacheTriggerRunner {
	/**
	 * 每天 17点 28分
	 */
	private static final String CRON_TIMER = "0 0 0,1,2,3,4,5,6,7,8,11,12,13,14,15,17,18,19,20,21,22,23 * * ?";
	private static WFMessageLog messageLogger = WFMessageLog.getWFMessageLogger(CacheTriggerRunner.class);
	// private static final String CRON_TIMER =
	// "0 32,33,34,35,36,37,38,39,40,41,42,43 17 * * ?";// test

	public void task() throws SchedulerException {
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = schedulerFactory.getScheduler();

		// step1 : 加载配置文件调度
		try {
			ClassLoader cl = Thread.currentThread().getContextClassLoader();
			InputStream in = cl.getResourceAsStream("config" + File.separator + "cache.properties");
			Configuration config = new Configuration(in);
			String triggerCron = config.getValue("CACHE_TRIGGER_CRON");

			// step2 : 如果有配置则使用配置文件调度
			if (StringUtils.isNotBlank(triggerCron)) {
				messageLogger.log(LogService.LEVEL_ERROR, "configfile triggerCron:"+triggerCron);
				JobDetail jobDetailSimple = new JobDetail("cacheJobDetailSimple", "cacheJobDetailGroupSimple", CacheJob.class);
				CronTrigger cronTriggerSimple = new CronTrigger("cacheTriggerSimple", "triggerGroupSimple");
				CronExpression cexpSimple = new CronExpression(triggerCron);
				cronTriggerSimple.setCronExpression(cexpSimple);
				scheduler.scheduleJob(jobDetailSimple, cronTriggerSimple);
			} else {
				messageLogger.log(LogService.LEVEL_ERROR, "configfile triggerCron is null,use neizhi!");
				// step3 : 没有配置则使用默认时间设置调度器
				JobDetail jobDetail = new JobDetail("cacheJobDetail", "cacheJobDetailGroup", CacheJob.class);
				CronTrigger cronTrigger = new CronTrigger("cacheTrigger", "triggerGroup");
				CronExpression cexp = new CronExpression(CRON_TIMER);
				cronTrigger.setCronExpression(cexp);
				scheduler.scheduleJob(jobDetail, cronTrigger);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		scheduler.start(); // 启动调度器
	}

	public static void main(String[] args) {
		try {
			new CacheTriggerRunner().task();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
}
