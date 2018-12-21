package com.sun.oauthor.service;

import com.sun.oauthor.dto.OauthorUserInformationTo;
import com.sun.oauthor.dto.ResultTo;

public abstract class AbstractOauthorService {
	
	/**
	 * @param appid
	 * @param code
	 * @description:获取用户信息，提供给所有子类使用
	 */
	protected OauthorUserInformationTo getOauthorInfo(String appid,String code) {
		
		return null;
		
	}
	/**
	 * @return
	 * @description:留给子类实现，具体授权业务
	 */
	public abstract ResultTo<?> oauthor(String appid,String code,String state);
	
	
	/**
	 * @return
	 * @description:授权失败后，重新授权
	 */
	abstract ResultTo<?> reOauthor();
	
	/**
	 * 
	 * @description:留给子类实现，可选择的方法
	 */
	protected void todo() {
		
	}
}
