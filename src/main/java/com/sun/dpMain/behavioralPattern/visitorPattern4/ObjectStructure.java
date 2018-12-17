package com.sun.dpMain.behavioralPattern.visitorPattern4;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Node> nodes = new ArrayList<Node>();
	public void action(Visitor visitor) {
		// TODO Auto-generated method stub
		for (Node node : nodes) {
			node.accept(visitor);
		}
	}
	
	public void add(Node node) {
		// TODO Auto-generated method stub
		nodes.add(node);
	}
}
