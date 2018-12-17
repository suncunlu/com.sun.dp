package com.sun.dpMain.structuralPattern.flyweightPattern2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class IgoChessman {
	private Logger logger = LoggerFactory.getLogger(getClass());
	public abstract String getColor();
	public void display(Coordinates coord) {
		// TODO Auto-generated method stub
		logger.info("棋子颜色是："+this.getColor()+"，棋子位置："+coord.getX()+"，"+coord.getY());
	}
}
