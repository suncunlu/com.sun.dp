package com.sun.dpMain.behavioralPattern.mementoPattern;

/**
 * @author :suncunlu
 * @date :2018-12-14 13:24:47
 * @description :游戏角色
 */
public class GameRole {
	private int vit;
	private int atk;
	 public void init() {
		// TODO Auto-generated method stub
		 vit = 100;
		 atk = 100;
	}
	 
	 public void show() {
		// TODO Auto-generated method stub
		 System.out.println("体力："+vit);
		 System.out.println("攻击力："+atk);
	}
	 public void fightBoss() {
		// TODO Auto-generated method stub
		 this.vit=0;
		 this.atk=0;
	}
	 public RoleStateMemento saveMemento() {
		// TODO Auto-generated method stub
		 return new RoleStateMemento(vit, atk);
	}
	 public void recover(RoleStateMemento roleStateMemento) {
		// TODO Auto-generated method stub
		 this.vit = roleStateMemento.getVit();
		 this.atk = roleStateMemento.getAtk();
	} 
	
}
