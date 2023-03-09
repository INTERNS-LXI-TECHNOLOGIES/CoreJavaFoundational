import java.util.Scanner;

import java.util.*;
import java.text.*;


public class ViewController
{
	int i = 0;
	int j =0;
	 PollutionController controller = new PollutionController();
      
	
    Scanner s = new Scanner(System.in);
	
	
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
					
					try{
					
					boolean flag = true;
	                while (flag)
					{	
				 
					  boolean check = false;   
                       System.out.println("Enter  bike/scooty registration number");
					   String regNum = s.nextLine();
						   
						for (int j = 0; controller.getVehicles()[j]!=null ; j++)
						 {
							   
						 if ((controller.getVehicles()[j].getRegisterNumber()!=null)&&(controller.getVehicles()[j].getRegisterNumber().equals(regNum))) 
							   
						  {   
                            System.out.println("\t                    THIS VEHICLE ALREADY REGISTERED\n ");
							System.out.println("\t   Your Certificate Valid For The Next 6 Months From The Date Of Registration.\n");
							System.out.println("\t              Thank You For Your Service....!!!!            \t");
                             check = true;
						  }
   
						 }
						   
						   if(!check){
							   
							controller.getVehicles()[i]= new Bike(); 
							
							controller.getVehicles()[i].setRegisterNumber(regNum);
							
							System.out.println("enter brand");
							((Bike)controller.getVehicles()[i]).setBrand(s.nextLine());   
							
					        System.out.println("Enter pollution controll center name");
					        controller.getVehicles()[i].getVehicleInf()[j].setCenterName(s.nextLine());
							
							
							
							
							
							
							controller.getVehicles()[i].getVehicleInf()[j].setDate(new Date(System.currentTimeMillis()));
								i++;
								j++;
						     }
						  
                            System.out.println("Enter yes to continue no to quit");
                            String response = s.nextLine();
							
                        if(response.equalsIgnoreCase("No"))
		                {
                          flag = false;
					    }
					}

						}
					catch(Exception ex){
					   ex.printStackTrace();
					    }
			}
			
		
		
		
		
		
		
			   public void fourWheelerDetails()	
				{
                  
				try{
                    boolean flag=true;
				    while(flag)
					{
			          boolean check = false; 
                       System.out.println("Enter  car registration number");
					   String regsNum = s.nextLine();
					   
					   for (int k = 0;controller.getVehicles()[k]!=null; k++)  
					   
					   {
					   
					   if ((controller.getVehicles()[k].getRegisterNumber()!=null)&&(controller.getVehicles()[k].getRegisterNumber().equals(regsNum))) 
							   
							   {   
                                System.out.println("\t                   THIS VEHICLE ALREADY REGISTERED          \n");
								System.out.println("\t   Your Certificate Valid For The Next 6 Months From The Date Of Registration.\n");
							    System.out.println("\t              Thank You For Your Service....!!!!            \n");
                                check = true;
							   }
					   }
					   
					   if (!check){
					   
					   
					   controller.getVehicles()[i]=new Car();
					   
					   controller.getVehicles()[i].setRegisterNumber(regsNum);
					   
					   System.out.println("enter brand");
					   ((Car)controller.getVehicles()[i]).setBrand(s.nextLine());
					   
					   
					   System.out.println("Enter pollution controll center name");
					   controller.getVehicles()[i].getVehicleInf()[j].setCenterName(s.nextLine());
					   
					   
					   controller.getVehicles()[i].getVehicleInf()[j].setDate(new Date(System.currentTimeMillis()));
                      
                         i++;
						 j++;

					  }
				
                       System.out.println("Enter yes to continue no to quit");
                       String response = s.nextLine();
				        
                        if(response.equalsIgnoreCase("No"))
		                 {
                          flag = false;
					 }
					 
				}
				}
				catch(Exception ex){
				    
				ex.printStackTrace();
				}
				}	



		  public void heavyCatogoryDetails()	
				{
			 boolean flag=true;
			  try{
				 
				 while (flag)
			       {	  
                     
					 boolean check = false;
					 
					   System.out.println("Enter  lorry registration number");
                       String regstNum = s.nextLine();
					   
					   for (int m = 0; controller.getVehicles()[m]!=null; m++)  
					   
					   {
					   
					   if ((controller.getVehicles()[m].getRegisterNumber()!=null)&&(controller.getVehicles()[m].getRegisterNumber().equals(regstNum))) 
							   
						 {   
                             System.out.println("\t                THIS VEHICLE ALREADY REGISTERED               \n");
						     System.out.println("\t   Your Certificate Valid For The Next 6 Months From The Date Of Registration.\n");
							 System.out.println("\t              ThankYou For Your Service....!!!!            \t");
                             check = true;
						 }
					   }
					   
					   if (!check){
					   
					    controller.getVehicles()[i]=new Lorry();
						
					   controller.getVehicles()[i].setRegisterNumber(regstNum);
					   
					   System.out.println("enter brand");
					   ((Lorry)controller.getVehicles()[i]).setBrand(s.nextLine());
					   
					   System.out.println("Enter pollution controll center name");
					   controller.getVehicles()[i].getVehicleInf()[j].setCenterName(s.nextLine());
					   
					   controller.getVehicles()[i].getVehicleInf()[j].setDate(new Date(System.currentTimeMillis()));
					   
					    i++;
						j++;
					   
					   }
					  
                       System.out.println("Enter yes to continue no to quit");
                       String response = s.nextLine();
				        
                        if(response.equalsIgnoreCase("No"))
		                 {
							 flag = false;
							 
						     break;
							 
						  	
                         }
					 
				   }
				   }catch(Exception ex){
						ex.printStackTrace();
			  	    }
				 
				}
          public void printVehicleDetails()
               {
				   
				   
				   
				    System.out.println("\t     KERALA STATE MOTOR VEHICLE DEPARTMENT - PALAKKAD \n");
				   
				    System.out.println("YOUR 'POLLUTION CONTROLLER CERTIFICATION' IS VALID FOR THE  NEXT 6 MONTHS \n");
					
                    System.out.println(controller); 
					
                    System.out.println("\t              ThankYou For Your Service....!!!!    ");

					
			   
			   }

               
  
}


