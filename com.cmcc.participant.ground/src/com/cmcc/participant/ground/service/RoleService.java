/**
 * 文件名： XXXXX.java
 *  版权： Copyright 2017-2022 CMCC All Rights Reserved.
 *  描述：
 */
package com.cmcc.participant.ground.service;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo;
import com.eos.spring.DASTemplate;

/**
 * XXXX
 * 
 * @author YLJ
 * @date 2021年4月23日
 */
public interface RoleService  {
	
	public Object[] queryRole(String tenantId,DASTemplate dasTemplate) throws Exception;

}
