package com.sun.dpMain.creationalPattern.builderPattern;

public class ConcreteBuiler extends Builder{

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.setPartA("A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.setPartB("B");
	}

	@Override
	public void buildPartC() {
		// TODO Auto-generated method stub
		product.setPartC("C");
	}

}
