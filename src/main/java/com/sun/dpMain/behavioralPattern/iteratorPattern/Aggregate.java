package com.sun.dpMain.behavioralPattern.iteratorPattern;

/**
 * @author :suncunlu
 * @date :2018-12-13 10:14:06
 * @description :
 */
public abstract class Aggregate {
	
	/**
	 * @return
	 * @description:工厂方法，创建响应迭代子对象接口
	 */
	public abstract Iterator createIterator();
}
