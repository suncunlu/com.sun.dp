package com.sun.dpMain.behavioralPattern.visitorPattern3;

public class SubEast1 extends East{

	@Override
	void goEast(West west) {
		// TODO Auto-generated method stub
		west.goWest1(this);
	}
	public String myName1() {
		// TODO Auto-generated method stub
		return SubEast1.class.getName();
	}
}
