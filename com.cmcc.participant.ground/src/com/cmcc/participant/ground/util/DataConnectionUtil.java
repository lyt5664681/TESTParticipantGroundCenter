package com.cmcc.participant.ground.util;

import java.lang.reflect.Array;

import com.eos.data.datacontext.DataContextManager;
import com.eos.data.datacontext.IMUODataContext;
import com.eos.runtime.core.TraceLoggerFactory;
import com.eos.system.logging.Logger;
import com.primeton.bps.multitenancy.model.TenantModel;
import com.primeton.bps.multitenancy.service.IMultiTenancyService;
import com.primeton.bps.multitenancy.service.impl.MultiTenancyService4Sca;

public class DataConnectionUtil {

    private static final Logger logger = TraceLoggerFactory.getContributionTraceLogger("com.cmcc.participant.ground",
            DataConnectionUtil.class);

    public static String getTenantIdDataSource(String tenantID) throws Exception {
        IMUODataContext muo = DataContextManager.current().getMUODataContext();
        IMultiTenancyService imts = new MultiTenancyService4Sca();
        TenantModel tenantModel = imts.queryTenantByID(tenantID);
        String dataSource = tenantModel.getDatasource();
        return dataSource;
    }

    public static <T> Object[] castArray(Class<T> componentType, Object[] dataObjects) {
        if (componentType == null) {
            return (Object[]) dataObjects;
        } else {
            Object[] ts = (Object[]) ((Object[]) Array.newInstance(componentType, dataObjects.length));
            try {
                System.arraycopy(dataObjects, 0, ts, 0, dataObjects.length);
                return ts;
            } catch (ArrayStoreException arg5) {
                String sourceClassName = "";
                if (dataObjects != null && dataObjects.length > 0 && dataObjects[0] != null) {
                    sourceClassName = dataObjects[0].getClass().getName();
                }
                throw new RuntimeException("Can\'t convert class \"" + sourceClassName + "\" to \""
                        + componentType.getName() + "\".");
            }
        }
    }
}
