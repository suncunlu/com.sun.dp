package com.sun.dpMain.behavioralPattern.iteratorPattern;

public class ConcreteIterator implements Iterator {
	private ConcreteAggregate agg;
	private int index = 0;
	private int size = 0;
	public ConcreteIterator(ConcreteAggregate agg) {
		// TODO Auto-generated constructor stub
		this.agg = agg;
		this.size = agg.size();
	}
	@Override
	public void first() {
		// TODO Auto-generated method stub
		index = 0;
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		if(index < size) {
			index ++;
		}
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return (index >= size);
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return agg.getElement(index);
	}

}
