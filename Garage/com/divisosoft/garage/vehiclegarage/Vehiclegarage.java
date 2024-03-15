package com.divisosoft.garage.vehiclegarage;
import  com.divisosoft.garage.vehicle.Vehicle;
import  com.divisosoft.garage.car.Car;
import  com.divisosoft.garage.motorcycle.Motorcycle;

public class Vehiclegarage{
	private String name;
	private int phno;
	private String color;
	private String result;
	private String res;
	
	
	public Vehicle[] vehicles=new Vehicle[10];
	public void showcar(){
		System.out.println("             CAR DETAILS");
		for(int i=0;i<vehicles.length;i++){
			if(vehicles[i] instanceof Car){
				if(((Car)vehicles[i]).isTaxi==true){
				
					result="it's a taxi";
				}
				else{
					result="it's not a taxi";
				}
				System.out.println("Vehicle:"+vehicles[i].getName()+"\n"+"Color:"+vehicles[i].getColor()+"\n"+"Regno:"+vehicles[i].getRegno()+"\n"+result+"\n");
			}
			
	     }
		 
	}
	
	public void showbike(){
		System.out.println("              BIKE DETAILS");
		for(int i=0;i<vehicles.length;i++){
			if(vehicles[i] instanceof Motorcycle){
				if(((Motorcycle)vehicles[i]).isBike==true){
				
					res="it's a Bike";
				}
				else{
					res="it's not a Bike";
				}
				System.out.println("Vehicle:"+vehicles[i].getName()+"\n"+"Color:"+vehicles[i].getColor()+"\n"+"Regno:"+vehicles[i].getRegno()+"\n"+res+"\n");
			}
			
	     }
		 
	}
public void setName(String name){
		this.name=name;
	}
	
	public void setPhno(int phno){
		this.phno=phno;
	}
	
	
public String toString(){
	String result="";
	for( int i=0;i<vehicles.length;i++){
		 result+=vehicles[i];
	}	
	return "             GARAGE DETAILS"+"\n"+"GarageName:"+name+"\n"+"PhoneNo:"+phno+"\n"+"              VEHICLE DETAILS"+"\n"+result;
	
}

}


				
			
	
		
	
	