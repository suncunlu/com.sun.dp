package com.sun.dpMain.behavioralPattern.templateMethodPattern;

public class MoneyMarketAccount extends Account {

	@Override
	protected String docalculateAccountType() {
		// TODO Auto-generated method stub
		return "Money Market";
	}

	@Override
	protected double doCalculteInterestRate() {
		// TODO Auto-generated method stub
		return 0.057;
	}

}
