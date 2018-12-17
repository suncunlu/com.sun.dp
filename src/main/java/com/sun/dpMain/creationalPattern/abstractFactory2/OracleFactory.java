package com.sun.dpMain.creationalPattern.abstractFactory2;
/**
 * oracle工厂实现
 * @author jh
 *
 */
public class OracleFactory implements IFactory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new OracleUser();
	}

	@Override
	public ILogin createLogin() {
		// TODO Auto-generated method stub
		return new OracleLogin();
	}

}
