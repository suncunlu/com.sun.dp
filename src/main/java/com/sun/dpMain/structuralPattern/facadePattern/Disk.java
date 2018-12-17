package com.sun.dpMain.structuralPattern.facadePattern;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Disk implements IFacade {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void start() {
		// TODO Auto-generated method stub
		logger.info("Disk start begin...............");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("Disk start end...............");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		logger.info("Disk shutdown begin...............");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("Disk shutdown end...............");
	}

}
