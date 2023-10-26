package com.divisosoft.pollutionproject.test;
import com.divisosoft.pollutionproject.authentication.*;
import com.divisosoft.pollutionproject.authentication.Authentication;
//import com.divisosoft.pollutionproject.info.*;
import com.divisosoft.pollutionproject.info.Vehicle;
import com.divisosoft.pollutionproject.info.VehicleInfo;
//import com.divisosoft.pollutionproject.child.*;
import com.divisosoft.pollutionproject.child.Bike;
import com.divisosoft.pollutionproject.child.Bus;
import com.divisosoft.pollutionproject.child.Car;
import java.util.*;
import java.util.Scanner;
import java.time.LocalDateTime;
public class Tdd
{
	public static void main (String[] args)
	{
	    while(true)
		{
            Scanner se=new Scanner(System.in);		
		    Authentication pass = new Authentication();
	    	pass.setUserName("arshaf");
	    	pass.setPassword("12345");
		
	    	System.out.println("username");
	    	String us = se.nextLine();
		
	    	System.out.println("PASSWORD");
	    	String ps = se.nextLine();
		
	      	if(us.equalsIgnoreCase(pass.getUserName())&&ps.equals(pass.getPassword()))
	   	    {
				
	   	    	LocalDateTime myObj = LocalDateTime.now();
		
	           	VehicleInfo vehicleInfo = new VehicleInfo();
		
		
	           	System.out.println("--------------------WELCOME TO POLLUTION CENTER--------------------");
		        System.out.println("\n");
	          	System.out.println("WHICH TYPE OF VEHICLE U WANT TO CREATE");
	           	System.out.println("CAR / BIKE / BUS");
	           	String a = se.nextLine();
    			if(a.equalsIgnoreCase("CAR"))
				{
		            boolean flag = true;
	              	while(flag)
	              	{
						
						System.out.println("\n");
	                  	System.out.println("PRESS 1 TO CREAT");
	                   	System.out.println("PRESS 2 TO READ");
	                  	System.out.println("PRESS 3 TO UPDATE");
	                  	System.out.println("PRESS 4 TO DELETE");
	                  	System.out.println("\n");
	                   	String n = se.nextLine();
	                    switch(n)
	                    {
                            case "1":
                         	vehicleInfo.create();
							break;
		
                            case "2":
	                      	vehicleInfo.read();
	                        break;
	
                         	case "3":
	                        vehicleInfo.update();
	                        break;
		
	                      	case "4":
	                        vehicleInfo.delete();
	                       	break;

							default:
							System.out.println("SOMETHING WENT WRONG");
					    }
				    }
				}
				
				if(a.equalsIgnoreCase("bike"))
				{
		            boolean flag = true;
	              	while(flag)
	              	{
						System.out.println("\n");
	                  	System.out.println("PRESS 1 TO CREAT");
	                   	System.out.println("PRESS 2 TO READ");
	                  	System.out.println("PRESS 3 TO UPDATE");
	                  	System.out.println("PRESS 4 TO DELETE");
	                  	System.out.println("\n");
	                   	String n = se.nextLine();
	                    switch(n)
	                    {
                            case "1":
                         	vehicleInfo.createb();
							break;
		
                            case "2":
	                      	vehicleInfo.readb();
	                        break;
	
                            case "3":
	                        vehicleInfo.updateb();
	                        break;
		
	                      	case "4":
	                        vehicleInfo.deleteb();
	                       	break;

							default:
							System.out.println("SOMETHING WENT WRONG");
					    }
				    }
				}
				if(a.equalsIgnoreCase("bus"))
				{
		            boolean flag = true;
	              	while(flag)
	              	{
						System.out.println("\n");
	                  	System.out.println("PRESS 1 TO CREATE");
	                   	System.out.println("PRESS 2 TO READ");
	                  	System.out.println("PRESS 3 TO UPDATE");
	                  	System.out.println("PRESS 4 TO DELETE");
	                  	System.out.println("\n");
	                   	String n = se.nextLine();
	                    switch(n)
	                    {
                            case "1":
                         	vehicleInfo.createq();
							break;
		
                            case "2":
	                      	vehicleInfo.readq();
	                        break;
	
                            case "3":
	                        vehicleInfo.updateq();
	                        break;
		
	                      	case "4":
	                        vehicleInfo.deleteq();
	                       	break;

							default:
							System.out.println("SOMETHING WENT WRONG");
					    }
				    }
				}
			}
			else
			{
				System.out.println("--------------------PASSWORD IS WRONG--------------------");
				System.out.println("*****ACCESS DECLINE*****");
				System.out.println("\n");
			}
		}	
	}
}		
