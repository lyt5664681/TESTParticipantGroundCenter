package com.cmcc.participant.ground.service.common;

import com.cmcc.participant.ground.service.IWFPOrgService;
import com.cmcc.participant.ground.service.IWFPUserService;
import com.cmcc.participant.ground.util.GroundConfigurationUtil;
import com.eos.runtime.core.TraceLoggerFactory;
import com.eos.system.logging.Logger;
import com.eos.system.utility.StringUtil;

public class OMServiceFactory {

    private static final Logger logger = TraceLoggerFactory.getContributionTraceLogger("com.cmcc.participant.ground",
            OMServiceFactory.class);

    public static IWFPOrgService getOrgService(String tenantId) {
        String className = GroundConfigurationUtil.get("OrgServiceClass." + tenantId);
        if (StringUtil.isNullOrBlank(className)) {
            className = "com.cmcc.participant.ground.service.common.WFPCommonOrgService";
        }
        return (IWFPOrgService) getService(className);
    }

    public static IWFPUserService getUserService(String tenantId) {
        String className = GroundConfigurationUtil.get("UserServiceClass." + tenantId);
        if (StringUtil.isNullOrBlank(className)) {
            className = "com.cmcc.participant.ground.service.common.WFPCommonUserService";
        }
        return (IWFPUserService) getService(className);
    }

    public static Object getService(String className) {
        try {
            logger.info("||OMServiceFactory||getService||获取到的className为:" + className);
            return Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            logger.error("||OMServiceFactory||InstantiationException||异常为:" + e);
        } catch (IllegalAccessException e) {
            logger.error("||OMServiceFactory||IllegalAccessException||异常为:" + e);
        } catch (ClassNotFoundException e) {
            logger.error("||OMServiceFactory||ClassNotFoundException||异常为:" + e);
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        getOrgService("RMS").findOrgRoleParticipant("zhangsan");
    }
}
//