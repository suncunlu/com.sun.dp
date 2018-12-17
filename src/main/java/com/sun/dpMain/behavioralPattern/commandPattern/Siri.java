package com.sun.dpMain.behavioralPattern.commandPattern;

public class Siri {
	private Command command;
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void doCommand() {
		// TODO Auto-generated method stub
		command.execute();

	}
}
