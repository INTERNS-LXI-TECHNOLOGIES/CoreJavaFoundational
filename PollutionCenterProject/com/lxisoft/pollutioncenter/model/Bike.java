package com.lxisoft.pollutioncenter.model;
import com.lxisoft.pollutioncenter.control.Vehicle;
public class Bike extends Vehicle
{
private String colour;
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
    public String getColour()
	{
		return colour;
	}		
public String toString()
	{
		//String toString =super.toString();
		return super.toString()+"\n"+colour;
		
	}
}