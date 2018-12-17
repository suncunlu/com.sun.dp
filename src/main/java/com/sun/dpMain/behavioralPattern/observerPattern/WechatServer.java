package com.sun.dpMain.behavioralPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 * @author :suncunlu
 * @date :2018-12-12 17:49:26
 * @description :微信服务号 被观察者
 */
public class WechatServer implements Observerable {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private List<Observer> list;
	private String message;
	public WechatServer() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if(!list.isEmpty()) list.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			Observer observer = list.get(i);
			observer.update(message);
		}
	}
	
	public void setInfomation(String message) {
		this.message = message;
		logger.info("微信服务更新消息："+message);
		notifyObserver();
	}

}
