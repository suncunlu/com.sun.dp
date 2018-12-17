package com.sun.dpMain.creationalPattern.abstractFactory2;
/**
 * mysql用户表实现
 * @author jh
 *
 */
public class MysqlUser implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("访问mysql 插入一条数据");
	}
	@Override
	public IUser getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("访问mysql 获取一条数据");
		return null;
	}

}
