package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Manager implements Ratify{
	private  Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public Result deal(Chain chain) {
		// TODO Auto-generated method stub
		LeaveRequest request = chain.request();
		logger.info("Manager request:"+request.toString());
		if(request.getDays() > 3) {
			LeaveRequest newRequest = new Builder().newLeaveRequest(request).setManagerInfo(request.getName()+"每月的KPI考核还不错，可以批准").build();
			return chain.proceed(newRequest);
		}
		
		return new Result(true, "Manager:早点把事情办完，项目离不开你");
		
	}

}
