package com.cmcc.participant.ground.service;

import java.util.List;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization;
import com.eos.workflow.omservice.WFParticipant;
import com.primeton.workflow.api.PageCond;

public interface IWFPOrgService {
	/**
	 * 新增机构
	 * 
	 * @param orgInfo
	 */
	public void addWFPOrganization(WfpAfOrganization orgInfo) throws Exception;

	/**
	 * 保存机构，根据org_code字段来判断是否有重复的，有则删了再加
	 * 
	 * @param orgInfo
	 */
	public void saveWFPOrganization(WfpAfOrganization orgInfo) throws Exception;

	/**
	 * 删除用户
	 * 
	 * @param orgInfo
	 */
	public void deleteWFPOrganization(WfpAfOrganization orgInfo) throws Exception;

	/**
	 * 获得顶级外部机构参与者
	 * 
	 * @return
	 * @throws Exception
	 */
	public WfpAfOrganization getRootOrganization() throws Exception;

	/**
	 * 根据用户id获得用户的所有角色列表
	 * 
	 * @param participantID
	 * @return
	 * @throws Exception
	 */
	public List<WFParticipant> getRoleListByUserId(String participantID) throws Exception;
	
	/**
	 * 根据id获取外部机构或者内部机构
	 * 
	 * @param participantID
	 * @return
	 * @throws Exception
	 */
	public WFParticipant findOrgRoleParticipant(String participantID) throws Exception;

	/**
	 * 根据租户ID，查询该租户下的所有本地机构(role)参与者列表
	 * 
	 * @param tenantID
	 * @throws Exception
	 */
	public List<WFParticipant> getRoleParticipantsByTenantID(String tenantID) throws Exception;

	/**
	 * 根据机构编码获得子机构<br>
	 * 此处仅查询外部机构,因为内部机构（role）没有层级关系
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<WFParticipant> getChildOrgParticipantList(String orgCode) throws Exception;
	
	/**
	 * 获得所有的组织机构信息<br>
	 * 2018.12.09修改：只查询外部机构（org）不查询（role）且在查询时分页
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<WFParticipant> getAllOrgParticipantList(PageCond pageCond) throws Exception;
	
	/**
	 * 根据用户id获得此用户的机构参与者
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public WFParticipant getParentParticipantByUserID(String userId) throws Exception;
	
	/**
	 * 根据机构ID获得此机构的父机构参与者
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public WFParticipant getParentParticipantByOrgCode(String parentOrgCode) throws Exception;
}
