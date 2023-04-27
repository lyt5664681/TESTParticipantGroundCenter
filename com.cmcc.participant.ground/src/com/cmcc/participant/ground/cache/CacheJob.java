package com.cmcc.participant.ground.cache;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.cmcc.participant.ground.service.WFPOrgCacheService;
import com.cmcc.participant.ground.service.WFPUserCacheService;

public class CacheJob implements Job {
	
	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		// 开始清空缓存
		WFPOrgCacheService.clearCache();
		WFPUserCacheService.clearCache();
	}
}
