package com.sun.dpMain.behavioralPattern.interpreterPattern;

public class PlusExression extends Expression {

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.out.println("自动递增");
		String input = context.getInput();
		int intInput = Integer.parseInt(input);
		intInput++;
		context.setInput(intInput+"");
		context.setOutput(intInput+"");
	}

}
