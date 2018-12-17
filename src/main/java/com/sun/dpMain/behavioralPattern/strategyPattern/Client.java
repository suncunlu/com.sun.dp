package com.sun.dpMain.behavioralPattern.strategyPattern;

/**
 * @author :suncunlu
 * @date :2018-12-11 15:20:21
 * @description :策略模式
 */
public class Client {
	public static void main(String[] args) {
		ConcreteStrategyA concreteStrategyA = new ConcreteStrategyA();
		Context context = new Context(concreteStrategyA);
		context.contextInterface();
	}
}
