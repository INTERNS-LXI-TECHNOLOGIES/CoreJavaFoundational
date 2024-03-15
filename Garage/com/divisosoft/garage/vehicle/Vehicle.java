package com.divisosoft.garage.vehicle;

public class Vehicle{
	private String name;
	private String color;
	private int regno;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setRegno(int regno){
		this.regno=regno;
	}
	public int getRegno(){
    return regno;
	}
	/*public String toString(){
		
		return "\n"+"Vehicle:"+name+"\n"+"Color:"+color+"\n"+"RegistrationNo:"+regno+"\n";
	}*/
	
}