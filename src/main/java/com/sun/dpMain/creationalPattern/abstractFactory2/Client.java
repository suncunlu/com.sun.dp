package com.sun.dpMain.creationalPattern.abstractFactory2;

/**
 * 抽象工厂模式 客户端使用示例
 * @author jh
 *
 */
public class Client {
	public void getUser() {
		User user = new User();
		Login login = new Login();
		
		//IFactory oracleFactory = new OracleFactory();
		//切换数据库只需要切换factory实现类即可
		IFactory factory = new MysqlFactory();
		
		IUser createUser = factory.createUser();
		
		createUser.getUser(1);
		
		createUser.insert(user);
		
		ILogin createLogin = factory.createLogin();
		createLogin.insertLogin(login);
		createLogin.getLogin(1);
		
		
	}
}
