package com.sun.dpMain.structuralPattern.ObjectAdapterPattern;

public class Client {
	public static void main(String[] args) {
		Adaptee adaptee=  new Adaptee();
		Adapter adapter = new Adapter(adaptee);
		adapter.method1();
		adapter.method2();
	}
}
