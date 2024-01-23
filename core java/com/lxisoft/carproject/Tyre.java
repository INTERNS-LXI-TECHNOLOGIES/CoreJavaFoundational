package com.lxisoft.carproject;
public class Tyre{
	private String tyreName;
	private String colour;
	
	
public String getTyreName(){
return tyreName;
}
public void setTyreName(String tyreName){
this.tyreName = tyreName;
}
 
public String getColour()
{
return colour;
}
public void setColour(String colour){
this.colour = colour;
}	


public String toString(){
 return "tyre name:" + tyreName + 	"colour:" + colour;
}
}