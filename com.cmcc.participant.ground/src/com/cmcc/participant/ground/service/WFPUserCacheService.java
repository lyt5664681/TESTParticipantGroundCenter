package com.cmcc.participant.ground.service;

import java.io.File;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo;
import com.cmcc.participant.ground.resolve.Configuration;
import com.eos.spring.BeanFactory;
import com.eos.system.ServerContext;
import com.eos.workflow.omservice.WFParticipant;
import com.primeton.workflow.commons.config.WFConfigurationHelper;
import com.primeton.workflow.commons.logging.LogService;
import com.primeton.workflow.limitcache.LimitNotifiedCache;
import com.primeton.workflow.service.notifaction.impl.helper.WFMessageLog;

/**
 * <pre>
 * Title: 用户操作服务
 * Description: 操作缓存查库
 * </pre>
 * 
 * @author YunTao.Li
 * @version 1.00.00
 * 
 */
public class WFPUserCacheService implements IWFPUserService {

	private static WFMessageLog messageLogger = WFMessageLog.getWFMessageLogger(WFPUserCacheService.class);
	private static LimitNotifiedCache<String, Object> wfpUserCache = null;
	private IWFPUserService wfpUserServiceBean = null;
	private Object wfpUserCacheLock = new Object(); // 缓存同步锁
	private static boolean cacheSwitch = true; // 缓存开关

	private static WFPUserCacheService userCacheService = new WFPUserCacheService();
	/**
	 * 缓存KEY-机构ID下的用户集合
	 */
	private static final String CACHE_KEYHEAD_USERPATISBYORGID = "usersbyorgid_";

	/**
	 * 缓存KEY-用户byID
	 */
	private static final String CACHE_KEYHEAD_USERBYID = "userbyid_";

	/**
	 * 缓存KEY-用户byID
	 */
	private static final String CACHE_KEY_ALLUSERPARTIS = "all_user_participants";

