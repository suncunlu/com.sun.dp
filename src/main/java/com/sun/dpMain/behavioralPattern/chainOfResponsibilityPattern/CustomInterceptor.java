package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author :suncunlu
 * @date :2018-12-14 09:40:23
 * @description :自定义 "责任人"
 */
public class CustomInterceptor implements Ratify {
	private  Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public Result deal(Chain chain) {
		// TODO Auto-generated method stub
		LeaveRequest request = chain.request();
		logger.info("CustomInt"
				+ "erceptor "+ request.toString());
		String reason = request.getReason();
		if(reason !=null && reason.equals("事假")) {
			LeaveRequest leaveRequest = new Builder().newLeaveRequest(request).setCustomInfo(request.getName()+"请的是事假，而且很着急，请领导重视一下").build();
			
			logger.info("CustomInterceptor 转发请求");
			return chain.proceed(leaveRequest);
		}
		return new Result(true, "同意请假");
	}

}
