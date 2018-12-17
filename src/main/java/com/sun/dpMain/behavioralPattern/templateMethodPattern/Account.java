package com.sun.dpMain.behavioralPattern.templateMethodPattern;

public abstract class Account {
	
	/**
	 * 
	 * @return
	 * @description:模板方法
	 */
	public final double calculateInerest() {
		double interestTate = doCalculteInterestRate();
		String accountType = docalculateAccountType();
		double amount = calculateAmount(accountType);
		return amount*interestTate;
	}
	/**
	 * 
	 * @return
	 * @description:基本方法留给子类实现
	 */
	protected abstract String docalculateAccountType();
	/**
	 * 
	 * @return
	 * @description:基本方法留给子类实现
	 */
	protected abstract double doCalculteInterestRate();
	
	/**
	 * 
	 * @param accountType
	 * @return
	 * @description:基本方法已经实现
	 */
	private double calculateAmount(String accountType) {
		// TODO Auto-generated method stub
		/**
		 * 实现具体业务逻辑
		 */
		return 7777.00;
	}

}
