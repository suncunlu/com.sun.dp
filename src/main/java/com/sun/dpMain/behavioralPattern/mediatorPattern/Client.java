package com.sun.dpMain.behavioralPattern.mediatorPattern;

/**
 * @author :suncunlu
 * @date :2018-12-17 14:13:11
 * @description :中介模式
 */
public class Client {
public static void main(String[] args) {
	MediatorStructure mediator = new MediatorStructure();
	
	HouseOwner houseOwner = new HouseOwner("张三", mediator);
	Tenant tenant = new Tenant("李四", mediator);
	
	mediator.setHouseOwner(houseOwner);
	mediator.setTenant(tenant);
	
	tenant.constact("听说你那里有三室的房子出租");
	houseOwner.constact("是的，请问你需要租吗？");
}
}
