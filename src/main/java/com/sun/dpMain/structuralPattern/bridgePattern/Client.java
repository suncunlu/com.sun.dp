package com.sun.dpMain.structuralPattern.bridgePattern;
/**
 * 桥接模式
 * @author :suncunlu
 * @date :2018-12-10 16:58:11
 * @description :
 */
public class Client {
	public static void main(String[] args) {
		Color white = new White();
		Shape square = new Square();
		square.setColor(white);
		square.draw();//白色的正方形
		
		
        Shape rectange = new Rectangle();
        rectange.setColor(white);
        rectange.draw();//长方形
        
        
		
	}
}
