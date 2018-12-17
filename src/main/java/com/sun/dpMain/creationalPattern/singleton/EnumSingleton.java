package com.sun.dpMain.creationalPattern.singleton;

public enum EnumSingleton {
	DATASOURCE;
	private Object dbConnection = null;
	private EnumSingleton() {
		dbConnection = new Object();
		System.out.println("init.................");
	}
	public Object getConnection() {
		System.out.println(dbConnection.hashCode());
		return dbConnection;
	}
	
	public static void main(String[] args) {
		
		Object connection = EnumSingleton.DATASOURCE.getConnection();
		Object connection1 = EnumSingleton.DATASOURCE.getConnection();
		Object connection2 = EnumSingleton.DATASOURCE.getConnection();
		Object connection3 = EnumSingleton.DATASOURCE.getConnection();
		
		
		
		
	}
}
