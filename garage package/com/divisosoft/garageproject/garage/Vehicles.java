package com.divisosoft.garageproject.garage;

public class Vehicles{

	private String name;
	private String colour;
	private String regnum;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setColour(String colour){
		this.colour = colour;
	}
	public String getColour(){
		return colour;
	}
	
	public void setRegNum(String regnum){
		this.regnum = regnum;
	}
	public String getRegnum(){
		return regnum;
	}
	
	public String toString(){
		return "\n"+"NAME:"+name+"\n"+"COLOUR:"+colour+"\n"+"REGNUM:"+regnum+"\n";
	}
}