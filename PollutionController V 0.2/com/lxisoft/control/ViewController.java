package com.lxisoft.control;
import com.lxisoft.info.VehicleInfo;
import com.lxisoft.child.Bike;
import com.lxisoft.child.Car;
import com.lxisoft.child.Lorry;

import com.lxisoft.authentication.Login;

import java.util.Scanner;

import java.util.*;
import java.text.*;



public class ViewController
{
	
	  PollutionController controller = new PollutionController();
      VehicleInfo vehicleInf = new VehicleInfo();
	  Login log = new Login();
	  Date date = new Date();
	  
	  SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
	
      Scanner s = new Scanner(System.in);
	
	public  void loginDetails()
	{
		
	
	
	System.out.println("\t LOGIN DETAILS\n");
	
	System.out.println(" Enter your user ID");
	String lg = s.nextLine();

	System.out.println(" Enter your Password");
	String lgn = s.nextLine();
	
	System.out.println("---------------------------\n");
	
	
	if(log.getUserId().equals(lg) && log.getPassWord().equals(lgn))
	{
		
	System.out.println(" Login ");	
		
		viewThing();
		
	}
	else {
		
		System.out.println("\t  Invalid UserId or Password  \n"); 
	     }
	
	 
	
	}
		public void viewThing()
		{
			boolean programContinue = true;
			
				 while (programContinue)
		{
             System.out.println("\n----POLLUTION CONTROL----\n");
		
			    System.out.println("Enter 1 :VEHICLE DETAILS");
		        System.out.println("Enter 2 :PRINT VEHICLE DETAILS");
		        System.out.println("Enter 3 :QUIT");
		        

		         String count  = s.nextLine();
				 
				
			    switch (count)
			     {
				case "1":
				vehicleDetails();
					
					break;
					
					
			     case "2":
                  printVehicleDetails();
				 
                      break;
					  
				 case "3":
				
                    System.out.print("Quit");			
					programContinue = false;
                      break;
					  
				 default:
					System.out.println("Invalid Expression");		
			      }
		}
		}
			
		
       public void vehicleDetails() 
     {
	              
	             boolean flagg = true;
	      
	              while(flagg)
				  {

                    System.out.println("\n...ENTER VEHICLE TYPE...\n");
                     
    
							System.out.println("Enter 1 :TWO WHEELER DETAILS");
							System.out.println("Enter 2 :FOUR WHEELER DETAILS");
							System.out.println("Enter 3 :HEAVY CATEGORY DETAILS");
							System.out.println("Enter 4 :back");
							
								String enter = s.nextLine();
								
							
								switch (enter)
								 {
								case "1":
								twoWheelerDetails();
									
									break;
									
									
								 case "2":
								  fourWheelerDetails();
								   break;
									  
								
								case "3":
								  heavyCatogoryDetails();
									  break;
									  
									  case "4":
								   flagg = false;
									  break;
									  
								 }
				  }		
								
	 }
	  
	        public void twoWheelerDetails()
		    {
					
					Bike bike = new Bike();
					
				    System.out.println("Enter your Registration Number");
					bike.setRegisterNumber(s.nextLine());
					
					System.out.println("Enter your Brand");
					bike.setBrand(s.nextLine());
					
					System.out.println("Enter your Center Name");
					vehicleInf.setCenterName(s.nextLine());
					
					
					System.out.println("    Date Updated   \n");
					vehicleInf.setDate(formater.format(date));
					
					
					controller.vehicles.add(bike);
					bike.getVehicleInfm().add(vehicleInf);	
			}
		
		 public void fourWheelerDetails()
		    {
					
					Car car = new Car();
					
				    System.out.println("Enter your Registration Number");
					car.setRegisterNumber(s.nextLine());
					
					System.out.println("Enter your Brand");
					car.setBrand(s.nextLine());
					
					System.out.println("Enter your Center Name");
					vehicleInf.setCenterName(s.nextLine());
					
					
					System.out.println("    Date Updated   \n");
					vehicleInf.setDate(formater.format(date));
					
					
					controller.vehicles.add(car);
					car.getVehicleInfm().add(vehicleInf);	
			}
		
		public void heavyCatogoryDetails()
		    {
					
					Lorry lorry = new Lorry();
					
				    System.out.println("Enter your Registration Number");
					lorry.setRegisterNumber(s.nextLine());
					
					System.out.println("Enter your Brand");
					lorry.setBrand(s.nextLine());
					
					System.out.println("Enter your Center Name");
					vehicleInf.setCenterName(s.nextLine());
					
					
					System.out.println("    Date Updated   \n");
					vehicleInf.setDate(formater.format(date));
					
					
					controller.vehicles.add(lorry);
					lorry.getVehicleInfm().add(vehicleInf);	
			}
			
          public void printVehicleDetails()
               {
				   
				   
				    System.out.println("....................................................................................");
				    System.out.println("\t     KERALA STATE MOTOR VEHICLE DEPARTMENT - PALAKKAD \n");
				   
				    System.out.println("YOUR 'POLLUTION CONTROLLER CERTIFICATION' IS VALID FOR THE  NEXT 6 MONTHS \n");
					System.out.println("....................................................................................");
                    System.out.println(controller);
					
					
                    System.out.println("\t              ThankYou For Your Service....!!!!    ");
                    System.out.println("....................................................................................");
					
			   
			   }

               
  
}


