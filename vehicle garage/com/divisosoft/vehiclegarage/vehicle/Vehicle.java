package com.divisosoft.vehiclegarage.vehicle; 
import com.divisosoft.vehiclegarage.motorcycle.MotorCycle;
import com.divisosoft.vehiclegarage.car.Car;

public class Vehicle{
private String name;
private String color;
private String regno;

public String getName()
{
	return name;
	
}

public void setName(String name)
{
	this.name=name;	
	
	
} 

public String getColor()
{
  return color;
	
}

public void setColor(String color)
{
	this.color=color;
	
	
} 

public String getRegno()
{
	return regno;
	
}

public void setRegno(String regno)
{
	this.regno=regno;
	
	
} 
public String toString(){
return name+regno+color;

}

}