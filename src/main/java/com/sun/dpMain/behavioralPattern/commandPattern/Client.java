package com.sun.dpMain.behavioralPattern.commandPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	private static Logger logger = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {
		Siri siri = new Siri();
		logger.info("嘿！siri，打开微信");
		Application wechat = new Wechat();
		Command command = new OpenCommand(wechat);
		siri.setCommand(command);
		siri.doCommand();
		
		logger.info("嘿！siri，打开高德地图");
		Application map = new GaoDeMap();
		Command command2 = new OpenCommand(map);
		siri.setCommand(command2);
		siri.doCommand();
		
		
	}
}
