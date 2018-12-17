package com.sun.dpMain.structuralPattern.flyweightPattern3;

public class Model implements Show {
	private String name;
	private String style;

	public Model(String name) {
		this.name = name;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public void show() {
		System.out.println(name + "展示" + style);

	}
}