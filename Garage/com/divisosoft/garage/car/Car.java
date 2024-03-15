package com.divisosoft.garage.car;
import  com.divisosoft.garage.vehicle.Vehicle;
public class Car extends Vehicle{
	public boolean isTaxi;
	public void taxi(){
	
	int i=(int)(Math.random()*5);
		if(i%2==0){
			isTaxi=true;
		}
	}
	
	public 	String toString(){
		return "Vehicle:"+getName()+"\n"+"Color:"+getColor()+"\n"+"RegNO:"+getRegno()+"\n"+"Is Taxi:"+isTaxi+"\n"+"\n";
	}
		
}
	