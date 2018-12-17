package com.sun.dpMain.structuralPattern.facadePattern;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cpu implements IFacade {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void start() {
		logger.info("Cpu start begin...............");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("Cpu start end...............");
	}

	@Override
	public void shutdown() {
		logger.info("Cpu shutdown begin...............");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("Cpu shutdown end...............");

	}

}
