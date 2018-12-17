package com.sun.dpMain.structuralPattern.ClassAdapterPattern;
/**
 * 
 * @author :suncunlu
 * @date :2018-12-10 15:10:03
 * @description :适配器（Adapter）：连接目标和源的中间对象，相当于插头转换器。
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("do method2");
	}
	
}
