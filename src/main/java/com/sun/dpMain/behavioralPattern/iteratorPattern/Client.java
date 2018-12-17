package com.sun.dpMain.behavioralPattern.iteratorPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author :suncunlu
 * @date :2018-12-13 10:38:17
 * @description :迭代子模式
 */
public class Client {
	private static Logger logger = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {
		Object[] objArray = { "one", "two", "three", "four", "five", "six", "seven" };
		Aggregate aggregate = new ConcreteAggregate(objArray);
		Iterator itt = aggregate.createIterator();
		while (!itt.isDone()) {
			logger.info(itt.currentItem().toString());
			itt.next();
		}
	}
}
