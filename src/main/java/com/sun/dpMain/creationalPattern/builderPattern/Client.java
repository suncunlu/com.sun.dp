package com.sun.dpMain.creationalPattern.builderPattern;

public class Client {
	public static void main(String[] args) {
		Builder concreteBuiler = new ConcreteBuiler();
		Director director = new Director(concreteBuiler);
		Product product = director.construt();
		System.out.println(product.toString());
	}
}
