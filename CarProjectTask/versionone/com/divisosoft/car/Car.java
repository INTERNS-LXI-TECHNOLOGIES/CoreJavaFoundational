package com.divisosoft.car;
import java.util.ArrayList;
import java.util.List;

public class Car<T extends Part> 
{
	
	private String name;
	
	public Car(String name)
	{
		this.name = name;
	}
     List<T> list = new ArrayList<>();

    public void start() {
        System.out.println("Turn On the Key To Start Engine");
    }

    public void drive() {
        System.out.println("Turn On the Key To Drive");
    }

    public void accelerate() {
        System.out.println("Press The Accelerate Stand To Move The Car");
    }

    public void brake() {
        System.out.println("Press The Brake Stand To Slow Down The Car");
    }

    public void turnOnLight() {
        System.out.println("Press The Light Button For Turn On Light To View The Road At Night");
    }

    public void turnOffLight() {
        System.out.println("Press The Light Button For Turn Off Light At Morning");
    }

    public void horn() {
        System.out.println("Press The Horn Button For Signal To Others To Move Their Car");
    }

    public void checkFuelLevel() {
        System.out.println("When You Start The Car First Check Fuel Level");
    }

    public void openWindows() {
        System.out.println("Open Windows Of The Car For Fresh Air");
    }

    public void closeWindows() {
        System.out.println("Close Windows Of The Car For Turn On AC");
    }

    public void stop() {
        System.out.println("Turn Off The Key To Turn Off The Engine Of The Car");
    }
	
		public String toString()
	{
		System.out.println("\t Car Details");
		String toString= "CAR Name is :"+name;
		return toString;
	}
}
