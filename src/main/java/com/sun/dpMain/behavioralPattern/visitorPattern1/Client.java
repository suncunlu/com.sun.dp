package com.sun.dpMain.behavioralPattern.visitorPattern1;

/**
 * @author :suncunlu
 * @date :2018-12-14 14:33:28
 * @description :动态分派
 * 
 * C++和Java均是单分派语言，多分派语言的例子包括CLOS和Cecil。
 * 按照这样的区分，Java就是动态的单分派语言，因为这种语言的动态分派仅仅会考虑到方法的接收者的类型，
 * 同时又是静态的多分派语言，因为这种语言对重载方法的分派会考虑到方法的接收者的类型以及方法的所有参数的类型。
 * 
 * 单分派
 * 双重分派
 */
public class Client {
	public static void main(String[] args) {
		Horse blackHorse = new BlackHorse();//new Horse();
		blackHorse.eat();
	}
}
