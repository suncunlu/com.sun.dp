package com.sun.oauthor.service;

import org.springframework.stereotype.Service;

import com.sun.oauthor.dto.OauthorUserInformationTo;
import com.sun.oauthor.dto.ResultTo;
import com.sun.util.ResultUtil;

@Service
public class MoguOauthorService extends AbstractOauthorService{

	@Override
	public ResultTo<String> oauthor(String appid,String code,String state) {
		// TODO Auto-generated method stub
		OauthorUserInformationTo oauthorUserInformationTo = super.getOauthorInfo(appid, code);
		/**
		 * 如果授权失败。调用reOauthor重新授权一次
		 */
		if(oauthorUserInformationTo==null) {
			return reOauthor();
		}
		//处理具体授权业务，授权链接等等
		/**
		 * 
		 * 
		 * 
		 */
		String data="";
		
		
		
		
		return ResultUtil.success(data);
	}

	@Override 
	ResultTo<String> reOauthor() {
		// TODO Auto-generated method stub
		return null;
		
	}

}
