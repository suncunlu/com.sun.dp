package com.sun.dpMain.behavioralPattern.mementoPattern;

/**
 * @author :suncunlu
 * @date :2018-12-14 13:32:38
 * @description :备忘录模式
 */
public class Client {
	public static void main(String[] args) {
		GameRole gameRole = new GameRole();
		gameRole.init();
		gameRole.show();
		
		RoleStateMange roleStateMange = new RoleStateMange();
		roleStateMange.setMemento(gameRole.saveMemento());
		
		gameRole.fightBoss();
		
		gameRole.show();
		
		gameRole.recover(roleStateMange.getMemento());
		
		gameRole.show();
		
	}
}
