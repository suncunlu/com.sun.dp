package com.sun.dpMain.behavioralPattern.commandPattern;

public class OpenCommand implements Command {
	private Application app;
	public OpenCommand(Application app) {
		// TODO Auto-generated constructor stub
		this.app = app;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		app.on();
	}

}
