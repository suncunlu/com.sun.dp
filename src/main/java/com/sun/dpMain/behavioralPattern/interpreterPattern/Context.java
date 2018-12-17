package com.sun.dpMain.behavioralPattern.interpreterPattern;

public class Context {
	private String input;
	private String output;
	public Context(String input) {
		// TODO Auto-generated constructor stub
		this.input = input;
	}
	/**
	 * @return the input
	 */
	public String getInput() {
		return input;
	}
	/**
	 * @param input the input to set
	 */
	public void setInput(String input) {
		this.input = input;
	}
	/**
	 * @return the output
	 */
	public String getOutput() {
		return output;
	}
	/**
	 * @param output the output to set
	 */
	public void setOutput(String output) {
		this.output = output;
	}
	
}
