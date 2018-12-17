package com.sun.dpMain.structuralPattern.facadePattern;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Memery implements IFacade {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void start() {
		// TODO Auto-generated method stub
		logger.info("Memery start begin...............");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("Memery start end...............");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		logger.info("Memery shutdown begin...............");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("Memery shutdown end...............");
	}

}
