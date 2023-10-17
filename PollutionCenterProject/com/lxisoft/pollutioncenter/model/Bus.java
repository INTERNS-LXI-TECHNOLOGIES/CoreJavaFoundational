package com.lxisoft.pollutioncenter.model;
import com.lxisoft.pollutioncenter.control.Vehicle;
public class Bus extends Vehicle
{
	private String fuelType;

	public void setFuelType(String fuelType)
		{
		this.fuelType=fuelType;
		}
	public String getFuelType()
		{
		return fuelType;	
		}


public String toString()
	{
		String toString =super.toString()+"\n"+fuelType;
		return toString;
		
	}
}