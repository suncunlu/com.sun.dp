package com.sun.dpMain.behavioralPattern.mediatorPattern;

public abstract class Person {
	protected String name;
	protected Mediator mediator;
	
	public Person(String name,Mediator mediator) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.mediator  = mediator;
	}
	
}
