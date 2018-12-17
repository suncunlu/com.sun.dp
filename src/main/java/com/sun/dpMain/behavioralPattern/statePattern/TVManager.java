package com.sun.dpMain.behavioralPattern.statePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author :suncunlu
 * @date :2018-12-14 14:13:30
 * @description :电视机遥控器
 */
public class TVManager {
	private  Logger logger = LoggerFactory.getLogger(getClass());
	TVState state;
	
	/**
	 * @return the state
	 */
	public TVState getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(TVState state) {
		this.state = state;
	}
	public void powerOn() {
		// TODO Auto-generated method stub
		setState(new PowerOnstate());
		logger.info("开机成功！");
	}
	
	public void powerOff() {
		// TODO Auto-generated method stub
		setState(new PowerOffsetState());
		logger.info("关机啦！");
	}
	public void nextChannel() {
		// TODO Auto-generated method stub
		state.nextChannel();
	}
	public void prevchannel() {
		// TODO Auto-generated method stub
		state.prevChannel();
	}
	public void turnUp() {
		// TODO Auto-generated method stub
		state.turnUp();
	}
	public void turnDown() {
		state.turnDown();
	}
}
