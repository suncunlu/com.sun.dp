package com.sun.dpMain.structuralPattern.decoratorPattern;

public class AICar extends SuperCar {

	public AICar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	private void autoMove() {
		// TODO Auto-generated method stub
		System.out.println("自动跑");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		autoMove();
	}
}
