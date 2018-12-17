package com.sun.dpMain.behavioralPattern.statePattern;

/**
 * @author :suncunlu
 * @date :2018-12-14 14:12:26
 * @description :电视机状态接口
 */
public interface TVState {
	void nextChannel();
	void prevChannel();
	void turnUp();
	void turnDown();
}
