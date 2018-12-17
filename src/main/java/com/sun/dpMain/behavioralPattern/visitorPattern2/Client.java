package com.sun.dpMain.behavioralPattern.visitorPattern2;

/**
 * @author :suncunlu
 * @date :2018-12-14 14:39:34
 * @description :静态分派
 */
public class Client {
public static void main(String[] args) {
	WhiteHorse whiteHorse = new WhiteHorse();
	BlackHorse blackHorse = new BlackHorse();
	Mozi mozi = new Mozi();
	
	mozi.ride(whiteHorse);
	mozi.ride(blackHorse);
}
}