	/**
	 * 构造方法,初始化缓存对象
	 */
	private WFPUserCacheService() {
		try {
			// step1 : 构造方法中初始化缓存对象
			String clusterEnable = WFConfigurationHelper.retrieveWFConfiguration().getClusterEnabled();
			boolean isNotify = "true".equals(clusterEnable);

			// step2 : 配置中获取缓存容量、缓存开关
			int userCapacity = 20000; // 用户缓存容量
			try {
				ClassLoader cl = Thread.currentThread().getContextClassLoader();
				InputStream in = cl.getResourceAsStream("config" + File.separator + "cache.properties");
				Configuration config = new Configuration(in);

				userCapacity = Integer.parseInt(config.getValue("CACHE_USER_CAPACITY")); // 缓存容量
				int cacheSwitchIndex = Integer.parseInt(config.getValue("CACHE_SWITCH")); // 缓存开关
				if (cacheSwitchIndex == 0) {
					cacheSwitch = false;
					messageLogger.log(LogService.LEVEL_ERROR, "user omservice not use cache!!!");
				} else {
					messageLogger.log(LogService.LEVEL_ERROR, "user omservice use cache!!!");
				}
			} catch (Exception e) {
				System.out.println("----------------读取缓存配置文件失败----------------");
				messageLogger.log(LogService.LEVEL_ERROR, "Configuration read false!!!use cache!");
				e.printStackTrace();
				// throw e;
			}

			// step2 : 实例化缓存对象
			if (wfpUserCache == null) {
				wfpUserCache = new LimitNotifiedCache<String, Object>("userServiceCache", userCapacity, isNotify);
				wfpUserCache.start();
				messageLogger.log(LogService.LEVEL_ERROR, "start wfpUserCache!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 初始化方法<br>
	 * 可由开关配置是否启用缓存
	 * 
	 * @return
	 */
	public static IWFPUserService getInstance() {
		// 如果不使用緩存
		if (!cacheSwitch) {
			return BeanFactory.newInstance().getBean("WFPUserServiceBean");
		}
		return userCacheService;
	}

	/**
	 * 后台监控，打印缓存数量
	 * 
	 * @return
	 */
	public static int getCacheNum() {
		return wfpUserCache.size();
	}

	/**
	 * 后台监控,清空缓存
	 */
	public static void clearCache() {
		wfpUserCache.clear();
		String ip = "";
		try {
			ip = ServerContext.getInstance().getLocalIP();
			if (StringUtils.isBlank(ip)) {
				ip = InetAddress.getLocalHost().getHostAddress();
			}

		} catch (Exception e) {
		}
		messageLogger.log(LogService.LEVEL_ERROR, "Cache Cleared: ip=" + ip + "size=" + wfpUserCache.size() + "　name=wfpUserCache");
	}

	public void addWFPUser(WfpAfUserinfo userInfo) throws Exception {
	}

	public void saveWFPUser(WfpAfUserinfo userInfo) throws Exception {
	}

	public void deleteWFPUser(WfpAfUserinfo userInfo) throws Exception {
	}

	/**
	 * 根据ID查询用户, 查缓存
	 * 
	 * @param userId
	 *            对应WFP_AF_PERSONMANAGEMENT表pm_person_id字段<br>
	 *            对应WFP_AF_USERINFO表user_account字段
	 * @throws Exception
	 */
	public WFParticipant getParticipantByID(String userId) throws Exception {

		// step1 : 从缓存中获取数据
		WFParticipant userParticipant = (WFParticipant) wfpUserCache.get(CACHE_KEYHEAD_USERBYID + userId);

		// step2 : 如果缓存中有数据，则直接返回
		if (userParticipant != null) {
			return userParticipant;
		} else {

			// 加入缓存同步
			synchronized (wfpUserCacheLock) {
				wfpUserServiceBean = BeanFactory.newInstance().getBean("WFPUserServiceBean");

				// step3 : 如果缓存没有，则查库
				userParticipant = this.wfpUserServiceBean.getParticipantByID(userId);

				// step4 : 将查询出的结果放入缓存，并返回
				wfpUserCache.put(CACHE_KEYHEAD_USERBYID + userId, userParticipant);

				return userParticipant;
			}
		}
	}

	/**
	 * 获得机构下的所有参与者<br>
	 * 不包括此机构下子机构下的参与者<br>
	 * 包括WFP_AF_PERSONMANAGEMENT表与WFP_AF_USERINFO表的数据<br>
	 * 带缓存
	 * 
	 * @param orgCode
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked" })
	public List<WFParticipant> getParticipantByOrgId(String orgCode) throws Exception {
		// step1 : 从缓存中获取数据
		List<WFParticipant> participantList = (List<WFParticipant>) wfpUserCache.get(CACHE_KEYHEAD_USERPATISBYORGID + orgCode);

		// step2 : 如果缓存中有数据，则直接返回
		if (participantList != null && participantList.size() > 0) {
			return participantList;
		} else {

			// 加入缓存同步
			synchronized (wfpUserCacheLock) {
				wfpUserServiceBean = BeanFactory.newInstance().getBean("WFPUserServiceBean");

				// step3 : 如果缓存没有，则查库
				participantList = this.wfpUserServiceBean.getParticipantByOrgId(orgCode);

				// step4 : 将查询出的结果放入缓存，并返回
				wfpUserCache.put(CACHE_KEYHEAD_USERPATISBYORGID + orgCode, participantList);

				return participantList;
			}
		}
	}

	/**
	 * 获得所有的用户参与者
	 * 
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked" })
	public List<WFParticipant> getAllUserParticipantList() throws Exception {
		return new ArrayList<WFParticipant>();
		
//		// step1 : 从缓存中获取数据
//		List<WFParticipant> participantList = (List<WFParticipant>) wfpUserCache.get(CACHE_KEY_ALLUSERPARTIS);
//
//		// step2 : 如果缓存中有数据，则直接返回
//		if (participantList != null && participantList.size() > 0) {
//			return participantList;
//		} else {
//
//			// 加入缓存同步
//			synchronized (wfpUserCacheLock) {
//				wfpUserServiceBean = BeanFactory.newInstance().getBean("WFPUserServiceBean");
//
//				// step3 : 如果缓存没有，则查库
//				participantList = this.wfpUserServiceBean.getAllUserParticipantList();
//
//				// step4 : 将查询出的结果放入缓存，并返回
//				wfpUserCache.put(CACHE_KEY_ALLUSERPARTIS, participantList);
//
//				return participantList;
//			}
//		}
	}

}
