package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :suncunlu
 * @date :2018-12-13 16:19:54
 * @description :
 */
public class ChainOfResponsibilityClient {
	private ArrayList<Ratify> ratifies;
	public ChainOfResponsibilityClient() {
		// TODO Auto-generated constructor stub
		ratifies = new ArrayList<Ratify>();
	}
	
	/**
	 * @param ratify
	 * @description:添加自定义责任人
	 */
	public void addRatifys(Ratify ratify) {
		// TODO Auto-generated method stub
		ratifies.add(ratify);
	}
	
	public Result execute(LeaveRequest request) {
		// TODO Auto-generated method stub
		List<Ratify> list = new ArrayList<Ratify>();
		list.addAll(ratifies);
		list.add(new GroupLeader());
		list.add(new Manager());
		list.add(new DepartmentHeader());
		RealChain realChain = new RealChain(list, request, 0);
		
		return realChain.proceed(request);
	}
	
}
