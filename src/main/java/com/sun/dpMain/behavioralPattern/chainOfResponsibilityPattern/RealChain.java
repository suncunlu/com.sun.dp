package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;

import java.util.List;

/**
 * @author :suncunlu
 * @date :2018-12-13 14:08:41
 * @description :实现Chain的真正的包装Request和转发功能
 */
public class RealChain implements Chain {
	public LeaveRequest request;
	public List<Ratify> ratifyList;
	public int index;
	
	public RealChain(List<Ratify> ratifyList,LeaveRequest request,int index) {
		// TODO Auto-generated constructor stub
		this.ratifyList = ratifyList;
		this.request = request;
		this.index = index;
	}
	@Override
	public LeaveRequest request() {
		// TODO Auto-generated method stub
		return request;
	}
	
	@Override
	public Result proceed(LeaveRequest request) {
		// TODO Auto-generated method stub
		Result proceed = null;
		if(ratifyList.size() > index) {
			RealChain realChain = new RealChain(ratifyList, request, index+1);
			Ratify ratify = ratifyList.get(index);
			proceed = ratify.deal(realChain);
		}
		return proceed;
	}

}
