package com.sun.hg.dbf.handler;

public interface Handler<T> {
	void initialize(int index);
	void process(T t);
}
