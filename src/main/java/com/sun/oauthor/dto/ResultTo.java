package com.sun.oauthor.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ResultTo<T> {
	private int errcode;
	private String errmsg;
	
	//为空时，自动清除。
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private T data;
	public int getErrcode() {
		return errcode;
	}
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResultVO [errcode=" + errcode + ", errmsg=" + errmsg + ", data=" + data + "]";
	}
	
}
