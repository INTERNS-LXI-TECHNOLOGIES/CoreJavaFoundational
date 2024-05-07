package com.lxisoft.garage.model;

public class Bike extends Vehicle
{
	public String toString()
	{
		return "\n\n\n BIKE BRAND  : "+super.getBrand()+"\n MODEL NAME : "+super.getModel()+"\n VEHICLE NO : "+super.getRegisterno()+"\n MILEAGE    : "+super.getMileage()+"\n INSURENCE  : "+super.getInsurence();
	}
}
