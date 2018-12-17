package com.sun.dpMain.behavioralPattern.statePattern;

/**
 * @author :suncunlu
 * @date :2018-12-14 14:22:19
 * @description :状态模式
 */
public class Client {
public static void main(String[] args) {
	TVManager tvManager = new TVManager();
	
	//设置开机
	tvManager.powerOn();
	//下一个频道
	tvManager.nextChannel();
	//音量增加
	tvManager.turnUp();
	
	//关闭电视机
	tvManager.powerOff();
	//上一个频道
	tvManager.prevchannel();
}
}
