package com.sun.dpMain.structuralPattern.compositePattern;

public abstract class Component {
	public abstract void display(int depth); 
	// 添加构件 
	public abstract void add(Component component); 
	//删除构件 
	public abstract void remove(Component component);
}
