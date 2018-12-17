package com.sun.dpMain.behavioralPattern.templateMethodPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author :suncunlu
 * @date :2018-12-12 17:29:13
 * @description :模板方法模式
 */
public class Client {
private static Logger logger = LoggerFactory.getLogger(Client.class);
public static void main(String[] args) {
	Account account = new MoneyMarketAccount();
	logger.info("货币市场账号的利息数额为：" +account.calculateInerest());
    account = new CDAcount();
    logger.info("定期账号的利息数额为：" + account.calculateInerest());
  
}
}
