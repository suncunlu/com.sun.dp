package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DepartmentHeader implements Ratify {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public Result deal(Chain chain) {
		// TODO Auto-generated method stub
		LeaveRequest request = chain.request();
		logger.info("DepartmentHeader request:" + request.toString());
		if (request.getDays() > 7) {
			return new Result(false, "你这个完全没必要");
		}

		return new Result(true, "DepartmentHeader:不要着急，把事情处理完再回来！");

	}

}
