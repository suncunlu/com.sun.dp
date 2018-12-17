package com.sun.dpMain.behavioralPattern.mementoPattern;

/**
 * @author :suncunlu
 * @date :2018-12-14 13:23:02
 * @description :存储类
 */
public class RoleStateMemento {
	private int vit;
	private int atk;
	public RoleStateMemento(int vit,int atk) {
		// TODO Auto-generated constructor stub
		this.vit = vit;
		this.atk = atk;
	}
	/**
	 * @return the vit
	 */
	public int getVit() {
		return vit;
	}
	/**
	 * @param vit the vit to set
	 */
	public void setVit(int vit) {
		this.vit = vit;
	}
	/**
	 * @return the atk
	 */
	public int getAtk() {
		return atk;
	}
	/**
	 * @param atk the atk to set
	 */
	public void setAtk(int atk) {
		this.atk = atk;
	}
}
