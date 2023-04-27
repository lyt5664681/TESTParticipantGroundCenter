/**
 * 文件名： CustomConfiguration.java
 * 版权： Copyright 2017-2022 CMCC All Rights Reserved.
 * 描述： 自定义配置文件读取
 */
package com.cmcc.participant.ground.util;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.eos.common.config.ConfigurationFactory;
import com.eos.foundation.eoscommon.ConfigurationUtil;
import com.eos.infra.config.Configuration;
import com.eos.infra.config.Configuration.Group;
import com.eos.infra.config.Configuration.Value;

/**
 * 自定义配置文件读取类 读取自定义配置文件
 * 
 * 
 * 这个类有些问题，当时写的时候，没有考虑govner热更新，后面着急硬改的逻辑，凑活先实现了功能，代码可以再改 优化性能
 * 
 * @author ghs
 * @date 2017-05-07 08:27:30
 */
public class GroundConfigurationUtil {

    public static HashMap<String, String> configMap = new HashMap<String, String>();// 配置信息存放map

    private static Logger logger = LogManager.getLogger(GroundConfigurationUtil.class);

    private final static String pakage = "com.cmcc.participant.ground";

    private final static String module = "CommonInfo";
    static {
        String configFilePath = getWebInfPath()
                + "/WEB-INF/_srv/work/user/com.cmcc.participant.ground/META-INF/contribution.eosinf";
        Configuration config = null;
        try {
            config = Configuration.initConfiguration(configFilePath);
        } catch (Exception e) {
            logger.info("非web启动");
            config = Configuration.initConfiguration(getWebInfPath() + "/src/META-INF/contribution.eosinf");
        }
        // String configFilePath = getWebInfPath() +
        // "/WEB-INF/_srv/work/user/com.cmcc.wfp.control.system/META-INF/contribution.eosinf";
        Map<String, Group> groups = config.getModule("CommonInfo").getGroups();
        for (Map.Entry<String, Group> groupEntry : groups.entrySet()) {
            Map<String, Value> values = groupEntry.getValue().getValues();
            for (Entry<String, Value> valueEntry : values.entrySet()) {
                configMap.put(groupEntry.getKey() + "." + valueEntry.getKey(), valueEntry.getValue().getValue());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(1 + get("CasInfo.LogoutUrl"));
    }

    /**
     * @desc 获取配置map
     * @date 2017-02-07 08:27:30
     * @return 自定义配置的map
     */
    public static HashMap<String, String> getConfigMap() {
        Configuration config = ConfigurationFactory.getContributionConfiguration(pakage);
        Map<String, Group> groups = config.getModule(module).getGroups();
        HashMap<String, String> currentConfigMap = new HashMap<String, String>();
        for (Map.Entry<String, Group> groupEntry : groups.entrySet()) {
            Map<String, Value> values = groupEntry.getValue().getValues();
            for (Entry<String, Value> valueEntry : values.entrySet()) {
                currentConfigMap.put(groupEntry.getKey() + "." + valueEntry.getKey(), valueEntry.getValue().getValue());
            }
        }
        return currentConfigMap;
    }

    /**
     * @desc 获取配置map
     * @date 2017-02-07 08:27:30
     * @return 自定义配置的map
     */
    public static String get(String key) {
        // System.out.println("=========进来了====getRemoteUser=======");
        String[] keyArr = key.split("\\.");
        String value = "";
        if (keyArr != null && keyArr.length > 1) {
            try {
                value = ConfigurationUtil.getContributionConfig(pakage, module, keyArr[0], keyArr[1]);
            } catch (Exception e) {
                value = configMap.get(key);
            }
        }
        // System.out.println("配置文件=========" + value);
        return value;
    }

    /**
     * @desc 获取项目路径
     * @date 2017-05-07 08:27:30
     * @return 返回项目路径
     */
    private static String getWebInfPath() {
        URL url = GroundConfigurationUtil.class.getProtectionDomain().getCodeSource().getLocation();
        String path = url.toString();
        int index = path.indexOf("WEB-INF");
        if (index == -1) {
            index = path.indexOf("classes");
        }
        if (index == -1) {
            index = path.indexOf("bin");
        }
        path = path.substring(0, index);
        if (path.startsWith("zip")) {// 当class文件在war中时，此时返回zip:D:/...这样的路径
            path = path.substring(4);
        } else if (path.startsWith("file")) {// 当class文件在class文件中时，此时返回file:/D:/...这样的路径
            path = path.substring(6);
        } else if (path.startsWith("jar")) {// 当class文件在jar文件里面时，此时返回jar:file:/D:/...这样的路径
            path = path.substring(10);
        }
        try {
            path = URLDecoder.decode(path, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            logger.error(e);
        }
        String os = System.getProperty("os.name");
        if (!os.toLowerCase().startsWith("win")) {
            path = "/" + path;
        }
        return path;
    }
}
