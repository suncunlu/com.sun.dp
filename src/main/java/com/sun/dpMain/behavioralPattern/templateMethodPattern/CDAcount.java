package com.sun.dpMain.behavioralPattern.templateMethodPattern;

public class CDAcount extends Account {

	@Override
	protected String docalculateAccountType() {
		// TODO Auto-generated method stub
		return "Certificate of Deposite";
	}

	@Override
	protected double doCalculteInterestRate() {
		// TODO Auto-generated method stub
		return 0.06;
	}

}
