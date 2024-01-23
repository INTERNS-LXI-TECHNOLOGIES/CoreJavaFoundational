package com.lxi.carproject;
public class Car
{

	private String brandName;
	private String regNumber;
	
	Door[] door=new Door[4];
	Tyre[] tyre=new Tyre[4];
	Steering steering;
	
	public String getBrandName() {
		return brandName;
	}



	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}



	public String getRegNumber() {
		return regNumber;
	}



	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}



	
	public String toString() {
		return "Car brandName=" +"/n"+ brandName + " regNumber=" +"/n"+ regNumber + " ownerName=" ;
	}


}