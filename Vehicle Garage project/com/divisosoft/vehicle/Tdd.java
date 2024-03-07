package com.divisosoft.vehicle;
public class Tdd{
public static void main(String []args){
	
	Garage garage =new Garage();
	//System.out.println(garage.getname());
	garage.setname("janathagarage");
	System.out.println(garage.getname());

	 Vehicle vehicle = new Vehicle();
	garage.setphone(945546);
	
	System.out.println(garage.getphone());
	
	
     garage.vehicle[0]= new Car();
	 garage.vehicle[0].vehiclename="Car1";
	 ((Car)garage.vehicle[0]).colour="Blue";
	 ((Car)garage.vehicle[0]).numberoftyre=4;
	 
	 
	 garage.vehicle[1]=  new Bike();
	 garage.vehicle[1].vehiclename="Bike1";
     ((Bike)garage.vehicle[1]).colour="Orange";
	  ((Bike)garage.vehicle[1]).numberofmirror=2;
   //  System.out.println( ((Bike)garage.vehicle[1]).colour);	 

	 
	 garage.vehicle[2]= new Car();
	 garage.vehicle[2].vehiclename="car2";
	((Car)garage.vehicle[2]).colour="Red";
	((Car)garage.vehicle[2]).numberoftyre=4;
	 
	 
	 garage.vehicle[3]= new Bike();
	 garage.vehicle[3].vehiclename="Bike2";
	 ((Bike)garage.vehicle[3]).colour="red & white";
	 ((Bike)garage.vehicle[3]).numberofmirror=2;
	 
	 garage.vehicle[4]= new Car();
	 garage.vehicle[4].vehiclename="Car3";
	 ((Car)garage.vehicle[4]).colour="Yellow";
	 ((Car)garage.vehicle[4]).numberoftyre=4;

	 
	 garage.vehicle[5]= new Bike();
	 garage.vehicle[5].vehiclename="Bike3";
	 ((Bike)garage.vehicle[5]).colour="Green";
	 ((Bike)garage.vehicle[5]).numberofmirror=2;
	 
	 garage.vehicle[6] = new Car();
	 garage.vehicle[6].vehiclename="Car4";
    ((Car)garage.vehicle[6]).colour="Green";
	((Car)garage.vehicle[6]).numberoftyre=4;
	 
	 
	 garage.vehicle[7] = new Bike();
	 garage.vehicle[7].vehiclename="Bike4";
	 ((Bike)garage.vehicle[7]).colour="black";
	 ((Bike)garage.vehicle[7]).numberofmirror=2;
	  
	  
	 garage.vehicle[8] = new Car();
	 garage.vehicle[8].vehiclename="Car5";
	 ((Car)garage.vehicle[8]).colour="Brown";
     ((Car)garage.vehicle[8]).numberoftyre=4;
	 
	 garage.vehicle[9] = new Bike();
	 garage.vehicle[9].vehiclename="Bike5";
	 ((Bike)garage.vehicle[9]).colour="black";
	 ((Bike)garage.vehicle[9]).numberofmirror=2;
	 
	 for(int i=0;i<garage.vehicle.length;i++){
		 
		 System.out.println(garage.vehicle[i]);
	 }


	((Car)garage.vehicle[0]).carTaxi();

	System.out.println(((Car)garage.vehicle[0]).istaxi);
	((Bike)garage.vehicle[1]).Bikegear();
	System.out.println(((Bike)garage.vehicle[1]).isgeared);
	
	vehicle.showCar(garage.vehicle);
	
    vehicle.showBike(garage.vehicle);

	
	
}	 



}