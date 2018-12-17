package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author :suncunlu
 * @date :2018-12-13 14:11:09
 * @description :组长
 */
public class GroupLeader implements Ratify {
	private  Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public Result deal(Chain chain) {
		// TODO Auto-generated method stub
		LeaveRequest request = chain.request();
		logger.info("GroupLeader request="+request.toString());
		
		if(request.getDays()>1) {
			LeaveRequest newRequest = new Builder().newLeaveRequest(request).setGroupLeaderInfo(request.getName()+"平时表现不错，而且现在项目也不忙").build();
			return chain.proceed(newRequest);
		}
		
		return new Result(true,"GroupLeader:早去早回");
	}

}
