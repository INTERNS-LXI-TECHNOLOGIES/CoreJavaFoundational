package com.divisosoft.pollutioncentre.controller;
import com.divisosoft.pollutioncentre.model.Vehicle;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Vehicleinfo
{
	Scanner scan = new Scanner(System.in);
	List<Vehicle> vehicle = new ArrayList<>();
	
	public void CreateCars()
	{
		Vehicle checkcar = new Car();
		System.out.println("Enter Register Number");
		String reg = scan.nextLine();
		checkcar.setRegno(reg);
		checkcar.getRegno();
		for(Vehicle v : vehicle)
		{
			if(vehicle.contains(checkcar))
			{
			System.out.println("Already Exist");
			return ;
			}	
		}
		Vehicle car = new Car();
		((Car)car).CreateCar();
		vehicle.add(car);
		System.out.println("Created Successfully!");
	}
	
	public void ReadCar()
	{
		for(Vehicle v : vehicle)
		{
			if(v instanceof Car)
			{
				int index = vehicle.indexOf(v);
				System.out.println(index+" "+v);
			}
		}
	}
		
	public void updateVehicle()
	{
		System.out.println("Enter the name to update");
		String name = scan.nextLine();
		System.out.println("Enter the Register Number to update");
		String regno = scan.nextLine();
		for(Vehicle v : vehicle)
		{
			if(name.equals(v.getName())&&regno.equals(v.getRegno()))
			{
				System.out.println("Enter new name");
				String newName = scan.nextLine();
				v.setName(newName);
				v.getName();
				System.out.println("Enter new Register Number");
				String newRegno = scan.nextLine();
				v.setRegno(newRegno);
				v.getRegno();
			}
		}
	}
	
	public	void DeleteVehicle()
	{
		System.out.println("Enter the name to delete");
		String name = scan.nextLine();
		System.out.println("Enter the Register Number to delete");
		String regno = scan.nextLine();
		
		for(int i = 0; i<=vehicle.size();i++)
		{
			Vehicle v = vehicle.get(i) ;
			
			if(name.equals(v.getName()))
			{
				vehicle.remove(i);
			}
		}
	}
	
	public void CreateBikes()
	{	
		Vehicle checkbike = new Bike();
		System.out.println("Enter Register Number");
		String reg = scan.nextLine();
		checkbike.setRegno(reg);
		checkbike.getRegno();
		for(Vehicle v : vehicle)
		{
			if(vehicle.contains(checkbike))
			{
			System.out.println("Already Exist");
			return ;
			}	
		}
		Vehicle bike = new Bike();
		((Bike)bike).CreateBike();
		vehicle.add(bike);
		System.out.println("Created Successfully!");
	}
	
	public void ReadBike()
	{
		for(Vehicle v : vehicle)
		{
			if(v instanceof Bike)
			{
				int index = vehicle.indexOf(v);
				System.out.println(index+" "+v);
			}
		}
	}
		
	
	public void CreateBuses()
	{
		Vehicle checkbus = new Bus();
		System.out.println("Enter Register Number");
		String reg = scan.nextLine();
		checkbus.setRegno(reg);
		checkbus.getRegno();
		for(Vehicle v : vehicle)
		{
			if(vehicle.contains(checkbus))
			{
			System.out.println("Already Exist");
			return ;
			}	
		}
		Vehicle bus = new Bus();
		((Bus)bus).CreateBus();
		vehicle.add(bus);
		System.out.println("Created Successfully!");
	}


public void ReadBus()
	{
		for(Vehicle v : vehicle)
		{
			if(v instanceof Bus)
			{
				int index = vehicle.indexOf(v);
				System.out.println(index+" "+v);
			}
		}
	}
}