package com.cmcc.participant.ground.service;

import java.util.List;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo;
import com.eos.workflow.omservice.WFParticipant;

/**
 * @author YunTao.Li
 * 
 */
public interface IWFPUserService {

	/**
	 * 新增用户
	 * 
	 * @param userInfo
	 */
	public void addWFPUser(WfpAfUserinfo userInfo) throws Exception;

	/**
	 * 保存用户根据用户主键判断是保存还是更新
	 * 
	 * @param userInfo
	 */
	public void saveWFPUser(WfpAfUserinfo userInfo) throws Exception;

	/**
	 * 删除用户
	 * 
	 * @param userInfo
	 */
	public void deleteWFPUser(WfpAfUserinfo userInfo) throws Exception;

	/**
	 * 查询本地两张用户表，取并集<br>
	 * 用户ID指的是本地WFP_AF_USERINFO表的user_account<br>
	 * 以及WFP_AC_PERSONMANAGEMENT表的pm_person_id
	 * 
	 * @param userId
	 */
	public WFParticipant getParticipantByID(String userId) throws Exception;

	/**
	 * 获得机构下的所有参与者<br>
	 * 不包括此机构下子机构下的参与者<br>
	 * 包括WFP_AF_PERSONMANAGEMENT表与WFP_AF_USERINFO表的数据
	 */
	public List<WFParticipant> getParticipantByOrgId(String orgCode) throws Exception;
	
	/**
	 * 获得所有的用户参与者
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<WFParticipant> getAllUserParticipantList() throws Exception;

}
