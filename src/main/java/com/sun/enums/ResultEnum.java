package com.sun.enums;
/**
 * 返回状态码枚举
 * @author jh
 *
 */
public enum ResultEnum {
	SUCCESS(0,"ok"),
	ACCESS_FAIL(40000,"访问权限不足"),
	ACCESS_EXPIER(40001,"登录超时"),
	PARAM_ERROR(60001,"参数错误"),
	SERVER_EXCEPTION(7000,"服务异常"),
	SERVER_ERROR(70001,"服务不可用");
	public Integer code;
	public String msg;
	ResultEnum(Integer code,String msg) {
		this.code = code;
		this.msg=msg;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
