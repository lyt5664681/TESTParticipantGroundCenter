package com.cmcc.participant.ground.resolve;

import java.util.Hashtable;

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
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class OMConsumer implements MessageListener {
	public static final String JNDI_FACTORY = "weblogic.jndi.WLInitialContextFactory";

	public static final String PROVIDER_URL = "t3://172.16.194.92:9300";

	public static final String JMS_FACTORY = "weblogic.jms.ConnectionFactory";

	public static final String TOPIC = "TOPIC_DISTEIPUSERSRV_SOA";

	public static final String sub = "HQ_WFP";

	private TopicConnectionFactory topicConnFactory;

	private TopicConnection topicConnection;

	private TopicSession topicSession;

	private TopicSubscriber topicSubscriber;

	private Topic topic;

	private boolean quit = false;

	public void onMessage(Message msg) {
		System.out.println("on message");
		try {
			String msgText = "";
			if (msg instanceof TextMessage) {
				msgText = ((TextMessage) msg).getText();
			} else {
				msgText = msg.toString();
			}
			
			// 初始化数据，并入库
			InitializeOMData initOMBean = new InitializeOMData(msgText, "utf-8");
			initOMBean.initInnerUserData();

			if (msgText.equalsIgnoreCase("quit")) {
				synchronized (this) {
					// quit = true;
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
	public void init(Context ctx, String topicName) throws NamingException, JMSException {
		topicConnFactory = (TopicConnectionFactory) ctx.lookup(JMS_FACTORY);
		topicConnection = topicConnFactory.createTopicConnection();
		topicConnection.setClientID(sub);
		topicSession = topicConnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);

		topic = (Topic) ctx.lookup(topicName);
		topicSubscriber = topicSession.createDurableSubscriber(topic, sub);
		topicSubscriber.setMessageListener(this);
		topicConnection.start();
	}

	/**
	 * 加载配置
	 * 
	 * @return
	 * @throws NamingException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private InitialContext getInitialContext() throws NamingException {
		Hashtable env = new Hashtable();
		env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
		env.put(Context.PROVIDER_URL, PROVIDER_URL);
		env.put(Context.SECURITY_PRINCIPAL, "hq_wfp_jms_receiver");
		env.put(Context.SECURITY_CREDENTIALS, "@02Petc4FfA$");

		return new InitialContext(env);
	}

	public void startSubscribe() throws NamingException, JMSException {
		System.out.println("class.forname 執行");
		final InitialContext ic = getInitialContext();

		Thread th = new Thread(new Runnable() {
			public void run() {
				try {
					OMConsumer consumer = new OMConsumer();
					consumer.init(ic, TOPIC);
					synchronized (consumer) {
						while (!consumer.quit) {
							try {
								consumer.wait();
							} catch (InterruptedException ie) {
							}
						}
					}
					consumer.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		th.start();
	}

	public void close() throws JMSException {
		topicSubscriber.close();
		topicSession.close();
		topicConnection.close();
	}

	static {
		try {
			new OMConsumer().startSubscribe();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (JMSException e) {
			e.printStackTrace();
		}

	}
}
