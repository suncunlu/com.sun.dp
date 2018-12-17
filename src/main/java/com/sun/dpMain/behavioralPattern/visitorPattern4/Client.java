package com.sun.dpMain.behavioralPattern.visitorPattern4;

public class Client {
	public static void main(String[] args) {
		ObjectStructure os = new ObjectStructure();
		
		os.add(new NodeA());
		
		os.add(new NodeB());
		
		Visitor visitorA = new VisitorA();
		os.action(visitorA);
	}
}
