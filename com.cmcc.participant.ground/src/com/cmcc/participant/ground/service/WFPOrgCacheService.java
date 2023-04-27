package com.cmcc.participant.ground.service;

import java.io.File;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.cmcc.participant.ground.cache.CacheTriggerRunner;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization;
import com.cmcc.participant.ground.resolve.Configuration;
import com.eos.spring.BeanFactory;
import com.eos.system.ServerContext;
import com.eos.workflow.omservice.WFParticipant;
import com.primeton.workflow.api.PageCond;
import com.primeton.workflow.commons.config.WFConfigurationHelper;
import com.primeton.workflow.commons.logging.LogService;
import com.primeton.workflow.limitcache.LimitNotifiedCache;
import com.primeton.workflow.service.notifaction.impl.helper.WFMessageLog;

/**
 * <pre>
 * Title: 查询组织机构service
 * Description: 带缓存，先查缓存再查库缓存没有则更新缓存
 * </pre>
 * 
 * @author YunTao.Li
 * @version 1.00.00
 * 
 */
public class WFPOrgCacheService implements IWFPOrgService {

	private static WFMessageLog messageLogger = WFMessageLog.getWFMessageLogger(WFPOrgCacheService.class);
	private static LimitNotifiedCache<String, Object> wfpOrgCache = null;
	private IWFPOrgService wfpOrgServiceBean = null;
	private Object wfpOrgCacheLock = new Object(); // 缓存同步锁
	private static boolean cacheTriggerOn = false;
	private static Object cacheTriggerLock = new Object(); // 缓存trigger启动锁
	private static boolean cacheSwitch = true; // 缓存开关，默认false

	private static WFPOrgCacheService orgCacheService = new WFPOrgCacheService();

	/**
	 * 缓存KEY-getRootOrganization
	 */
	private static final String CACHE_KEY_ROOTORGANIZATION = "root_organization";
	/**
	 * 缓存KEY-所有机构的集合
	 */
	private static final String CACHE_KEY_ALLORGPATIS = "all_organization_participants";
	/**
	 * 缓存KEY-普通的组织机构，key为orgbyid_+orgid
	 */
	private static final String CACHE_KEYHEAD_ORGBYID = "orgbyid_";

	/**
	 * 缓存KEY-普通的组织机构，key为rolesbyuid_+uid
	 */
	private static final String CACHE_KEYHEAD_ROLESBYUID = "rolesbyuid_";

	/**
	 * 缓存KEY-租户下的内部机构集合,key为tenantrole_租户id
	 */
	private static final String CACHE_KEYHEAD_TENANTROLE = "tenantrole_";

	/**
	 * 缓存KEY-机构下的子机构集合
	 */
	private static final String CACHE_KEYHEAD_CHILDORGPATIS = "childorgpatis_";

	/**
	 * 缓存KEY-用户所属机构，key为orgbyuid_+orgid
	 */
	private static final String CACHE_KEYHEAD_ORGBYUID = "orgbyuid_";

	/**
	 * 缓存KEY-用户所属机构，key为orgbyparentorgid_+orgid
	 */
	private static final String CACHE_KEYHEAD_ORGBYPOID = "orgbypoid_";

