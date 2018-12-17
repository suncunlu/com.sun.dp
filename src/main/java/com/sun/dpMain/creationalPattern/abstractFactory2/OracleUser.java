package com.sun.dpMain.creationalPattern.abstractFactory2;
/**
 * oracle用户表实现
 * @author jh
 *
 */
public class OracleUser implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("访问oracle 插入一条数据");
	}
	@Override
	public IUser getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("访问oracle 获取一条数据");
		return null;
	}

}
