package com.sun.dpMain.creationalPattern.abstractFactory2;
/**
 * 用户表
 * @author jh
 *
 */
public interface IUser {
	public void insert(User user);
	public IUser getUser(int id);
}
