package com.sun.dpMain.behavioralPattern.observerPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User implements Observer {
	private String name;
	private String message;
	private Logger logger = LoggerFactory.getLogger(getClass());
	public User(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		this.message=message;
		read();
	}

	private void read() {
		// TODO Auto-generated method stub
		logger.info(name+"收到推送消息"+message);
	}

}