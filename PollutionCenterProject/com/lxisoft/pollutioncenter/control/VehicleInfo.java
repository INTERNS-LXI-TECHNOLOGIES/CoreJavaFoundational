package com.lxisoft.pollutioncenter.control;
import	com.lxisoft.pollutioncenter.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class VehicleInfo
{	                          
	Scanner scan = new Scanner(System.in);
    List<Vehicle> vehicle = new ArrayList<>();
	
	
	public void creatingVehicleDetailsCar()
	{
	Vehicle carCheck = new Vehicle();
	System.out.println("Enter The RegisterNumber");
	carCheck.setRegisterNumber(scan.nextLine());
	if(vehicle.contains(carCheck))
	{
	System.out.println(" Already!!!!Registered");	
	}
	else
	{
	Vehicle car = new Car();
	car.setRegisterNumber(carCheck.getRegisterNumber());
	car.getRegisterNumber();	
	
	System.out.println("Enter The OwnerName");
	car.setOwnerName(scan.nextLine());
	car.getOwnerName();
	
	System.out.println("Enter The PhoneNumber");
	car.setPhoneNumber(scan.nextLine());
	car.getPhoneNumber();
	
	System.out.println("Enter The brandName");
	((Car)car).setBrandName(scan.nextLine());
	((Car)car).getBrandName();
	vehicle.add(car);
	}
	}
	public void creatingVehicleDetailsBus()
	{
	Vehicle busCheck = new Vehicle();
	System.out.println("Enter The RegisterNumber");
	busCheck.setRegisterNumber(scan.nextLine());
	if(vehicle.contains(busCheck))
	{
	System.out.println(" Already!!!!Registered");	
	}
	else
	{
	Vehicle bus = new Bus();
	bus.setRegisterNumber(busCheck.getRegisterNumber());
	bus.getRegisterNumber();	
	
	System.out.println("Enter The OwnerName");
	bus.setOwnerName(scan.nextLine());
	bus.getOwnerName();
	
	System.out.println("Enter The PhoneNumber");
	bus.setPhoneNumber(scan.nextLine());
	bus.getPhoneNumber();
	
	((Bus)bus).setFuelType(scan.nextLine());
	((Bus)bus).getFuelType();
	vehicle.add(bus);
	}
	}
	
	public void creatingVehicleDetailsBike()
	{
	Vehicle bikeCheck = new Vehicle();
	System.out.println("Enter The RegisterNumber");
	bikeCheck.setRegisterNumber(scan.nextLine());
	if(vehicle.contains(bikeCheck))
	{
	System.out.println(" Already!!!!Registered");	
	}
	else
	{
	Vehicle bike = new Bike();
	bike.setRegisterNumber(bikeCheck.getRegisterNumber());
	bike.getRegisterNumber();	
	
	System.out.println("Enter The OwnerName");
	bike.setOwnerName(scan.nextLine());
	bike.getOwnerName();
	
	System.out.println("Enter The PhoneNumber");
	bike.setPhoneNumber(scan.nextLine());
	bike.getPhoneNumber();
	
	((Bike)bike).setColour(scan.nextLine());
	((Bike)bike).getColour();
	vehicle.add(bike);
	}
	}
	
	public void ReadVehicleDetails()
	{
	for(Vehicle vv:vehicle)
	{
	System.out.println(vv);	
    System.out.println("Vehicle Registred");	
	}
	}
	
	public void UpdateVehicleDetails()
	{     
	System.out.println("Enter Which Vehicle RegisterNumber For Update");
	String reg = scan.next();
	scan.nextLine();
	for(Vehicle v : vehicle)
	{
     if(reg.equals(v.getRegisterNumber()))
	 {
		System.out.println("Enter The New Vehicle RegisterNumber "); 
		//Vehicle y = vehicle.get();
		System.out.println("Enter RegisterNumber");
		v.setRegisterNumber(scan.nextLine());
		v.getRegisterNumber();
		System.out.println("Enter OwnerName");
		v.setOwnerName(scan.nextLine());
		v.getOwnerName();
		System.out.println("Enter PhoneNumber");
		v.setPhoneNumber(scan.nextLine());
		v.getPhoneNumber();
		//System.out.println(v);	
	 }
	}	
    }
		public void DeleteVehicleDetails()
		{
			System.out.println("Enter Vehicle RegisterNumber To Delete");
			Vehicle del = new Vehicle(); 
			del.setRegisterNumber(scan.nextLine());
			del.getRegisterNumber();

		 	if(vehicle.contains(del))	
			{
				//int dd=vehicle.indexOf(del);
				vehicle.remove(del);
				System.out.print("Vehicle removed.");	
			}
		}
		}	    	
