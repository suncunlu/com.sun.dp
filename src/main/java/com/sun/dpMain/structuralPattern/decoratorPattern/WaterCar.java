package com.sun.dpMain.structuralPattern.decoratorPattern;

public class WaterCar extends SuperCar {

	public WaterCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	private void swim() {
		// TODO Auto-generated method stub
		System.out.println("水里游");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
		
	}
}
