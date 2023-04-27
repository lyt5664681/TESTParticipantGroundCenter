package com.cmcc.participant.ground.resolve;

import java.io.File;
import java.io.InputStream;
import java.util.Hashtable;

import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import weblogic.jms.common.JMSConstants;
import weblogic.jms.common.LostServerException;
import weblogic.jms.extensions.WLConnection;

import com.primeton.workflow.commons.logging.LogService;
import com.primeton.workflow.service.notifaction.impl.helper.WFMessageLog;

public class JmsFactory {
	private static JmsFactory jmsFactoryInstance = null;

	private static WFMessageLog messageLogger = WFMessageLog
			.getWFMessageLogger(JmsFactory.class);
	public static final String JNDI_FACTORY = "weblogic.jndi.WLInitialContextFactory";
	public static final String JMS_FACTORY = "JMSFACTORY_HQ";
	public static final String sub = "HQ_WFP";
	public static InitialContext initialContext;
	public static Object syncLock = new Object();

	public static JmsFactory getInstance() {
		if (jmsFactoryInstance == null) {
			synchronized (syncLock) {
				if (jmsFactoryInstance == null) {
					jmsFactoryInstance = new JmsFactory();
				}
			}
		}
		return jmsFactoryInstance;
	}

	static {
		try {
			JmsFactory factory = JmsFactory.getInstance();
			factory.initInitialContext();
//			factory.initTopicConnection();
		} catch (Throwable e) {
			e.printStackTrace();
			messageLogger.log(LogService.LEVEL_ERROR,
					"************JNDI_FACTORY************:init exception : "
							+ e);
		}
	}

	private void initInitialContext() throws Throwable {
		try {
			if (initialContext == null) {
				// step1 : 从web.xml中获取配置
				ClassLoader cl = Thread.currentThread().getContextClassLoader();
				InputStream in = cl.getResourceAsStream("config"
						+ File.separator + "jms.properties");
				Configuration config = new Configuration(in);
				String providerURL = config.getValue("PROVIDER_URL");
				String mqUsername = config.getValue("MQ_USERNAME");
				String mqPwd = config.getValue("MQ_PASSWORD");
				System.setProperty("weblogic.MaxMessageSize", "300000000");
				                                               
				Hashtable env = new Hashtable();
				env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
				env.put(Context.PROVIDER_URL, providerURL);
				env.put(Context.SECURITY_PRINCIPAL, mqUsername);
				env.put(Context.SECURITY_CREDENTIALS, mqPwd);
				initialContext = new InitialContext(env);
			}
		} catch (Throwable e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 初始化topic
	 * 
	 * @param ctx
	 * @param topicName
	 * @throws NamingException
	 * @throws JMSException
	 */
//	public void initTopicConnection() throws Throwable {
//		try {
//			if (topicConnection == null) {
//				topicConnFactory = (TopicConnectionFactory) initialContext
//						.lookup(JMS_FACTORY);
//				topicConnection = topicConnFactory.createTopicConnection();
//				topicConnection.setClientID(sub);
//			}
//		} catch (Throwable e) {
//			throw e;
//		}
//
//	}

//	public static TopicConnection getTopicConnection() {
//		return topicConnection;
//	}

	public static TopicConnection getTopicConnection(String factoryName) {
		try {
			TopicConnectionFactory topicConnFactory = (TopicConnectionFactory) initialContext
				     .lookup(factoryName);
				   TopicConnection topicConnection = topicConnFactory
				     .createTopicConnection();
				   topicConnection.setClientID(sub);
				   ((WLConnection) topicConnection).setReconnectPolicy(JMSConstants.RECONNECT_POLICY_ALL);
				            ((WLConnection) topicConnection).setReconnectBlockingMillis(30000L);
				            ((WLConnection) topicConnection).setTotalReconnectPeriodMillis(-1L);
				   topicConnection.setExceptionListener(new ExceptionListener() {
				                @Override
				                public void onException(JMSException arg0) {
				                    // Assume Disconnected.
				                    if (arg0 instanceof LostServerException) {
				                     messageLogger.log(LogService.LEVEL_ERROR, "Connection to the Server has been lost, will retry in 30 seconds. "
				                                + arg0.toString());
				                    } else {
				                     messageLogger.log(LogService.LEVEL_ERROR, arg0.toString());
				                    }

				                }
				            });
				   return topicConnection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static InitialContext getInitialContext() {
		return initialContext;
	}

	public static void delayInit() {
		long delay = 1000 * 60 * 1; // 1min
		try {

			Thread.currentThread().sleep(delay);
			System.out.println("InnerUserConsumer结束等待spring容器启动");

		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
