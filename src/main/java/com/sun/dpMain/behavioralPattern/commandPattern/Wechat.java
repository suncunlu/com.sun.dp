package com.sun.dpMain.behavioralPattern.commandPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wechat extends Application {
	private  Logger logger = LoggerFactory.getLogger(Wechat.class);
	@Override
	public void on() {
		// TODO Auto-generated method stub
		logger.info("微信打开了！");
	}

}
