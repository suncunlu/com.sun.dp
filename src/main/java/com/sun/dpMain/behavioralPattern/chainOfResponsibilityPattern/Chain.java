package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;

/**
 * @author :suncunlu
 * @date :2018-12-13 13:54:18
 * @description :对request和result进行封装，用来转发
 */
public interface Chain {
	
	/**
	 * @return
	 * @description:获取当前请求
	 */
	LeaveRequest request();
	
	/**
	 * @param request
	 * @return
	 * @description:转发请求
	 */
	Result proceed(LeaveRequest request);
	
}
