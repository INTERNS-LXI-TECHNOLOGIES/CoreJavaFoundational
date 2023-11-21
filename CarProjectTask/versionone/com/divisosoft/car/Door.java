package com.divisosoft.car;
public class Door extends Part
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
		System.out.println("\t Door Details");
		String toString= "Door colour is :" +colour+"\nDoor model_No is :"+super.toString();
		return toString;
	}

}
