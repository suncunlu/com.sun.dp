package com.sun.dpMain.structuralPattern.decoratorPattern;

public class SuperCar implements ICar {
	private ICar car;
	public SuperCar(ICar car) {
		this.car = car;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		car.move();
	}
}
