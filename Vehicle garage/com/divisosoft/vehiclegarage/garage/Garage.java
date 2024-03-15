package com.divisosoft.vehiclegarage.garage;
import com.divisosoft.vehiclegarage.vehicle.*;

public class Garage{

private String name;
private long mobNumber;
private String address;

public Vehicle[] vehicle = new Vehicle[10];

public void setName(String name){
	this.name=name;
}

public String getName(){
	return name;
}

public void setMobnumber(long mobNumber){
	this.mobNumber=mobNumber;
}

public long getMobnumber(){
	return mobNumber;
}

public void setAddress(String address){
	this.address=address;
}

public String getAddress(){
	return address;
}


public String toString(){
  String result = "";
  for(int i=0;i<vehicle.length;i++){
	  result += vehicle[i];
  }
	return "\n"+getName()+"\n"+getMobnumber()+"\n"+getAddress()+"\n"+result;
}

public void ShowCar(){
	for(int i=0;i<vehicle.length;i++){
		if (vehicle[i] instanceof Car){
	System.out.println(((Car)vehicle[i]).getBrand()+"\n"+((Car)vehicle[i]).getModel()+"\n"+((Car)vehicle[i]).getColor()+"\n"+((Car)vehicle[i]).carType()+"\n");	
		}
	}
	
}

public void ShowBike(){
	for(int i=0;i<vehicle.length;i++){
		if (vehicle[i] instanceof MotorCycle){
	System.out.println(((MotorCycle)vehicle[i]).getBrand()+"\n"+((MotorCycle)vehicle[i]).getModel()+"\n"+((MotorCycle)vehicle[i]).getColor()+"\n"+((MotorCycle)vehicle[i]).bikeType()+"\n");	
			
		}
	}
	
}





}