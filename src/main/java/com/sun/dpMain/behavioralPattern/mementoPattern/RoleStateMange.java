package com.sun.dpMain.behavioralPattern.mementoPattern;

/**
 * @author :suncunlu
 * @date :2018-12-14 13:22:01
 * @description :游戏角色管理类
 */
public class RoleStateMange {
	private RoleStateMemento memento;
	
	public RoleStateMemento getMemento() {
		return memento;
	}
	public void setMemento(RoleStateMemento meMange) {
		this.memento = meMange;
		
	}
}
