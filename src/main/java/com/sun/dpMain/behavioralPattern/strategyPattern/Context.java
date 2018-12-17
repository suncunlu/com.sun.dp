package com.sun.dpMain.behavioralPattern.strategyPattern;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy=strategy;
	}
	
	public void contextInterface() {
		strategy.algorithmInterface();
	}
	
	
}
