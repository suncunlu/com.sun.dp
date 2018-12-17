package com.sun.dpMain.behavioralPattern.statePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author :suncunlu
 * @date :2018-12-14 14:11:59
 * @description :关机状态的实现
 */
public class PowerOffsetState implements TVState {
	private  Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void prevChannel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnDown() {
		// TODO Auto-generated method stub

	}

}
