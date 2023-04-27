package com.cmcc.participant.ground.resolve;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.primeton.workflow.commons.logging.LogService;
import com.primeton.workflow.service.notifaction.impl.helper.WFMessageLog;

public class OutsideUserConsumer implements MessageListener, ServletContextListener {
	private static WFMessageLog messageLogger = WFMessageLog.getWFMessageLogger(OutsideUserConsumer.class);

	public static final String JNDI_FACTORY = "weblogic.jndi.WLInitialContextFactory";

	public static final String PROVIDER_URL = "t3://172.16.194.92:9300";

	public static final String JMS_FACTORY = "weblogic.jms.ConnectionFactory";

	public static final String TOPIC = "TOPIC_DISTEIPEXTERNALUSERSRV_SOA";

	public static final String sub = "HQ_WFP";

	private TopicConnectionFactory topicConnFactory;

	private TopicConnection topicConnection;

	private TopicSession topicSession;

	private TopicSubscriber topicSubscriber;

	private Topic topic;

	private boolean quit = false;

	final InheritableThreadLocal<String> topicThreadLocal = new InheritableThreadLocal<String>();

	public void onMessage(Message msg) {
		try {
			String msgText = "";
			if (msg instanceof TextMessage) {
				msgText = ((TextMessage) msg).getText();
			} else {
				msgText = msg.toString();
			}

			// 初始化数据，并入库
			InitializeOMData initOMBean = new InitializeOMData(msgText, "utf-8");
			initOMBean.initOutsideUserData();

			if (msgText.equalsIgnoreCase("quit")) {
				messageLogger.log(LogService.LEVEL_ERROR, "************OutsideUserConsumer************:do quit");
				synchronized (this) {
					quit = true;
					this.notifyAll();
				}
			}
		} catch (JMSException jmse) {
			jmse.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
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
	public void init(String topicName) throws Throwable {
		try {
			String factoryName = "JMSFACTORY_HQ";
			messageLogger.log(LogService.LEVEL_ERROR, "************OrganizationConsumer************:start init factoryName : " + factoryName);
			
			TopicConnection topicConnection = JmsFactory.getTopicConnection(factoryName);
			topicSession = topicConnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
			
			topic = (Topic) JmsFactory.getInitialContext().lookup(topicName);
			topicSubscriber = topicSession.createDurableSubscriber(topic, "HQ_WFP");
			topicSubscriber.setMessageListener(this);
			
			JmsFactory.delayInit();
			messageLogger.log(LogService.LEVEL_ERROR, "************OutsideUserConsumer************:delay end start connection");
			topicConnection.start();
		} catch (Throwable e) {
			e.printStackTrace();
			messageLogger.log(LogService.LEVEL_ERROR, "************OutsideUserConsumer************:init exception " + e);
		}
	}

	public void startSubscribe() throws Throwable {
		// step2 : 将监听加载到线程中
		// begin--add by liyuntao 2019.03.14,循环启动线程 每个线程监听不同的topic
		for (String singleTopic : TOPIC.split(",")) {
			topicThreadLocal.set(singleTopic);
			// end--add by liyuntao 2019.03.14,循环启动线程 每个线程监听不同的topic
			Thread th = new Thread(new Runnable() {
				public void run() {

					try {
						OutsideUserConsumer consumer = new OutsideUserConsumer();
						// begin--add by liyuntao 2019.03.14,循环启动线程
						// 每个线程监听不同的topic
						String singleTopic = topicThreadLocal.get();
						consumer.init(singleTopic);
						// end--add by liyuntao 2019.03.14,循环启动线程 每个线程监听不同的topic
						synchronized (consumer) {
							while (!consumer.quit) {
								try {
									System.out.println("************OutsideUserConsumer************:开始监听");
									messageLogger.log(LogService.LEVEL_ERROR, "************OutsideUserConsumer************:start lisenter ");
									consumer.wait();
								} catch (Throwable ie) {
									ie.printStackTrace();
									messageLogger.log(LogService.LEVEL_ERROR, "************OutsideUserConsumer************:thread while Exception :" + ie);
								}
							}
						}
						System.out.println("关闭了");
						messageLogger.log(LogService.LEVEL_ERROR, "************OutsideUserConsumer************:consumer close");
						consumer.close();
					} catch (Throwable e) {
						e.printStackTrace();
						messageLogger.log(LogService.LEVEL_ERROR, "************OutsideUserConsumer************:thread Exception:" + e);
					}
				}
			});

			// step4 : 启动线程
			th.start();
		}
	}

	public void close() throws JMSException {
		try {
			topicSubscriber.close();
			topicSession.close();
			topicConnection.close();
		} catch (Throwable e) {
			messageLogger.log(LogService.LEVEL_ERROR, "************OutsideUserConsumer************:close Exception " + e);
		}
	}

	static {
		try {
			new OutsideUserConsumer().startSubscribe();
		} catch (Throwable e) {
			e.printStackTrace();
			messageLogger.log(LogService.LEVEL_ERROR, "************OutsideUserConsumer************:static Exception " + e);
		}

	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO 自动生成的方法存根

	}
}
