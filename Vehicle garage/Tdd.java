public class Tdd{

public static void main(String[]args){

Garage garage = new Garage();
garage.setName("Janatha Garage");
garage.setMobnumber(9995119911L);
garage.setAddress("Piller no 239 Edapally, Kochi, EKM ");
//System.out.println("\n"+"\t"+"***** VEHICLE GARAGE *****"+"\n"+"\n"+garage);


String carBrand[] = {"BMW","Toyota","Maruti Suzuki","Hindusthan Motors","Tata"};
String carModel[] = {"3 Series","Innova","Swift Dzire","Ambassidor","Harrier"};
String carColor[] = {"Black","White","White","White","Yellow"};
for(int i=0,w=0;i<=4;i++){
	 garage.vehicle[i] = new Car();
     garage.vehicle[i].setBrand(carBrand[w]);
     garage.vehicle[i].setModel(carModel[w]);
     garage.vehicle[i].setColor(carColor[w]);
      w++;
}

String bikeBrand[] = {"Yamaha","Suzuki","TVS","Honda","Bajaj"};
String bikeModel[] = {"FZ","Access","Apache RTR 200","Activa","NS200"};
String bikecolor[] = {"Battle Green","Grey","Red","Black","Yellow"};

for(int i=5,q=0;i<=9;i++){
	 garage.vehicle[i] = new MotorCycle();
	 garage.vehicle[i].setBrand(bikeBrand[q]);
     garage.vehicle[i].setModel(bikeModel[q]);
     garage.vehicle[i].setColor(bikecolor[q]);
	 q++; 
}


for(int i=0;i<5;i++){
	((Car)garage.vehicle[i]).carDetails();
	((Car)garage.vehicle[i]).Showcar();
	
}
for(int i=5;i<10;i++){
	((MotorCycle)garage.vehicle[i]).bikeDetails();
	((MotorCycle)garage.vehicle[i]).Showbike();
	
}
System.out.println(garage);













}

}