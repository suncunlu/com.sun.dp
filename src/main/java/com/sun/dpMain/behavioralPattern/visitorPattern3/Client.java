package com.sun.dpMain.behavioralPattern.visitorPattern3;

/**
 * @author :suncunlu
 * @date :2018-12-14 15:04:15
 * @description :双重分派
 */
public class Client {
public static void main(String[] args) {
	East east = new SubEast1();
	West west = new SubWest1();
	east.goEast(west);
	
	east = new SubEast1();
	west = new SubWest2();
	east.goEast(west);
}
}
