package com.sun.dpMain.structuralPattern.flyweightPattern1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	private static Logger logger = LoggerFactory.getLogger(Client.class);
	public static void main(String[] args) {
		IgoChessman black1,black2,black3,white1,white2;
		IgoChessmanFactory factory;
		
		factory = IgoChessmanFactory.getInstance();
		
		//通过享元工厂获取三颗黑子
		black1 = factory.getIgoChessman("b");
		black2 = factory.getIgoChessman("b");
		black3 = factory.getIgoChessman("b");
		
		logger.info("两颗黑子是否相同 "+(black2==black3));
		
		white1 = factory.getIgoChessman("w");
		white2 = factory.getIgoChessman("w");
		
		logger.info("两颗白子是否相同 "+(black2==black3));
		
		black1.display();
		black2.display();
		black3.display();
		
		white1.display();
		white2.display();
	}
}
