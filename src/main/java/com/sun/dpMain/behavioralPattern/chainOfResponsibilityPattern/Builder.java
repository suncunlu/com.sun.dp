package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;


import com.google.common.base.Strings;

public class Builder {
	public String name;
	public String reason;
	public int days;
	public String groupLeaderInfo;
	public String managerInfo;
	public String departmentHeaderInfo;
	public String customInfo;
	public Builder() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name the name to set
	 */
	public Builder setName(String name) {
		this.name = name;
		return this;
	}
	/**
	 * @param reason the reason to set
	 */
	public Builder setReason(String reason) {
		this.reason = reason;
		return this;
	}
	/**
	 * @param days the days to set
	 */
	public Builder setDays(int days) {
		this.days = days;
		return this;
	}
	/**
	 * @param groupLeaderInfo the groupLeaderInfo to set
	 */
	public Builder setGroupLeaderInfo(String groupLeaderInfo) {
		this.groupLeaderInfo = groupLeaderInfo;
		return this;
	}
	/**
	 * @param managerInfo the managerInfo to set
	 */
	public Builder setManagerInfo(String managerInfo) {
		this.managerInfo = managerInfo;
		return this;
	}
	/**
	 * @param departmentHeaderInfo the departmentHeaderInfo to set
	 */
	public Builder setDepartmentHeaderInfo(String departmentHeaderInfo) {
		this.departmentHeaderInfo = departmentHeaderInfo;
		return this;
	}
	/**
	 * @param customInfo the customInfo to set
	 */
	public Builder setCustomInfo(String customInfo) {
		this.customInfo = customInfo;
		return this;
	}
	
	public Builder newLeaveRequest(LeaveRequest request) {
		this.name = request.getName();
		this.days = request.getDays();
		this.reason = request.getReason();
		
		if(!Strings.isNullOrEmpty(request.getGroupLeaderInfo())) {
			this.groupLeaderInfo = request.getGroupLeaderInfo();
		}
		
		if(!Strings.isNullOrEmpty(request.getManagerInfo())) {
			this.managerInfo = request.getManagerInfo();
		}
		
		if(!Strings.isNullOrEmpty(request.getDepartmentHeaderInfo())) {
			this.departmentHeaderInfo = request.getDepartmentHeaderInfo();
		}
		
		if(!Strings.isNullOrEmpty(request.getCustomInfo())) {
			this.customInfo = request.getCustomInfo();
		}
		return this;
	}
	
	public LeaveRequest build() {
		return new LeaveRequest(this);
		// TODO Auto-generated method stub

	}
}
