package com.sun.dpMain.structuralPattern.bridgePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class White implements Color {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void bepaint(String shape) {
		// TODO Auto-generated method stub
		logger.info("白色的"+shape);
	}

}
