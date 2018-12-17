package com.sun.dpMain.structuralPattern.decoratorPattern;

public class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	private void fly() {
		// TODO Auto-generated method stub
		System.out.println("天上飞");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}

}
