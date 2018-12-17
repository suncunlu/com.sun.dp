package com.sun.dpMain.behavioralPattern.statePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author :suncunlu
 * @date :2018-12-14 14:11:43
 * @description :开机状态的实现
 */
public class PowerOnstate implements TVState {
	private  Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub
		logger.info("跳转到下一个频道");
	}

	@Override
	public void prevChannel() {
		// TODO Auto-generated method stub
		logger.info("跳转到上一个频道");
	}

	@Override
	public void turnUp() {
		// TODO Auto-generated method stub
		logger.info("音量增加");
	}

	@Override
	public void turnDown() {
		// TODO Auto-generated method stub
		logger.info("音量减少");
	}

}
