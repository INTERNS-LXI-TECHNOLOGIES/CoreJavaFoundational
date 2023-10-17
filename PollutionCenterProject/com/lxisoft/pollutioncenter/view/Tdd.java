package com.lxisoft.pollutioncenter.view;
import com.lxisoft.pollutioncenter.authentication.Authentication;
import com.lxisoft.pollutioncenter.control.Vehicle;
import com.lxisoft.pollutioncenter.control.VehicleInfo;
import java.util.Scanner;
import java.time.LocalDateTime;
public class Tdd
{
	public static  void main(String[] args)    // synchronized
	{
			
		Scanner sc = new Scanner(System.in);
		Authentication auth = new Authentication();
		auth.getUserName();
		auth.getPassword();
		
		System.out.println("\n");
		System.out.println("Enter The E-MailId");
		String ss = sc.nextLine();
		System.out.println("Enter The Password");
		String as = sc.nextLine();
		System.out.println("Enter submit Button To Continue");
		String scc = sc.nextLine();
		if(scc.equals("submit"))
		{
		if(ss.equals(auth.getUserName())&&as.equals(auth.getPassword()))
		{
		LocalDateTime myObj = LocalDateTime.now();
		VehicleInfo	vehicleinfo	= new VehicleInfo();
		System.out.println("\t~~~~WELCOM TO POLLUTION CHECKING CENTER~~~~\t");
		//System.out.println("\n");
	while(true)
		{	
		System.out.println("Enter which type of Vehicle is enter(car,bus,bike)");
		String q = sc.nextLine();
		System.out.println("Vehicle Enterd Date & Time:"+myObj); 
		
			System.out.println("press 1: to Create");
			System.out.println("press 2: to Read");
			System.out.println("press 3: to Update");
			System.out.println("press 4: to Delete");
			String ask = sc.nextLine();
			switch(ask)
			{
			case "1":
			if(q.equalsIgnoreCase("car"))
			{
			vehicleinfo.creatingVehicleDetailsCar();
			}
			if(q.equalsIgnoreCase("bus"))
			{
			vehicleinfo.creatingVehicleDetailsBus();	
			}
			
			if(q.equalsIgnoreCase("bike"))
			{
			vehicleinfo.creatingVehicleDetailsBike();
			}
			break;
			
			case "2":
			vehicleinfo.ReadVehicleDetails();
			break;
			
			case"3":
			vehicleinfo.UpdateVehicleDetails();
			break;
		
			case"4":
			vehicleinfo.DeleteVehicleDetails();
			break;
				
			default:
			System.out.println("Enter The Valied Key That Show above");
			}
		}
		}
		else
		{
		System.out.println("Authentication Failed....Please Check Your UserName And Password");	
		}
		}
	}
}



