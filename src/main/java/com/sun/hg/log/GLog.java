package com.sun.hg.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GLog {
	private static final Logger LOGGER=LoggerFactory.getLogger("A.M");
	
	public static void info(String msg,Throwable t) {
		LOGGER.info(msg, t);
	}
}
