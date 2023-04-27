/**
 * 
 */
package com.cmcc.participant.ground.service;

import java.util.List;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl;
import com.eos.spring.DASDaoSupport;

/**
 * <pre>
 * Title: 用户岗位service
 * Description: 不带缓存，直接查询数据库
 * </pre>
 * 
 * @author YunTao.Li
 * @version 1.00.00
 * 
 */
public class WFPUserPositionService extends DASDaoSupport {

	public WFPUserPositionService() {
	}

	/**
	 * 保存用户的岗位信息，每次都删除所有用户的老岗位，新增用户的新岗位
	 * 
	 * @param positionList
	 * @throws Exception
	 */
	public void saveUserPositions(List<WfpAfUserposition> positionList) throws Exception {
		try {
			// step1 : 拿出集合中第一个岗位信息，获取所属的用户信息
			if (positionList.size() < 1) {
				return;
			}
			WfpAfUserposition userPositionInfo = positionList.get(0);
			String userAccount = userPositionInfo.getUserAccount();

			// step2 : 查询此用户下在本地数据库中有没有信息,如果有则删除
			WfpAfUserposition countTemplate = new WfpAfUserpositionImpl();
			countTemplate.setUserAccount(userAccount);
			int pcount = getDASTemplate().countByTemplate(countTemplate);
			if (pcount > 0) {
				this.deleteUserPositions(userAccount);
			}

			// step3 : 遍历插入用户的岗位信息
			for (WfpAfUserposition userPosition : positionList) {
				this.addUserPosition(userPosition);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 新增插入岗位信息
	 * 
	 * @param userPosition
	 */
	public void addUserPosition(WfpAfUserposition userPosition) throws Exception {
		try {
			this.getDASTemplate().getPrimaryKey(userPosition);
			this.getDASTemplate().insertEntity(userPosition);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 删除某个用户的全部岗位信息
	 * 
	 * @param userAccount
	 */
	public void deleteUserPositions(String userAccount) throws Exception {
		try {
			WfpAfUserposition delTemplate = new WfpAfUserpositionImpl();
			delTemplate.setUserAccount(userAccount);

			this.getDASTemplate().deleteByTemplate(delTemplate);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
