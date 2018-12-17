package com.sun.dpMain.behavioralPattern.visitorPattern4;

public class NodeB extends Node{

	@Override
	void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	public String operationB() {
		// TODO Auto-generated method stub
		return "NodeB";
	}
}
