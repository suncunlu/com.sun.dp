package com.sun.dpMain.behavioralPattern.iteratorPattern;


/**
 * @author :suncunlu
 * @date :2018-12-13 10:15:28
 * @description :具体聚集角色类
 */
public class ConcreteAggregate extends Aggregate {
	private Object[] objArray = null;
	public ConcreteAggregate(Object[] objArray) {
		// TODO Auto-generated constructor stub
		this.objArray = objArray;
	}
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	public int size() {
		return objArray.length;
	}
	public Object getElement(int index) {
		// TODO Auto-generated method stub
		if(index < objArray.length) {
			return objArray[index];
		}else {
			return null;
		}
	}
}
