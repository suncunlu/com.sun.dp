package com.sun.dpMain.structuralPattern.compositePattern;

public class Leaf extends Component {
	private String name;

	public Leaf(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < depth; i++) {
			sb.append("--");
		}
		System.out.println(new String(sb) + this.getName());
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		System.out.println("叶子节点不能添加构件...");
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		System.out.println("叶子节点不能删除");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
