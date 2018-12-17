package com.sun.dpMain.behavioralPattern.visitorPattern3;

public class SubEast2 extends East{

	@Override
	void goEast(West west) {
		// TODO Auto-generated method stub
		west.goWest2(this);
	}
	public String myName2() {
		// TODO Auto-generated method stub
		return SubEast2.class.getName();
	}
}
