package com.xikang.jms;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.JmsException;

public class SimpleJMSReceiver {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-receive.xml");
		while(true) {
		}
	}
	
	public void receive(TextMessage message) throws JmsException, JMSException {
		System.out.println(message.getStringProperty("phrCode"));
		System.out.println(message.getText());
	}
}
