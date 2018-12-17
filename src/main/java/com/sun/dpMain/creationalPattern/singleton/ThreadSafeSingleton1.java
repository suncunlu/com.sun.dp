package com.sun.dpMain.creationalPattern.singleton;







/**
 * @author :suncunlu
 * @date :2018-12-06 14:47:25
 * @description :
 */
public class ThreadSafeSingleton1{
	
	private static ThreadSafeSingleton1 threadSafeSingleton1 = new ThreadSafeSingleton1();
	
	private ThreadSafeSingleton1() {}

	public ThreadSafeSingleton1 getInstance() {
		// TODO Auto-generated method stub
		return threadSafeSingleton1;
	}
	
}
