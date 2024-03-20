package com.divisosoft.garageproject.textfile;
import com.divisosoft.garageproject.garage.*;
import com.divisosoft.garageproject.vehicle.*;
public class Tdd{
	public static void main(String[] argc){

		Garage garage = new Garage();
		garage.setName("VEHICLE GARAGE");
		garage.setPhoneNumber(8075710318L);
		garage.setAddress("ALATHUR,PALAKKAD");
	
		String carName[] = {"Swift","Polo","GTR","Innova","Zen"};
		String carColour[] = {"Red","White","Black","Grey","Blue"};
		String carRegNum[] = {"KL9867","KL6533","KL7621","KL1324","KL4326"};
	
	for(int i = 0, q= 0; i<5;i++){
		garage.vehicle[i] = new Car();
		garage.vehicle[i].setName(carName[q]);
		garage.vehicle[i].setColour(carColour[q]);
		garage.vehicle[i].setRegNum(carRegNum[q]);
		((Car)garage.vehicle[i]).carDetail();
		q++;
	}
		String bikeName[] = {"YAMAHA","SPLENDER","PULSER","FZ","NINJAH"};
		String bikeColour[] = {"yellow","green","violet","purple","black"};
		String bikeRegNum[] = {"KL9867","KL6533","KL7621","KL1324","KL4326"};
		
	for(int i = 5, q= 0; i<10;i++){
		garage.vehicle[i] = new Bike();
		garage.vehicle[i].setName(bikeName[q]);
		garage.vehicle[i].setColour(bikeColour[q]);
		garage.vehicle[i].setRegNum(bikeRegNum[q]);
		((Bike)garage.vehicle[i]).bikeDetail();
		q++;
	}
		
	/*for(int i=0;i<garage.vehicle.length;i++){
		if(garage.vehicle[i] instanceof Bike){
			((Bike)garage.vehicle[i]).bikeDetail();
		}
		else if(garage.vehicle[i] instanceof Car){
			((Car)garage.vehicle[i]).carDetail();
	}
	}*/
		System.out.println(garage);
		garage.showCar();
		garage.showBike();			
}
}
