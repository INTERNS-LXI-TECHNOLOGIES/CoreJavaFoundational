package com.divisosoft.carshowroom;
import java.util.Scanner;

public class Tdd
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String name;
		
		System.out.println("\t"+"--- Car Showroom ---"+"\n");
		System.out.println("ENTER YOUR NAME  : ");
		name = scanner.nextLine();
		System.out.println("Hi "+name+". Welcome to the Showroom"+"\n");
		
		Car car = new Car();
		
		System.out.println("WHICH BRAND DO YOU WANT  : ");
		car.brand = scanner.nextLine();
		
		System.out.println("ENTER CAR NAME  : ");
		car.name = scanner.nextLine();
		
		System.out.println("WHICH COLOUR DO YOU WANT  : ");
		car.color = scanner.nextLine();
		
		System.out.println("Hi "+name+" . A "+car.color+" "+car.brand+" "+car.name+" car is here !"+"\n");
		
		
		car.door = new Door();
		
		System.out.println("\t"+"ENTER DOOR DETAILS"+"\n");
		
		System.out.println("WHICH COLOUR DOOR DO YOU WANT");
		car.door.color = scanner.nextLine();
		
		System.out.println("WHICH SIZE DOOR DO YOU WANT");
		//car.door.size = scanner.nextInt();
		car.door.size=Integer.parseInt(scanner.nextLine());
		
		car.tyre = new Tyre();
		
		System.out.println("\t"+"ENTER TYRE DETAILS"+"\n");
		
		System.out.println("WHICH BRAND TYRE DO YOU WANT");
		
		car.tyre.brand = scanner.nextLine();
		
		System.out.println("WHICH COLOUR TYRE DO YOU WANT");
		car.tyre.color = scanner.nextLine();
		
		System.out.println("WHICH SIZE TYRE DO YOU WANT");
		car.tyre.size =Integer.parseInt(scanner.nextLine());
		
		car.steer = new Steering();
		
		System.out.println("\t"+"ENTER STEERING DETAILS"+"\n");
		
		System.out.println("WHICH COLOUR DO YOU WANT : ");
		car.steer.color = scanner.nextLine();
		
		System.out.println("WHICH SHAPE STEERING DO YOU WANT : ");
		car.steer.shape = scanner.nextLine();
		
		System.out.println("Ok "+name+" . Your car can be delivered within 2 days . Thank you ");
		
	}
}

