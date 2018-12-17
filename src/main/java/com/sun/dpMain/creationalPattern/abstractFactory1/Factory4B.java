package com.sun.dpMain.creationalPattern.abstractFactory1;

public class Factory4B implements Produce {

	@Override
	public Food get() {
		// TODO Auto-generated method stub
		return new B();
	}

}
