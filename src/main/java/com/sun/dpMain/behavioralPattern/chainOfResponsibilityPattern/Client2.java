package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author :suncunlu
 * @date :2018-12-14 09:40:17
 * @description :实现动态扩展，自定义责任人CustomInterceptor
 */
public class Client2 {
	private static Logger logger = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {
		LeaveRequest request = new Builder().setName("张三").setDays(5).setReason("事假").build();

		ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();
		client.addRatifys(new CustomInterceptor());
		Result result = client.execute(request);
		logger.info("结果:" + result.toString());
	}
}
