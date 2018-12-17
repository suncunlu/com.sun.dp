package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;

/**
 * @author :suncunlu
 * @date :2018-12-13 11:03:27
 * @description :请假的请求类
 */
public class LeaveRequest {
	private String name;
	private String reason;
	private int days;
	private String  groupLeaderInfo;
	private String managerInfo;
	private String departmentHeaderInfo;
	private String customInfo;
	
	public LeaveRequest(Builder builder) {
		// TODO Auto-generated constructor stub
		this.name = builder.name ;
		this.reason = builder.reason;
		this.days = builder.days;
		this.groupLeaderInfo = builder.groupLeaderInfo;
		this.managerInfo = builder.managerInfo;
		this.departmentHeaderInfo = builder.departmentHeaderInfo;
		this.customInfo = builder.customInfo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @return the days
	 */
	public int getDays() {
		return days;
	}

	/**
	 * @return the groupLeaderInfo
	 */
	public String getGroupLeaderInfo() {
		return groupLeaderInfo;
	}

	/**
	 * @return the managerInfo
	 */
	public String getManagerInfo() {
		return managerInfo;
	}

	/**
	 * @return the departmentHeaderInfo
	 */
	public String getDepartmentHeaderInfo() {
		return departmentHeaderInfo;
	}

	/**
	 * @return the customInfo
	 */
	public String getCustomInfo() {
		return customInfo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LeaveRequest [name=" + name + ", reason=" + reason + ", days=" + days + ", groupLeaderInfo="
				+ groupLeaderInfo + ", managerInfo=" + managerInfo + ", departmentHeaderInfo=" + departmentHeaderInfo
				+ ", customInfo=" + customInfo + "]";
	}
	
	
}
