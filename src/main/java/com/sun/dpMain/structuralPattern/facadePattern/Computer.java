package com.sun.dpMain.structuralPattern.facadePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Computer implements IFacade {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private Cpu cpu;
	private Memery memory;
	private Disk disk;
	public Computer () {
		cpu = new Cpu();
		memory = new Memery();
		disk = new Disk();
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		logger.info("computer start begin...............");
		cpu.start();
		memory.start();
		disk.start();
		logger.info("computer start end...............");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		logger.info("computer shutdown begin...............");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		logger.info("computer shutdown end...............");
	}

}
