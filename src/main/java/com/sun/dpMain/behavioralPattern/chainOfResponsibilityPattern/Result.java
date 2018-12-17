package com.sun.dpMain.behavioralPattern.chainOfResponsibilityPattern;

/**
 * @author :suncunlu
 * @date :2018-12-13 13:51:20
 * @description :请假结果类
 */
public class Result {
	private boolean isRatify;
	private String info;
	
	public Result() {
		// TODO Auto-generated constructor stub
	}
	
	public Result(boolean isRatfy,String info) {
		// TODO Auto-generated constructor stub
		this.isRatify = isRatfy;
		this.info = info;
	}

	/**
	 * @return the isRatify
	 */
	public boolean isRatify() {
		return isRatify;
	}

	/**
	 * @param isRatify the isRatify to set
	 */
	public void setRatify(boolean isRatify) {
		this.isRatify = isRatify;
	}

	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Result [isRatify=" + isRatify + ", info=" + info + "]";
	}
	
}
