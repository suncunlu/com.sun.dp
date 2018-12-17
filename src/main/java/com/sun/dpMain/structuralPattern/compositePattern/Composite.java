package com.sun.dpMain.structuralPattern.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private String name;
	private List<Component> compontentList;

	public Composite(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.compontentList = new ArrayList<>();
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		StringBuffer strBuf = new StringBuffer("");
		for (int i = 0; i < depth; i++) {
			strBuf.append("--");
		}
		System.out.println(new String(strBuf) + this.getName());
		for (Component c : compontentList) { // 递归显示
			c.display(depth + 2);
		}
	}


	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		compontentList.add(component);
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		compontentList.remove(component);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
