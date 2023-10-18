package com.diviso.model;
import java.util.Scanner;
public class Tdd
{	
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		Car car =new Car();
		System.out.println("enter the car Details");
		//String a = scan.nextLine();
		car.setName("polo");
		car.setColour("blue");
		System.out.println("CAR NAME IS:"+car.getName());
		System.out.println("CAR COLOUR IS:"+car.getColour());				
		Door door=new Door();
		Tyre tyre=new Tyre();
		Steering steering= new Steering();			
		if(door instanceof Door && tyre instanceof Tyre && steering instanceof Steering)  //car.parts instanceof Door
		{            
			System.out.print("Enter The DoorLife");
			door.setDoorLife(scan.nextInt());
			double doorLife=door.getDoorLife();
			System.out.print("Enter The TyreLife");
			tyre.setTyreLife(scan.nextInt());
			double tyreLife=tyre.getTyreLife();
			System.out.print("Enter The SteeringLife");
			steering.setSteeringLife(scan.nextInt());
			double steeringLife=steering.getSteeringLife();			
			boolean check=true;			
			while(check)
			{		
			System.out.println("How Much KiloMeters Car travel");
			double KM= scan.nextDouble();
			
				 doorLife =doorLife-(KM/10)*2.5;	
				 tyreLife =tyreLife-(KM/10)*10.5;
				 steeringLife =steeringLife-(KM/10)*15.5;
				
				System.out.println("\t Current Car Life");				
				System.out.println("DOOR LIFE IS:"+doorLife);
				System.out.println("TYRE LIFE IS:"+tyreLife);
				System.out.println("STEERING LIFE IS:"+steeringLife);				
				System.out.println("yes to continue No to exit");
				String o= scan.next();
				//scan.nextLine();
				//System.out.print("sasa"+o);
				if(o.equals("yes"))
				{
					check=true;
				}
				else
				{
					check=false;
					break;
				}	
			}			
		}
	}
}

		
//BRUTFOST
	
/*	package com.diviso.model;
	import java.util.Scanner;
	public class Tdd
{	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
			Car car =new Car();
			System.out.println("enter the car Details");
			//String a = sc.nextLine();
			car.setname("polo");
			car.setcolour("blue");
			System.out.println("CAR NAME IS:"+car.getname());
			System.out.println("CAR COLOUR IS:"+car.getcolour());
				
				
		System.out.println("\t DOOR LIFE");
	Door door=new Door();
	System.out.println(door instanceof Door);
	if(door instanceof Door)
	{
	door.setDoorLife(100);
	double c=door.getDoorLife();
	System.out.println(c);
	
	System.out.println("how much did you travel");
	double b=sc.nextDouble();
	System.out.println(b);
	if(b==10)
	{
		double a =c-2.5;
		System.out.println(a);
	}
	else
	{
		System.out.println("wrong Statement");
	}
	}
	
	System.out.println("\t TYRE LIFE");
	Tyre tyre=new Tyre();
	//System.out.println(tyre instanceof Tyre);
	if(tyre instanceof Tyre)
	{
	tyre.settyreLife(100);
	double k=tyre.gettyreLife();
	System.out.println(k);
	
	System.out.println("how much did you travel");
	double m =sc.nextDouble();
	System.out.println(m);
	if(m==10)
	{
		double l =k-10.5;
		System.out.println(l);
	}
	else
	{
		System.out.println("wrong Statement");
	}
	}
	
	System.out.println("\t STEERING LIFE");
	
	Steering steering= new Steering();
	if(steering instanceof Steering)
	{
	steering.setsteeringLife(100);
	double f =steering.getsteeringLife();
	System.out.println(steering.getsteeringLife());
	
	System.out.println("How Much Did You Travel");
	double q=sc.nextDouble();
	System.out.println(q);
	if(q==10)
	{
		double r= f-15.5;
		System.out.println(r);
	}
	}	
}
}*/