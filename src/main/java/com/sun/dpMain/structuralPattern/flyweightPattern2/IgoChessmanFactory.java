package com.sun.dpMain.structuralPattern.flyweightPattern2;

import java.util.Hashtable;

public class IgoChessmanFactory {
	private static IgoChessmanFactory instance = new IgoChessmanFactory();
	private static Hashtable<String, IgoChessman> ht;
	
	private IgoChessmanFactory() {
		// TODO Auto-generated constructor stub
		ht = new Hashtable<>();
		IgoChessman black,white;
		black = new BlackIgoChessman();
		white = new WhiteIgoChessman();
		ht.put("b", black);
		ht.put("w", white);
	}
	public static IgoChessmanFactory getInstance() {
		return instance;
	}
	public IgoChessman getIgoChessman(String color) {
		return ht.get(color);
	}
}
