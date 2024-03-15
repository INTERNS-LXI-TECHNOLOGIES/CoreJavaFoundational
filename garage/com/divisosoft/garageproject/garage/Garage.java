package com.divisosoft.garageproject.garage;
import com.divisosoft.garageproject.vehicle.*;


public class Garage{
private String name;
private String address;
private long phnNo;
public Vehicle[] vehicle=new Vehicle[10];

public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setAddress(String address){
	this.address=address;
}
public String getAddress(){
	return address;
}
public void setPhnNo(long phnNo){
	this.phnNo=phnNo;
}
public long getPhnNo(){
	return phnNo;
}
public void showCar(){
	for(int i=0;i<vehicle.length;i++){
		if(vehicle[i] instanceof Car){
			System.out.println(((Car)vehicle[i]).getName()+"\n"+((Car)vehicle[i]).getColour()+"\n"+((Car)vehicle[i]).getRegNo()+"\n"+((Car)vehicle[i]).carType()+"\n");
		}
	}
}

public void showBike(){
	for(int i=0;i<vehicle.length;i++){
		if(vehicle[i] instanceof Bike){
			System.out.println(((Bike)vehicle[i]).getName()+"\n"+((Bike)vehicle[i]).getColour()+"\n"+((Bike)vehicle[i]).getRegNo()+"\n"+((Bike)vehicle[i]).bikeType()+"\n");
		}
	}
}


 public String toString(){
	String result="";
	for(int i=0;i<vehicle.length;i++){
		result+=vehicle[i];
	}
	return "Garage Name - "+name+"\n"+"Address - "+address+"\n"+"Phone no - "+phnNo+"\n"+result; 
 }





}