	/**
	 * 构造方法,初始化缓存对象
	 */
	private WFPOrgCacheService() {
		try {
			// step1 : 构造方法中初始化缓存对象
			String clusterEnable = WFConfigurationHelper.retrieveWFConfiguration().getClusterEnabled();
			boolean isNotify = "true".equals(clusterEnable);

			int orgCapacity = 20000; // 机构缓存容量

			// step2 : 从web.xml中获取配置，获取缓存容量、缓存开关
			try {
				ClassLoader cl = Thread.currentThread().getContextClassLoader();
				InputStream in = cl.getResourceAsStream("config" + File.separator + "cache.properties");
				Configuration config = new Configuration(in);

				int cacheSwitchIndex = Integer.parseInt(config.getValue("CACHE_SWITCH")); // 缓存开关
				orgCapacity = Integer.parseInt(config.getValue("CACHE_ORG_CAPACITY")); // 缓存容量

				if (cacheSwitchIndex == 0) {
					cacheSwitch = false;
					messageLogger.log(LogService.LEVEL_ERROR, "org omservice not use cache!!!");
				} else {
					messageLogger.log(LogService.LEVEL_ERROR, "org omservice use cache!!!");
				}
			} catch (Exception e) {
				System.out.println("----------------读取缓存配置文件失败----------------");
				cacheSwitch = false;
				e.printStackTrace();
				throw e;
			}

			// step3 : 实例化缓存对象
			if (wfpOrgCache == null && cacheSwitch) {
				wfpOrgCache = new LimitNotifiedCache<String, Object>("orgServiceCache", orgCapacity, isNotify);
				wfpOrgCache.start();
				messageLogger.log(LogService.LEVEL_ERROR, "start wfpOrgCache!!");
			}

			// step4 : start147896325
			try {
				synchronized (cacheTriggerLock) {
					if (!cacheTriggerOn) {
						new CacheTriggerRunner().task();
						messageLogger.log(LogService.LEVEL_ERROR, "**************************start 147896325****************");
						cacheTriggerOn = true;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
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
	public static IWFPOrgService getInstance() {
		// 如果不使用緩存，缓存开关
		if (!cacheSwitch) {
			return BeanFactory.newInstance().getBean("WFPOrgServiceBean");
		}
		return orgCacheService;
	}

	/**
	 * 后台监控，打印缓存数量
	 * 
	 * @return
	 */
	public static int getCacheNum() {
		return wfpOrgCache.size();
	}

	/**
	 * 后台监控,清空缓存
	 */
	public static void clearCache() {
		wfpOrgCache.clear();
		String ip = "";
		try {
			ip = ServerContext.getInstance().getLocalIP();
			if (StringUtils.isBlank(ip)) {
				ip = InetAddress.getLocalHost().getHostAddress();
			}

		} catch (Exception e) {
		}
		messageLogger.log(LogService.LEVEL_ERROR, "Cache Cleared: ip = " + ip + " size=" + wfpOrgCache.size() + "　name=wfpOrgCache");
	}

	public void addWFPOrganization(WfpAfOrganization orgInfo) throws Exception {
	}

	public void saveWFPOrganization(WfpAfOrganization orgInfo) throws Exception {
	}

	public void deleteWFPOrganization(WfpAfOrganization orgInfo) throws Exception {
	}

	/**
	 * 获得root organization<br>
	 * 先拿缓存，如果缓存没有再查库
	 * 
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("static-access")
	public WfpAfOrganization getRootOrganization() throws Exception {
		// step1 : 从缓存中获取数据
		WfpAfOrganization rootOrganization = (WfpAfOrganization) this.wfpOrgCache.get(CACHE_KEY_ROOTORGANIZATION);

		// step2 : 如果缓存中有数据，则直接返回
		if (rootOrganization != null) {
			return rootOrganization;
		} else {

			// 加入缓存同步
			synchronized (wfpOrgCacheLock) {
				wfpOrgServiceBean = BeanFactory.newInstance().getBean("WFPOrgServiceBean");

				// step3 : 如果缓存没有，则查库
				rootOrganization = this.wfpOrgServiceBean.getRootOrganization();

				// step4 : 将查询出的结果放入缓存，并返回
				this.wfpOrgCache.put(CACHE_KEY_ROOTORGANIZATION, rootOrganization);

				return rootOrganization;
			}
		}
	}

	/**
	 * 根据用户id获得用户的所有角色列表
	 * 
	 * @param participantID
	 * @return
	 * @throws Exception
	 */
	public List<WFParticipant> getRoleListByUserId(String participantID) throws Exception {
		// step1 : 从缓存中获取数据
		List<WFParticipant> roleParticipants = (List<WFParticipant>) wfpOrgCache.get(CACHE_KEYHEAD_ROLESBYUID + participantID);

		// step2 : 如果缓存中有数据，则直接返回
		if (roleParticipants != null && roleParticipants.size() > 0) {
			return roleParticipants;
		} else {

			// 加入缓存同步
			synchronized (wfpOrgCacheLock) {
				wfpOrgServiceBean = BeanFactory.newInstance().getBean("WFPOrgServiceBean");

				// step3 : 如果缓存没有，则查库
				roleParticipants = this.wfpOrgServiceBean.getRoleListByUserId(participantID);

				// step4 : 将查询出的结果放入缓存，并返回
				wfpOrgCache.put(CACHE_KEYHEAD_ROLESBYUID + participantID, roleParticipants);

				return roleParticipants;
			}
		}
	}

	/**
	 * 根据id获取外部机构或者内部机构参与者对象
	 * 
	 * @param participantID
	 * @return
	 * @throws Exception
	 */
	public WFParticipant findOrgRoleParticipant(String participantID) throws Exception {
		// step1 : 从缓存中获取数据
		WFParticipant orgParticipant = (WFParticipant) wfpOrgCache.get(CACHE_KEYHEAD_ORGBYID + participantID);

		// step2 : 如果缓存中有数据，则直接返回
		if (orgParticipant != null) {
			return orgParticipant;
		} else {

			// 加入缓存同步
			synchronized (wfpOrgCacheLock) {
				wfpOrgServiceBean = BeanFactory.newInstance().getBean("WFPOrgServiceBean");

				// step3 : 如果缓存没有，则查库
				orgParticipant = this.wfpOrgServiceBean.findOrgRoleParticipant(participantID);

				// step4 : 将查询出的结果放入缓存，并返回
				wfpOrgCache.put(CACHE_KEYHEAD_ORGBYID + participantID, orgParticipant);

				return orgParticipant;
			}
		}

	}

	/**
	 * 根据租户ID，查询该租户下的所有本地机构(role)参与者列表
	 * 
	 * @param tenantID
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked" })
	public List<WFParticipant> getRoleParticipantsByTenantID(String tenantID) throws Exception {
		// step1 : 从缓存中获取数据
		List<WFParticipant> roleParticipants = (List<WFParticipant>) wfpOrgCache.get(CACHE_KEYHEAD_TENANTROLE + tenantID);

		// step2 : 如果缓存中有数据，则直接返回
		if (roleParticipants != null && roleParticipants.size() > 0) {
			return roleParticipants;
		} else {

			// 加入缓存同步
			synchronized (wfpOrgCacheLock) {
				wfpOrgServiceBean = BeanFactory.newInstance().getBean("WFPOrgServiceBean");

				// step3 : 如果缓存没有，则查库
				roleParticipants = this.wfpOrgServiceBean.getRoleParticipantsByTenantID(tenantID);

				// step4 : 将查询出的结果放入缓存，并返回
				wfpOrgCache.put(CACHE_KEYHEAD_TENANTROLE + tenantID, roleParticipants);

				return roleParticipants;
			}
		}
	}

	/**
	 * 根据机构编码获得子机构<br>
	 * 此处仅查询外部机构,因为内部机构（role）没有层级关系<br>
	 * 带缓存
	 * 
	 * @param orgCode
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked" })
	public List<WFParticipant> getChildOrgParticipantList(String orgCode) throws Exception {
		// step1 : 从缓存中获取数据
		List<WFParticipant> childOrgParticipantList = (List<WFParticipant>) wfpOrgCache.get(CACHE_KEYHEAD_CHILDORGPATIS + orgCode);

		// step2 : 如果缓存中有数据，则直接返回
		if (childOrgParticipantList != null && childOrgParticipantList.size() > 0) {
			return childOrgParticipantList;
		} else {

			// 加入缓存同步
			synchronized (wfpOrgCacheLock) {
				wfpOrgServiceBean = BeanFactory.newInstance().getBean("WFPOrgServiceBean");

				// step3 : 如果缓存没有，则查库
				childOrgParticipantList = this.wfpOrgServiceBean.getChildOrgParticipantList(orgCode);

				// step4 : 将查询出的结果放入缓存，并返回
				wfpOrgCache.put(CACHE_KEYHEAD_CHILDORGPATIS + orgCode, childOrgParticipantList);

				return childOrgParticipantList;
			}
		}
	}

	/**
	 * 获得所有的组织机构信息<br>
	 * 2018.12.09修改：只查询外部机构（org）不查询（role）且在查询时分页
	 * 
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked" })
	public List<WFParticipant> getAllOrgParticipantList(PageCond pageCond) throws Exception {
		// step1 : 从缓存中获取数据
		List<WFParticipant> allOrgParticipants = (List<WFParticipant>) wfpOrgCache.get(CACHE_KEY_ALLORGPATIS);

		// step2 : 如果缓存中有数据，则直接返回
		if (allOrgParticipants != null && allOrgParticipants.size() > 0) {
			return allOrgParticipants;
		} else {

			// 加入缓存同步
			synchronized (wfpOrgCacheLock) {
				wfpOrgServiceBean = BeanFactory.newInstance().getBean("WFPOrgServiceBean");

				// step3 : 如果缓存没有，则查库
				allOrgParticipants = this.wfpOrgServiceBean.getAllOrgParticipantList(pageCond);

				// step4 : 将查询出的结果放入缓存，并返回
				wfpOrgCache.put(CACHE_KEY_ALLORGPATIS, allOrgParticipants);

				return allOrgParticipants;
			}
		}
	}

	/**
	 * 根据用户id获得此用户的机构参与者
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public WFParticipant getParentParticipantByUserID(String userId) throws Exception {
		// step1 : 从缓存中获取数据
		WFParticipant orgParticipant = (WFParticipant) wfpOrgCache.get(CACHE_KEYHEAD_ORGBYUID + userId);

		// step2 : 如果缓存中有数据，则直接返回
		if (orgParticipant != null) {
			return orgParticipant;
		} else {

			// 加入缓存同步
			synchronized (wfpOrgCacheLock) {
				wfpOrgServiceBean = BeanFactory.newInstance().getBean("WFPOrgServiceBean");

				// step3 : 如果缓存没有，则查库
				orgParticipant = this.wfpOrgServiceBean.getParentParticipantByUserID(userId);

				// step4 : 将查询出的结果放入缓存，并返回
				wfpOrgCache.put(CACHE_KEYHEAD_ORGBYUID + userId, orgParticipant);

				return orgParticipant;
			}
		}
	}

	/**
	 * 根据机构ID获得此机构的父机构参与者
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public WFParticipant getParentParticipantByOrgCode(String parentOrgCode) throws Exception {
		// step1 : 从缓存中获取数据
		WFParticipant orgParticipant = (WFParticipant) wfpOrgCache.get(CACHE_KEYHEAD_ORGBYPOID + parentOrgCode);

		// step2 : 如果缓存中有数据，则直接返回
		if (orgParticipant != null) {
			return orgParticipant;
		} else {

			// 加入缓存同步
			synchronized (wfpOrgCacheLock) {
				wfpOrgServiceBean = BeanFactory.newInstance().getBean("WFPOrgServiceBean");

				// step3 : 如果缓存没有，则查库
				orgParticipant = this.wfpOrgServiceBean.getParentParticipantByOrgCode(parentOrgCode);

				// step4 : 将查询出的结果放入缓存，并返回
				wfpOrgCache.put(CACHE_KEYHEAD_ORGBYPOID + parentOrgCode, orgParticipant);

				return orgParticipant;
			}
		}
	}
}
