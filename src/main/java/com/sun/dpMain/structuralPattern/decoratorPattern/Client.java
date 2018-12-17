package com.sun.dpMain.structuralPattern.decoratorPattern;

public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		//car.move();
		
		FlyCar flyCar = new FlyCar(car);
		//flyCar.move();
		
		WaterCar waterCar = new WaterCar(flyCar);
		waterCar.move();
		
		
	}
}
