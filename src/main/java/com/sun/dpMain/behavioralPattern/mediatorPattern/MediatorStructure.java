package com.sun.dpMain.behavioralPattern.mediatorPattern;

public class MediatorStructure extends Mediator {
	private HouseOwner houseOwner;
	private Tenant tenant;
	@Override
	public void constact(String message, Person person) {
		// TODO Auto-generated method stub
		if(person == houseOwner) {
			tenant.getMessage(message);
		}else if (person ==tenant){
			houseOwner.getMessage(message);
		}else {
			System.out.println("参数非法");
		}
	}
	/**
	 * @return the houseOwner
	 */
	public HouseOwner getHouseOwner() {
		return houseOwner;
	}
	/**
	 * @param houseOwner the houseOwner to set
	 */
	public void setHouseOwner(HouseOwner houseOwner) {
		this.houseOwner = houseOwner;
	}
	/**
	 * @return the tenant
	 */
	public Tenant getTenant() {
		return tenant;
	}
	/**
	 * @param tenant the tenant to set
	 */
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	

}
