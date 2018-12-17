package com.sun.dpMain.creationalPattern.singleton;

/**
 * @author :suncunlu
 * @date :2018-12-06 14:37:02
 * @description :2.多线程安全单例模式实例二(使用同步方法)
 */
public class ThreadSafeSingleton2 {
	private static ThreadSafeSingleton2 instance;
	private ThreadSafeSingleton2() {}
	
    public static synchronized ThreadSafeSingleton2 getInstance(){    //对获取实例的方法进行同步
        if (instance == null)     
          instance = new ThreadSafeSingleton2(); 
        return instance;
      }
}
