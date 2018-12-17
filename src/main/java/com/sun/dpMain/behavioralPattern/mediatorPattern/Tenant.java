package com.sun.dpMain.behavioralPattern.mediatorPattern;

public class Tenant extends Person {

	public Tenant(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void constact(String message) {
		mediator.constact(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("租房者："+ name + "，获得信息："+message);
	};

}
