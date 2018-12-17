package com.sun.dpMain.behavioralPattern.interpreterPattern;

public class MinusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.out.println("自动减");
		String input = context.getInput();
		int intInput = Integer.parseInt(input);
		intInput--;
		context.setInput(intInput+"");
		context.setOutput(intInput+"");

	}

}
