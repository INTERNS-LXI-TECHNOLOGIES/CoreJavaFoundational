package com.divisosoft.car;
public class Door extends Part
{ 
private String doorLife;

public String getdoorLife()
{
	return doorLife;
}
public void setdoorLife(String doorLife)
{
	this.doorLife=doorLife;
}

public void printpart()   //OverRide
{
	//System.out.println(super.getname() + super.getcolour()+ size);
}
public String toString()
{
	String j=doorLife+super.toString();
	return j;
}
}