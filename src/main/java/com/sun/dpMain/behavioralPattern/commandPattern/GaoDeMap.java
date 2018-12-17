package com.sun.dpMain.behavioralPattern.commandPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GaoDeMap extends Application {
	private  Logger logger = LoggerFactory.getLogger(GaoDeMap.class);
	@Override
	public void on() {
		// TODO Auto-generated method stub
		logger.info("高德地图打开了！");
	}

}
