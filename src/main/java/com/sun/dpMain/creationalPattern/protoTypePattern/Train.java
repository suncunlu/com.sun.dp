package com.sun.dpMain.creationalPattern.protoTypePattern;

import java.util.List;

public class Train implements Cloneable{
	private String name;
	private String code;
	private Integer length;
	private int heigh;
	private List<String> data;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public int getHeigh() {
		return heigh;
	}
	public void setHeigh(int heigh) {
		this.heigh = heigh;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Train [name=" + name + ", code=" + code + ", length=" + length + ", heigh=" + heigh + ", data=" + data
				+ "]";
	}
	
}
