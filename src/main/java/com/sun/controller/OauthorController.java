package com.sun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.oauthor.dto.ResultTo;
import com.sun.oauthor.service.GuessingLineOauthorService;
import com.sun.oauthor.service.KlineOauthorService;
import com.sun.oauthor.service.MoguOauthorService;
/**
 * @author :suncunlu
 * @date :2018-12-21 14:57:27
 * @description :全部授权业务统一入口
 */
@Controller
@RequestMapping("/Oauthor")
public class OauthorController {
	@Autowired MoguOauthorService moguOauthorService;
	@Autowired KlineOauthorService klineOauthorService;
	@Autowired GuessingLineOauthorService guessingLineOauthorService;
	/**
	 * @param code
	 * @param state
	 * @param appid
	 * @return
	 * @description:授权业务1
	 */
	@RequestMapping("/moguOauthor")
	public String mogu(@RequestParam String code,@RequestParam String state,String appid) {
		ResultTo<?> resultTo = moguOauthorService.oauthor(appid,code,state);
		
		return null;
		
	}
	
	/**
	 * @param code
	 * @param state
	 * @param appid
	 * @return
	 * @description:授权业务2
	 */
	@RequestMapping("/kline")
	public String kline(@RequestParam String code,@RequestParam String state,String appid) {
		ResultTo<String> resultTo = klineOauthorService.oauthor(appid,code,state);
		
		return null;
		
	}
	
	
	/**
	 * @param code
	 * @param state
	 * @param appid
	 * @return
	 * @description:授权业务3
	 */
	@RequestMapping("/guessingLine")
	public String czd(@RequestParam String code,@RequestParam String state,String appid) {
		ResultTo<?> resultTo = guessingLineOauthorService.oauthor(appid,code,state);
		return null;
		
	}
}
