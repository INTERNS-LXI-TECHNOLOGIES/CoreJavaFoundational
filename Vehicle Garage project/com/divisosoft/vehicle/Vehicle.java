package com.divisosoft.vehicle;
public class Vehicle{

String vehiclename;

public String toString(){
	
	return vehiclename;
}




public  void showBike(Vehicle[] vehicles){
	int sum=0;
	for(int i=0;i<vehicles.length;i++){
		System.out.println("length--->>>>>>>"+vehicles.length);
		if(vehicles[i] instanceof Bike){
			Bike bike = (Bike) vehicles[i];
			
			System.out.println(bike.colour+" "+bike.numberofmirror);
		}
	}
		
		

		
	}




public  void showCar(Vehicle[] vehicles){
	int sum=0;
	for(int i=0;i<vehicles.length;i++){
		System.out.println("length--->>>>>>>"+vehicles.length);
		if(vehicles[i] instanceof Car){
			Car car = (Car) vehicles[i];
			
			System.out.println(car.colour+" "+car.numberoftyre);
		}
	}
		
		

		
	}

}


