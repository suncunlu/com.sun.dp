package com.sun.dpMain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DpApplication {
	private static Logger logger = LoggerFactory.getLogger(DpApplication.class);
	public static void main(String[] args) {
		logger.info("run........................");
		SpringApplication.run(DpApplication.class, args);
		
	}
}
