package com.divisosoft.garage.tdd;
import  com.divisosoft.garage.vehiclegarage.Vehiclegarage;
import  com.divisosoft.garage.car.Car;
import  com.divisosoft.garage.motorcycle.Motorcycle;
public class Tdd{
	public static void main(String[] args){
		Vehiclegarage garage=new Vehiclegarage();
		garage.setName("ONE STOP Garage");
		garage.setPhno(1234567891);
		
		
		String brandNames[]={"BMW","FORD","AUDI","HONDA","TOYOTA","TVS","BAJAJ","YAMAHA","HONDA","KTM"};
		String colors[]={"Black","Blue","Red","Green","Yellow","Black","Blue","Red","Green","Yellow"};
		int regnos[]={345,123,572,897,305,111,222,333,444,555};
		
		for(int i=0,q=0;i<5;i++,q++){
			garage.vehicles[i]=new Car();
			garage.vehicles[i].setName(brandNames[q]);
			garage.vehicles[i].setColor(colors[q]);
			garage.vehicles[i].setRegno(regnos[q]);
			((Car)garage.vehicles[i]).taxi();
				
			
		}
		for(int i=5,q=5;i<10;i++,q++){
			garage.vehicles[i]=new Motorcycle();
			garage.vehicles[i].setName(brandNames[q]);
			garage.vehicles[i].setColor(colors[q]);
			garage.vehicles[i].setRegno(regnos[q]);
			((Motorcycle)garage.vehicles[i]).bike();
		}
		
		
			
		
		System.out.println(garage);	
		garage.showcar();
		garage.showbike();
		
		
		
	}
}
			
			