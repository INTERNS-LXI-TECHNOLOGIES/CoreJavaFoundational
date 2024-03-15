package com.divisosoft.garage.vechicle;

public class Vechicle{
private String brandname;
private int regno;
private String color;



public String getBrandname(){
	return brandname;
}
public void setBrandname(String brandname){
    this.brandname=brandname;
}
public int getRegno(){
	return regno;
}
public void setRegno(int regno){
    this.regno=regno;	
}
public String getColor(){
	return color;
}
public void setColor(String color){
this.color=color;
}
public String toString(){
	return "\n"+" name:  "+brandname+ "\n" + "register number: "+ regno + "\n" +" color: "+color+"\n";	

	}
}


	