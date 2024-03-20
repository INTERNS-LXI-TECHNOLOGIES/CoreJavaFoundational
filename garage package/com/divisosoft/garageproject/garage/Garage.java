package com.divisosoft.garageproject.garage;
import com.divisosoft.garageproject.vehicle.Bike;
import com.divisosoft.garageproject.vehicle.Car;
import com.divisosoft.garageproject.garage.Vehicles;
public class Garage{

private String name;
private long phoneNumber;
private String address;
	
	public Vehicles[] vehicle = new Vehicles[10];
	
	public void setName(String name){
	this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public long getPhoneNumber(){
		return phoneNumber;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void showCar(){
	for(int i=0;i<vehicle.length;i++){
		if(vehicle[i] instanceof Car){
			String car="";
			if(((Car)vehicle[i]).getIsTaxi()==true){
			car="isTaxi";
		}
		else{
			car="notTaxi";
		}
	System.out.println(vehicle[i].getName()+vehicle[i].getColour()+vehicle[i].getRegnum()+""+car);
		}
	}
		}
	
	public void showBike(){
	for(int i=0;i<vehicle.length;i++){
		if(vehicle[i] instanceof Bike){
			String bike="";
			if(((Bike)vehicle[i]).getIsGeared()==true){
			bike="isGeared";
			}
			
		else{
			bike="notGeared";
		}
	System.out.println(vehicle[i].getName()+vehicle[i].getColour()+vehicle[i].getRegnum()+""+bike);
	}
		}
	}
	public String toString(){
		String  result = "";
	for(int i = 0;i<vehicle.length;i++){
		result += vehicle[i];
	}
	return "NAME:"+getName()+"\n"+"PHN NUM:"+getPhoneNumber()+"\n"+"ADDRESS:"+getAddress()+result;
	}
}


		