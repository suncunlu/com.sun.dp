package com.sun.dpMain.creationalPattern.abstractFactory2;
/**
 * 工厂接口
 * @author jh
 *
 */
public interface IFactory {
	public IUser createUser();
	public ILogin createLogin();
}
