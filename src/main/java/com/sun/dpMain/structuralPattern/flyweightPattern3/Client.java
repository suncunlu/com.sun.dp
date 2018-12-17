package com.sun.dpMain.structuralPattern.flyweightPattern3;

/**
 * 验证
 * 优点：对象复用，降低内存消耗。
 *  缺点：无法做到线程 安全，如果一个线程正在复用，修改其外部状态，而另外一个线程正在进行使用，就会造成问题。 
 **/
public class Client {
	public static void main(String[] args) {
		Model model = (Model) ModelFactory.getShow("米兰达·可儿");
		model.setStyle("Bono系列");
		model.show();

		model = (Model) ModelFactory.getShow("刘雯");
		model.setStyle("冰与火系列");
		model.show();

		model = (Model) ModelFactory.getShow("米兰达·可儿");
		model.setStyle("天使肖像系列");
		model.show();
	}
}