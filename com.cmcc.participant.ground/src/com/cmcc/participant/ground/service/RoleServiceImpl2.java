/**
 * 文件名： XXXXX.java
 *  版权： Copyright 2017-2022 CMCC All Rights Reserved.
 *  描述：
 */
package com.cmcc.participant.ground.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo;
import com.eos.foundation.database.DatabaseExt;
import com.eos.spring.DASTemplate;

import commonj.sdo.DataObject;

/**
 * XXXX
 * 
 * @author YLJ
 * @date 2021年4月23日
 */
public class RoleServiceImpl2 implements  RoleService{

	/* （非 Javadoc）
	 * @see com.cmcc.participant.ground.service.OrgService#queryOrg(java.lang.String)
	 */
	@Override
	public Object[] queryRole(String tenantId,DASTemplate dasTemplate) throws Exception {
		HashMap<String , String > map = new HashMap<>();
		map.put("TANENTID", tenantId);
		Object[] Roles = DatabaseExt.queryByNamedSql("default", "com.cmcc.participant.ground.service.cmcc_om.getRole", map);		
		return Roles;	
	}
	
	

}
