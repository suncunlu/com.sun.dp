package com.sun.dpMain.behavioralPattern.visitorPattern3;

public class SubWest2 extends West{

	@Override
	void goWest1(SubEast1 east) {
		// TODO Auto-generated method stub
		System.out.println("SubWest2 + " + east.myName1());
	}

	@Override
	void goWest2(SubEast2 east) {
		// TODO Auto-generated method stub
		System.out.println("SubWest2 + " + east.myName2());
	}

}
