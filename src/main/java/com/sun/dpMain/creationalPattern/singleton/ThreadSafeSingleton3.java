package com.sun.dpMain.creationalPattern.singleton;

/**
 * @author :suncunlu
 * @date :2018-12-06 14:48:16
 * @description :
 */
public class ThreadSafeSingleton3 {
	private static ThreadSafeSingleton3 instance;
	private ThreadSafeSingleton3() {}
	public static ThreadSafeSingleton3 getInstance() {
		if(instance==null) {
			synchronized (ThreadSafeSingleton3.class) {
				if(instance==null) instance = new ThreadSafeSingleton3();
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		ThreadSafeSingleton3 instance2 = ThreadSafeSingleton3.getInstance();
		System.out.println(instance2);
	}
}
