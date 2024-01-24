package com.lxisoft.carproject;
public class Door
{
	private String doorName;
	private String colour;
	
public String getDoorName(){
return doorName;
}
public void setDoorName(String doorName){
this.doorName = doorName;
}

public String getColour(){
return colour;
}
public void setColour(String colour){
this.colour = colour;
}

public String toString(){
return "Door name:" + doorName + "colour:" + colour;
}	
}