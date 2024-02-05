package com.lxisoft.carproject;
public class Tdd{
public static void main(String[] args)
{
Car car = new Car();
car.setCarName("creta");
car.setVarient("sx");
car.setColour("polar white");


      for(int door=0;door<3;door++){
		  car.doors[door] = new Door();
	car.doors[door].setDoorName("luxuary");
	car.doors[door].setColour("white");
	
	}

    for(int tyre =0; tyre<3; tyre++){
		car.tyres[tyre] = new Tyre();
	car.tyres[tyre].setTyreName("appolo");
	car.tyres[tyre].setColour("black");
	}

   
	
	car.steering= new Steering();
	car.steering.setName("volvz");
	
	
	
	System.out.println(car);
}
	
}
