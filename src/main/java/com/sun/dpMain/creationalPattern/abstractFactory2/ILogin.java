package com.sun.dpMain.creationalPattern.abstractFactory2;
/**
 * 登录表接口
 * @author jh
 *
 */
public interface ILogin {
	public void insertLogin(Login login);
	public Login getLogin(int id);
}
