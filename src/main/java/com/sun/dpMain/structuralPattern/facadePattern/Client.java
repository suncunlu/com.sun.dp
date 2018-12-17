package com.sun.dpMain.structuralPattern.facadePattern;

import java.util.concurrent.TimeUnit;
/**
 *外观模式（Facade）（门面模式）
 * @author :suncunlu
 * @date :2018-12-10 16:38:23
 * @description :
 */
public class Client {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.start();
		
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		computer.shutdown();
		
	}
}
