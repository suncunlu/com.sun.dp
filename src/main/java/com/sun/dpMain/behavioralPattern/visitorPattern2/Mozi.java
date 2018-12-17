package com.sun.dpMain.behavioralPattern.visitorPattern2;


public class Mozi {
	public void ride(Horse h) {
		// TODO Auto-generated method stub
		System.out.println("骑马");
	}

	public void ride(WhiteHorse  wh) {
		System.out.println("骑白马");
	}
	public void ride(BlackHorse  bh) {
		System.out.println("骑黑马");
	}
}
