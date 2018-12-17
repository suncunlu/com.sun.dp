package com.sun.dpMain.creationalPattern.factoryMethod;

import java.util.Objects;

/**
 * 工厂方法模型
 * @author jh
 *
 */
public class FactoryMethod {
	private FactoryMethod() {}
	
	public static Food get1() {
		return new FMA();
	}
	public static Food get2() {
		return new FMA2();
	}
	public static Food get3() {
		return new FMA3();
	}
}

class Client{
	public void get(String name) {
		// TODO Auto-generated method stub
		Food f = null;
		if(Objects.equals(name, "A")) {
			f = FactoryMethod.get1();
		}else if(Objects.equals(name, "B")) {
			f = FactoryMethod.get2();
		}else if(Objects.equals(name, "C")) {
			f = FactoryMethod.get3();
		}
		System.out.println(f.getClass().getName());
	}
}
