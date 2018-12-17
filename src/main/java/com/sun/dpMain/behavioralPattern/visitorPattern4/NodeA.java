package com.sun.dpMain.behavioralPattern.visitorPattern4;

public class NodeA extends Node{

	@Override
	void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	public String operationA() {
		// TODO Auto-generated method stub
		return "NodeA";
	}
}
