package com.sun.dpMain.behavioralPattern.observerPattern;
/**
 * 被观察者
 * @author :suncunlu
 * @date :2018-12-12 17:37:54
 * @description :被观察者
 */
public interface Observerable {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
