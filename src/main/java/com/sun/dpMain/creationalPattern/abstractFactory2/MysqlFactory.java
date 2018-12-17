package com.sun.dpMain.creationalPattern.abstractFactory2;
/**
 * mysql工厂实现
 * @author jh
 *
 */
public class MysqlFactory implements IFactory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new MysqlUser();
	}

	@Override
	public ILogin createLogin() {
		// TODO Auto-generated method stub
		return new MysqlLogin();
	}

}
