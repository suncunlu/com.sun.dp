package com.sun.dpMain.behavioralPattern.visitorPattern3;

public class SubWest1  extends West{

	@Override
	void goWest1(SubEast1 east) {
		// TODO Auto-generated method stub
		System.out.println("SubWest1 + " + east.myName1());
	}

	@Override
	void goWest2(SubEast2 east) {
		// TODO Auto-generated method stub
		 System.out.println("SubWest1 + " + east.myName2());
	}

}
