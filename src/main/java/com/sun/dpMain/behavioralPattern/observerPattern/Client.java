package com.sun.dpMain.behavioralPattern.observerPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author :suncunlu
 * @date :2018-12-13 09:46:29
 * @description :观察者模式
 * 				微信服务号是被观察者，用户是观察者。微信服务号更新一条信息后，会群发给所有关注（注册当前微信服务号）的用户
 */
public class Client {
	private static Logger logger = LoggerFactory.getLogger(Client.class);	
public static void main(String[] args) {
	
	WechatServer wechatServer = new WechatServer();
	User userZhang= new User("张三");
	User userLi= new User("李四");
	User userW= new User("王五");
	
	wechatServer.registerObserver(userZhang);
	wechatServer.registerObserver(userLi);
	wechatServer.registerObserver(userW);
	wechatServer.setInfomation("尊敬的客户您好，祝福您快快乐乐每一天");
	
	logger.info("----------------------张三取消订阅后----------");
	
	wechatServer.removeObserver(userZhang);
	wechatServer.setInfomation("尊敬的客户您好，祝您元旦快乐。");
	
}
}
