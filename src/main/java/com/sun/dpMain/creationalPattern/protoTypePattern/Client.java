package com.sun.dpMain.creationalPattern.protoTypePattern;

import java.util.List;

import com.google.common.collect.Lists;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		String a = "A1";
		String b = "B1";
		String c = "C1";
		String name = "hexiehao";
		List<String> list = Lists.newArrayList(a,b,c);
		
		Train train = new Train();
		train.setName(name);
		train.setLength(23);
		train.setHeigh(35);
		train.setData(list);
		
		name = name.substring(2,3);
		
		//克隆
		Train train2 = (Train) train.clone();
		train2.getData().remove(2);
		System.out.println(train.toString());
		System.out.println(train2.toString());
		
	}
}
