package com.lxisoft.garage;
public class Tdd{
public static void main(String []args){
	
	Garage garage = new Garage();
	garage.setgarageName("Janathagarage");
	System.out.println(garage. getgargeName());
	
	garage.setPhone(9496731);
	//System.out.println(garage.getPhone());
	
	garage.vehicle[0]=new Vehicle();
	garage.vehicle[0]=new Bike();
	((Bike)garage.vehicle[0]).modelname="pulsar";
	((Bike)garage.vehicle[0]).bikeGeared();
	garage.vehicle[1]=new Car();
	((Car)garage.vehicle[1]).carcolour="Red";
	((Car)garage.vehicle[1]).carTaxy();

	garage.vehicle[2]=new Bike();
	((Bike)garage.vehicle[2]).modelname="Fz";
	garage.vehicle[3]=new Car();
    ((Car)garage.vehicle[3]).carcolour="yellow";
	garage.vehicle[4]=new Bike();
	((Bike)garage.vehicle[4]).modelname="unicon";
	garage.vehicle[5]=new Car();
    ((Car)garage.vehicle[5]).carcolour="black";
	garage.vehicle[6]=new Bike();
	((Bike)garage.vehicle[6]).modelname="hero Honda";
	garage.vehicle[7]=new Car();
    ((Car)garage.vehicle[7]).carcolour="White";
	garage.vehicle[8]=new Bike();
    ((Bike)garage.vehicle[8]).modelname="Xpulse";
	garage.vehicle[9]=new Car();
	((Car)garage.vehicle[9]).carcolour="Orange";


	garage.printArray();

	
	
}
}