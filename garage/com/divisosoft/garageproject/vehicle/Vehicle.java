package com.divisosoft.garageproject.vehicle;


public class Vehicle{
private String name;
private String colour;
private String regNo;

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setColour(String colour){
	this.colour=colour;
}
public String getColour(){
	return colour;
}
	
public void setRegNo(String regNo){
	this.regNo=regNo;
}
public String getRegNo(){
	return regNo;
}
public String toString(){
	return "\n"+"Vehicle Name - "+name+"\n"+"Colour - "+colour+"\n"+"Reg no -"+regNo+"\n";
}



}