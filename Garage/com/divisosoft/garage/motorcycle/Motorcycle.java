package com.divisosoft.garage.motorcycle;
import  com.divisosoft.garage.vehicle.Vehicle;
public class Motorcycle extends Vehicle{
	public boolean isBike;
	public void bike(){
		int i=(int)(Math.random()*5);
		if(i%2==0){
			isBike=true;
		}
	}
	
	public String toString(){
		return "Vehicle:"+getName()+"\n"+"Color:"+getColor()+"\n"+"RegNo:"+getRegno()+"\n"+"Bike:"+isBike+"\n"+"\n";
	}
}