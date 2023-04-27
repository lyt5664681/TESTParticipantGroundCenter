/**
 * 
 */
package com.cmcc.participant.ground.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.cmcc.participant.ground.CMCCWFOMServiceImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl;
import com.eos.spring.DASDaoSupport;
import com.eos.workflow.omservice.WFParticipant;
import com.primeton.workflow.commons.logging.LogService;
import com.primeton.workflow.service.notifaction.impl.helper.WFMessageLog;

import commonj.sdo.DataObject;

/**
 * <pre>
 * Title: 用户操作服务
 * Description: 直接操作本地数据库的用户操作服务
 * </pre>
 * 
 * @author YunTao.Li
 * @version 1.00.00
 * 
 */
public class WFPUserService extends DASDaoSupport implements IWFPUserService {
	private static WFMessageLog messageLogger = WFMessageLog.getWFMessageLogger(WFPUserService.class);

	/**
	 * 
	 */
	public WFPUserService() {
	}

	/**
	 * 静态方法初始化对象
	 * 
	 * @return
	 */
	public static WFPUserService newInstance() {
		return new WFPUserService();
	}

	/**
	 * @param userInfo
	 */
	public void addWFPUser(WfpAfUserinfo userInfo) throws Exception {
		try {
			this.getDASTemplate().insertEntity(userInfo);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * @param userInfo
	 */
	public void saveWFPUser(WfpAfUserinfo userInfo) throws Exception {
		try {
			// step1 : 首先判断本地库有没有此用户主键
			String userAccount = userInfo.getUserAccount();
			WfpAfUserinfo priKeyTemplate = new WfpAfUserinfoImpl();
			priKeyTemplate.setUserAccount(userAccount);

			int ucount = this.getDASTemplate().countByTemplate(priKeyTemplate);

			// step2 : 如果有则先删除
			if (ucount > 0) {
				this.deleteWFPUser(priKeyTemplate);
				// 记录日志
//				messageLogger.log(LogService.LEVEL_ERROR, "************WFPUser************:用户数据变更: user account" + userAccount);
			}

			// step3 : 然后插入此用户到数据库
			this.addWFPUser(userInfo);
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * 从本地库删除用户
	 * 
	 * @param userInfo
	 */
	public void deleteWFPUser(WfpAfUserinfo userInfo) throws Exception {
		try {
			this.getDASTemplate().deleteByTemplate(userInfo);
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * 根据ID查询用户, 两张表查
	 * 
	 * @param userId
	 *            对应WFP_AF_PERSONMANAGEMENT表pm_person_id字段<br>
	 *            对应WFP_AF_USERINFO表user_account字段
	 * @throws Exception
	 */
	public WFParticipant getParticipantByID(String userId) throws Exception {
		WFParticipant userParticipant = new WFParticipant();

		// step1 : 查询用户只用查来源于jms的用户
		WfpAfUserinfo userData = new WfpAfUserinfoImpl();
		userData.setUserAccount(userId);
		this.getDASTemplate().expandEntity(userData);

		String userName = StringUtils.isBlank(userData.getUserName()) ? userData.getGivenName() : userData.getUserName();

		userParticipant.setId(userData.getUserAccount());
		userParticipant.setName(userName);
		userParticipant.setTypeCode(CMCCWFOMServiceImpl.PARTICIPANTTYPE_PERSON);

		return userParticipant;
	}

	/**
	 * 获得机构下的所有参与者<br>
	 * 不包括此机构下子机构下的参与者<br>
	 * 包括WFP_AF_PERSONMANAGEMENT表与WFP_AF_USERINFO表的数据
	 * 
	 * @param orgCode
	 * @throws Exception
	 */
	public List<WFParticipant> getParticipantByOrgId(String orgCode) throws Exception {
		List<WFParticipant> participantList = new ArrayList<WFParticipant>();

		// step1 : 查询WFP_AF_PERSONMANAGEMENT表
		String roleID = orgCode;
		WfpAfPersonmanagement personTemplate = new WfpAfPersonmanagementImpl();
		personTemplate.setPmRoleId(roleID);

		WfpAfPersonmanagement[] personDatas = this.getDASTemplate().queryEntitiesByTemplate(WfpAfPersonmanagement.class, personTemplate);

		// step1.1 转换为participant对象，并加入list
		for (WfpAfPersonmanagement personData : personDatas) {
			WFParticipant particiData = new WFParticipant();
			particiData.setId(personData.getPmPersonId());
			particiData.setName(personData.getPmPersonName());
			particiData.setTypeCode(CMCCWFOMServiceImpl.PARTICIPANTTYPE_PERSON);
			participantList.add(particiData);
		}

		// step2 : 查询WFP_AF_USERINFO表
		WfpAfUserinfo userTemplate = new WfpAfUserinfoImpl();
		userTemplate.setOrgCode(orgCode);

		WfpAfUserinfo[] userDatas = this.getDASTemplate().queryEntitiesByTemplate(WfpAfUserinfo.class, userTemplate);

		// step2.1 转换为participant对象，并加入list
		for (WfpAfUserinfo userData : userDatas) {
			String participantName = StringUtils.isBlank(userData.getUserName()) ? userData.getGivenName() : userData.getUserName();
			WFParticipant particiData = new WFParticipant();
			particiData.setId(userData.getUserAccount());
			particiData.setName(participantName);
			particiData.setTypeCode(CMCCWFOMServiceImpl.PARTICIPANTTYPE_PERSON);
			participantList.add(particiData);
		}

		return participantList;
	}

	/**
	 * 获得所有的用户参与者
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<WFParticipant> getAllUserParticipantList() throws Exception {
		List<WFParticipant> allParticipants = new ArrayList<WFParticipant>();

		// step1 : 通过sql获取所有用户
		DataObject[] userDatas = this.getDASTemplate().queryByNamedSql(DataObject.class, "com.cmcc.participant.ground.service.cmcc_om.getAllUsers",
				new HashMap());

		// step2 : 遍历设置为participant对象
		for (DataObject data : userDatas) {
			String userId = data.getString("userId");
			String userName = data.getString("userName");

			WFParticipant participantData = new WFParticipant();
			participantData.setId(userId);
			participantData.setName(userName);
			participantData.setTypeCode(CMCCWFOMServiceImpl.PARTICIPANTTYPE_PERSON);

			allParticipants.add(participantData);
		}

		return allParticipants;
	}

}
