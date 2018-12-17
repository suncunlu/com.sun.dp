package com.sun.dpMain.structuralPattern.ClassAdapterPattern;

public class Client {
	/**
	 * 
	 * @param args
	 * @description:Target需要method1和method2两个方法。而源adaptee只有method1一个方法的实现。因此需要适配器adapter实现method2方法
	 */
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.method1();
		adapter.method2();
	}
}
