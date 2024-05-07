package com.lxisoft.garage.model;

public class Car extends Vehicle
{
	
	public String toString()
	{
		return "\n\n\n CAR BRAND  : "+super.getBrand()+"\n MODEL NAME : "+super.getModel()+"\n VEHICLE NO : "+super.getRegisterno()+"\n MILEAGE    : "+super.getMileage()+"\n INSURENCE  : "+super.getInsurence();
	}
}