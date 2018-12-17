package com.sun.dpMain.structuralPattern.compositePattern;

/**
 * @author :suncunlu
 * @date :2018-12-11 08:30:16
 * @description :组合模式
 */
public class Client {
	public static void main(String[] args) {
		Composite com1 = new Composite("树枝1");
		Leaf leaf1 = new Leaf("树叶1");
		Composite com11 = new Composite("树枝1.1");
		Leaf leaf11 = new Leaf("树叶1.1");
		com1.add(leaf1);
		com1.add(com11);
		com11.add(leaf11);
		com1.display(0);

	}
}
