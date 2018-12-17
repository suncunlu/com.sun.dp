package com.sun.dpMain.creationalPattern.abstractFactory1;

public class Factory4A implements Produce{

	@Override
	public Food get() {
		// TODO Auto-generated method stub
		return new A();
	}

}
