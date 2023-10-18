package com.divisosoft.pollutioncentre.view;
import com.divisosoft.pollutioncentre.controller.*;
import java.util.Scanner ;
import java.util.ArrayList ;
import java.util.List ;

public class Tdd
{
	public static void main(String[] args)
	{
		System.out.println(" ");
		System.out.println("\t"+"-----   WELCOME TO POLLUTION CHECKING CENTRE   -----"+"\n");
		Scanner scan = new Scanner(System.in);
		Vehicleinfo info = new Vehicleinfo();
		
		
			
		boolean x = true ;
		while(x)
		{
			System.out.println("PRESS 1 : Create ");
			System.out.println("PRESS 2 : Read  ");
			System.out.println("PRESS 3 : Update  ");
			System.out.println("PRESS 4 : Delete  ");
			int press = scan.nextInt();
			
			System.out.println(" Vehicle Type "+"\n");
			System.out.println("PRESS 1 : Car ");
			System.out.println("PRESS 2 : Bike ");
			System.out.println("PRESS 3 : Bus ");
			int pres = scan.nextInt();
		
			switch(press)
			{
				case 1 :
					
				if(pres==1)
				{
					info.CreateCars();
					
				}
				else if(pres==2)
				{
					info.CreateBikes();	
				}
				else if(pres==3)
				{
					info.CreateBuses();
				}
				else
				{
					System.out.println("Sorry... Something went Wrong ");
				}
				
				break ;
				
				case 2 : 
				if(pres==1)
				{
					info.ReadCar();
				}
				else if(pres==2)
				{
					info.ReadBike();
				}
				else if(pres==3)
				{
					info.ReadBus();
				}
				else
				{
					System.out.println("Sorry... Something went Wrong ");
				}
				
				
				break ;
				
				case 3 :
				
				info.updateVehicle();
				System.out.println("Your Vehicle Updated Successfully!");
				
				break ;				
				
				case 4 :
				
				info.DeleteVehicle();
				
				break ;
				
				default :
				
				System.out.println("Something went wrong...");
				
			}
		}
	}
}	