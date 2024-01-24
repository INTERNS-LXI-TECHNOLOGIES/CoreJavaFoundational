package com.lxisoft.carproject;
public class Car implements Drivable {
	
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

	public void drive() {
		System.out.println("Im driving a car");
	}
public String toString()
{
	
	String value="";
	
	value=value+carName+"";
	value=value+varient+"";
	value=value+colour+"";
	
	for(int door=0;door<3;door++)
	{
		value=value+doors[door]+"";
		
	}
	
	for(int tyre=0;tyre<3;tyre++)
	{
		value=value+tyres[tyre]+"";
		
	}
	
	
	value=value+steering+"";
	
	
	
	return value;
	
}


	
}
