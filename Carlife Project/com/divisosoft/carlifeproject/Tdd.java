package com.divisosoft.carlifeproject ;

import java.util.Scanner ;

public class Tdd
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t"+"*** Car Parts Life Checking ***"+"\n");
		
		Car car = new Car();
		
		System.out.println("Enter Your Name");
		car.name = scan.nextLine();
		System.out.println("Hi "+car.name+" . Welcome To Part Life Checking Center"+"\n");
		
		System.out.println("\t"+"--- CAR DETAILS ---"+"\n");
		
		boolean x = true ;
		
			car.door = new Door();
			car.tyre = new Tyre();
			car.steer = new Steering();
			
			if(car.door instanceof Door){
			
			System.out.println("Enter Your Door life ");
			car.door.life=scan.nextInt();
			}
			if(car.tyre instanceof Tyre){
			System.out.println("Enter Your Tyre life ");
			car.tyre.life=scan.nextInt();
			}
			if(car.steer instanceof Steering){
			System.out.println("Enter Your Steering life ");
			car.steer.life=scan.nextInt();
			}
			System.out.println("");
			
		while(x)
		{
			
		System.out.println("How many KM has your car driven ?");
		car.km = scan.nextInt();
		
		car.door.life = car.door.life-car.km/100*3.5;
		System.out.println("Door Life is : "+car.door.life);
		
		car.tyre.life = car.tyre.life-car.km/100*6.5 ;
		System.out.println("Tyre Life is : "+car.tyre.life);
		
		car.steer.life = car.steer.life-car.km/100*6.5 ;
		System.out.println("Steering Life is : "+car.steer.life);
		
		System.out.println("PRESS N : EXIT");
		System.out.println("PRESS Y : CONTINUE");
		car.press = scan.next();
		scan.nextLine();
		
		if(car.press.equalsIgnoreCase("Y"))
		{
			System.out.println("Your Door life "+car.door.life);
			System.out.println("Your Door life "+car.tyre.life);
			System.out.println("Your Door life "+car.steer.life);
		}
		
		x = car.printExitDetails();
		
		}
	}
}
