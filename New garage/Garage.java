package com.lxisoft.garage;
public class Garage{

private String garagename;
private int phone;
Vehicle[]vehicle = new Vehicle[10];

public void printArray(){
	
	for(int i=0;i<vehicle.length;i++){
		
		System.out.println(vehicle[i]);
	}
}


public void setgarageName(String garagename){
	
	this.garagename=garagename;
}

public String  getgargeName(){
	
	 return this.garagename;
}

public void setPhone(int phone){
	
	this.phone=phone;
}

public int getPhone(){
	
	return this.phone;
}




}