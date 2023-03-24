package com.lxisoft.control;

import com.lxisoft.info.VehicleInfo;
import com.lxisoft.child.Bike;
import com.lxisoft.child.Car;
import com.lxisoft.child.Lorry;
import com.lxisoft.info.Vehicle;
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
	
	System.out.println("\t  \n              WELCOME TO YOUR LOGIN PAGE \n");
	
	System.out.println("\n Enter your user ID \n");
	String lg = s.nextLine();

	System.out.println("\n Enter your Password \n");
	String lgn = s.nextLine();
		
	if(log.getUserId().equals(lg) && log.getPassWord().equals(lgn))
	{
	System.out.println("\n please press the 'Enter' key to submit \n");
	log.setSubmit(s.nextLine());
	
	
	System.out.println("\t  Logged in successfully...! \n");	
	searchDetails();	
	}
	
	else
		{
		
		System.out.println("\t         Invalid UserId or Password  \n"); 
	     }
			
	}

  public void searchDetails()
       {
	  
   System.out.println("Search your Register Number");

   String search = s.nextLine();
   
   crudDeatils();

     }



	public void crudDeatils()
	{
		boolean itsContinue = true;
             while (itsContinue)		
			  {
		        System.out.println("\nEnter 1 :Create");
		        System.out.println("Enter 2 :Read");
		        System.out.println("Enter 3 :Update");
				System.out.println("Enter 4 :Delete");
				System.out.println("Enter 5 :Back\n");
		        
		
		        String crud = s.nextLine();
		
		     switch (crud)
			     {
				case "1":
				enterVehicleInfo();
					
					break;
					
					
			     case "2":
                  printVehicleDetails();
				 
                      break;
					  
					  
					  case "3":
                 updateMethods();
				 
                      break;
					  
					  
					  case "4":
                  deleteMethod();
				 
                      break;
					  
					  
				 case "5":
				
                    System.out.print("Back");			
					itsContinue = false;
					
                      break;
					  
				 default:
					System.out.println("Invalid Expression");		
			      }
            } 
	 
       }
  
  
		public void enterVehicleInfo()
		  {
			boolean programContinue = true;
			
				 while (programContinue)
		  {
             System.out.println("\n----POLLUTION CONTROL----\n");
		
			    System.out.println("note: available portals are [car, lorry, bike]");
				System.out.println("\nEnter 'q' to quit \n");	
				String vehicle  = s.nextLine();
				
				if(vehicle.equalsIgnoreCase("Q"))
		                 {
                          
                           programContinue = false;
						   
					    } 
				
				 System.out.println("\nselected :"+vehicle);
			    switch (vehicle)
			     {
				case "car":{
				controller.getVehicleI().add(vehicleInformations(new Car()));	
				
				
					break;
				}
					
			     case "lorry":
                  controller.getVehicleI().add(vehicleInformations(new Lorry()));
				 
                      break;
					  
				 case "bike":
				controller.getVehicleI().add(vehicleInformations(new Bike()));
                    			
					
                      break;
					  
					  case "q":
					  System.out.print("Quit");
					  
					  String rps = s.nextLine();
					  if(rps.equalsIgnoreCase("Q"))
		                 {
                          
                          programContinue = false;
						   
					    } 
						
					  break;
					  
				 default:
					System.out.println("Invalid Expression");		
			      }
		   }
		 }
	        public Vehicle vehicleInformations(Vehicle v)
		    {
				
				
				try{
					boolean flag = true; 
					while(flag)
					{
					
					
				    System.out.println("\n Enter your Registration Number \n");
					v.setRegisterNumber(s.nextLine());
					
					if(controller.getVehicleI().contains(v)){
						
						System.out.println("\t                    THIS VEHICLE ALREADY REGISTERED\n ");
						System.out.println("\t   Your Certificate Valid For The Next 6 Months From The Date Of Registration.\n");
						System.out.println("\t              Thank You For Your Service....!!!! ");
   
						flag = false;
					    }
						
						else{
							
				if(v instanceof Car){
				    System.out.println("\n Enter your Brand \n");
				    ((Car)v).setBrand(s.nextLine());
					
					VehicleInfo info = new VehicleInfo();
					System.out.println("\n Enter your Center Name \n");
					info.setCenterName(s.nextLine());
					
					System.out.println("\n    Date Updated   \n");
					info.setDate(formater.format(date));
					v.getVehicleInfm().add(info);
					break;
						
				}

               else if(v instanceof Lorry)
			    {
					
					System.out.println("\n Enter your Brand \n");
				    ((Lorry)v).setBrand(s.nextLine());
					
					VehicleInfo info = new VehicleInfo();
					System.out.println("\n Enter your Center Name\n");
					info.setCenterName(s.nextLine());
					
					System.out.println("\n    Date Updated   \n");
					info.setDate(formater.format(date));
					v.getVehicleInfm().add(info);
					break;
						
				}
				   
				 else {
					 
					 System.out.println("\nEnter your Brand\n");
				    ((Bike)v).setBrand(s.nextLine());
					
					VehicleInfo info = new VehicleInfo();
					System.out.println("\n Enter your Center Name\n");
					info.setCenterName(s.nextLine());
					
					System.out.println("\n   Date Updated   \n");
					info.setDate(formater.format(date));
					v.getVehicleInfm().add(info);
					  break;
				     }
					    
                        
				}
				    System.out.println("Enter yes to continue no to quit \n");
                    String response = s.nextLine();
				      if(response.equalsIgnoreCase("No"))
		                 {
                          
                           flag=false;
						   
					    } 
					}
				} catch(Exception ex){
				    
				ex.printStackTrace();
				}
				return v;
				}
             
          public void printVehicleDetails()
               {
				 Vehicle vcl = new Vehicle();
				 System.out.println("\n Enter Register Number \n");
				 vcl.setRegisterNumber(s.nextLine());
				 int i = controller.getVehicleI().indexOf(vcl);
				 if(controller.getVehicleI().contains(vcl)){
				   
				    System.out.println("....................................................................................");
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				    System.out.println("....................................................................................\n");
				    System.out.println("\t     KERALA STATE MOTOR VEHICLE DEPARTMENT - PALAKKAD \n");
				   
				    System.out.println("YOUR 'POLLUTION CONTROLLER CERTIFICATION' IS VALID FOR THE  NEXT 6 MONTHS \n");
					System.out.println("....................................................................................");
                    
                    System.out.println(controller.getVehicleI().get(i));
					
					
                    System.out.println("\t              ThankYou For Your Service....!!!!    ");
                    System.out.println("....................................................................................");
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("....................................................................................\n");
			   
				 }
			   
			   
			   }

               
         public void deleteMethod()
               {
	 
	            Vehicle vcl = new Vehicle();
				
				System.out.println("\n Enter Register Number \n");
				vcl.setRegisterNumber(s.nextLine());
	 
	            int i = controller.getVehicleI().indexOf(vcl);
	 
	            if(controller.getVehicleI().contains(vcl))
	            {
		 
				  controller.getVehicleI().remove(i);
				  System.out.println("\n Deleted \n");
		 
                }
	 }
  
        public void updateMethods()
              {
				 Vehicle vcl = new Vehicle();
				 System.out.println("\n Enter Register Number \n");
				 vcl.setRegisterNumber(s.nextLine());
				 int i = controller.getVehicleI().indexOf(vcl);
                 VehicleInfo vehiIn = new VehicleInfo();
				 System.out.println("  Date Updated   \n");
			     vehiIn.setDate(formater.format(date));
                    
					
					if(controller.getVehicleI().contains(vcl)&& controller.getVehicleI().get(i).getVehicleInfm().contains(vehiIn)){
					int j = controller.getVehicleI().get(i).getVehicleInfm().indexOf(vehiIn);
					 System.out.println("\n Enter your CenterName \n");
					 
				     controller.getVehicleI().get(i).getVehicleInfm().get(j).setCenterName(s.nextLine());
					 
				     System.out.println("\n 'P' to print , 'N' to quit \n");
				     String response = s.nextLine();
				     
				     System.out.println("\n updated");
		 
					}
				 
              }
  
}


