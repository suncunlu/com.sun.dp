package com.sun.dpMain.behavioralPattern.interpreterPattern;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * @author :suncunlu
 * @date :2018-12-17 15:54:31
 * @description :解释器模式
 */
public class Client {
public static void main(String[] args) {
	Context context = new Context("20");
	List<Expression> list = Lists.newArrayList();
	
	list.add(new PlusExression());
	list.add(new PlusExression());
	
	list.add(new MinusExpression());
	list.add(new MinusExpression());
	
	list.add(new PlusExression());
	list.add(new PlusExression());
	
	for (Expression ex : list) {
		ex.interpret(context);
		System.out.println(context.getOutput());
	}
}
}
