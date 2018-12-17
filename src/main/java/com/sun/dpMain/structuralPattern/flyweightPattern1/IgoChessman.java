package com.sun.dpMain.structuralPattern.flyweightPattern1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class IgoChessman {
	private Logger logger = LoggerFactory.getLogger(getClass());
	public abstract String getColor();
	public void display() {
		// TODO Auto-generated method stub
		logger.info("棋子颜色是："+this.getColor());
	}
}
