package com.sun.dpMain.behavioralPattern.iteratorPattern;

/**
 * @author :suncunlu
 * @date :2018-12-13 10:13:45
 * @description :抽象迭代子角色
 */
public interface Iterator {
	/**
	 * @description:移动到第一个位置
	 */
	public void first();

	/**
	 * @description:移动到下一个元素
	 */
	public void next();

	/**
	 * 
	 * 
	 * @description:是否是最后一个元素
	 */
	public boolean isDone();

	/**
	 * 
	 * 
	 * @description:返还当前元素
	 */
	public Object currentItem();
}
