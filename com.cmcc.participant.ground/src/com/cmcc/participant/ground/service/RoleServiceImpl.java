/**
 * 文件名： XXXXX.java
 *  版权： Copyright 2017-2022 CMCC All Rights Reserved.
 *  描述：
 */
package com.cmcc.participant.ground.service;

import java.util.HashMap;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl;
import com.eos.spring.DASDaoSupport;
import com.eos.spring.DASTemplate;


/**
 * XXXX
 * 
 * @author YLJ
 * @date 2021年4月23日
 */
public class RoleServiceImpl extends DASDaoSupport implements  RoleService{
	public RoleServiceImpl() {
	}
	public static RoleServiceImpl newInstance() {
		return new RoleServiceImpl();
	}

	/* （非 Javadoc）
	 * @see com.cmcc.participant.ground.service.OrgService#queryOrg(java.lang.String)
	 */
	@Override
	public Object[] queryRole(String tenantId,DASTemplate dasTemplate) throws Exception {
		HashMap<String , String > map = new HashMap<>();
		map.put("TANENTID", tenantId);
		WFPOrgService wfpOrgService = new  WFPOrgService();
//		com.cmcc.participant.ground.service.WFPOrgService
		WfpAfRole roleTemplate = new WfpAfRoleImpl();
		roleTemplate.setRoTenantid(tenantId);
		WfpAfRole[] roleDatas = dasTemplate.queryEntitiesByTemplate(WfpAfRole.class, roleTemplate);		
		return roleDatas;	
	}
	
	

}
