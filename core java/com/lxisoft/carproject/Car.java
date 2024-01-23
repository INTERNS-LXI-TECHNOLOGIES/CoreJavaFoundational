package com.lxisoft.carproject;
public class Car{
	
	private String carName;
	private String varient;
	private String colour;
	public Tyre[] tyres = new Tyre[3];
	public Door[] doors = new Door[3];
	public Steering steering;
	
	
public String getCarName(){
return carName;
}
public void setCarName(String carName){
	this.carName = carName;
}

public String getVarient(){
	return varient;
}
public void setVarient(String varient){
	this.varient = varient;
}

public String getColour(){
	return colour;
}
public void setColour(String colour){
	this.colour = colour;
}

public String toString()
{
	
	String toString="";
	
	toString=toString+carName+"";
	toString=toString+varient+"";
	toString=toString+colour+"";
	
	for(int door=0;door<3;door++)
	{
		toString=toString+doors[door]+"";
		
	}
	
	for(int tyre=0;tyre<3;tyre++)
	{
		toString=toString+tyres[tyre]+"";
		
	}
	
	
	toString=toString+steering+"";
	
	
	
	return toString;
	
}


	
}