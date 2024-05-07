package com.lxisoft.garage.model;

public class Garage
{
	private String name;
	private String place;
	private int pincode;
	private Vehicle[] vehicle = new Vehicle[10];
	
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	
	
	
	
	public void setPlace(String place)
	{
		this.place=place;
	}
	
	public String getPlace()
	{
		return place;
	}
	
	
	
	
	public void setPin(int pin)
	{
		this.pincode=pin;
	}
	
	public int getPin()
	{
		return pincode;
	}
	
	
	
	
	
	public void setVehicle(Vehicle[] vehicle)
	{
		this.vehicle=vehicle;
	}
	
	public Vehicle[] getVehicle()
	{
		return vehicle;
	}
	
	
	
	public String toString()
	{
		String a="";
		
		for(int i=0;i<vehicle.length;i++)
		{
			a+=vehicle[i];
		}
		return "\n GARRAGE NAME : "+name+"\n PLACE         : "+place+"\n PIN  CODE    : "+pincode+a;
	}
		
	
}
	
	