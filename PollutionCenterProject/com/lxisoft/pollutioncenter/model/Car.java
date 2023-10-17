package com.lxisoft.pollutioncenter.model;
import com.lxisoft.pollutioncenter.control.Vehicle;
public class Car extends Vehicle
{
private String brandName;
	
	public void setBrandName(String brandName)
	{
		this.brandName=brandName;
	}
	public String getBrandName()
	{
		return brandName;
	}
	
		public String toString()
	{
		String toString =super.toString()+"\n"+brandName;
		return toString;	
	}
}