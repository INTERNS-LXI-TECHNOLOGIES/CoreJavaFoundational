import java.util.Scanner;

public class ViewController
{
 
	 
	 
	private PollutionController controller = new PollutionController();
    Scanner s = new Scanner(System.in);
	 
	 
	 
	public PollutionController getController()
       {
        return controller;
       }
     
		public void viewThing(){
			boolean programContinue = true;
			
				 while (programContinue)
		{

	
             System.out.println("\n----POLLUTION CONTROLL----\n");
			
			
			    System.out.println("Enter 1 :VEHICLE DETAILS");
		        System.out.println("Enter 2 :CHECK VEHICLE DETAILS");
		        System.out.println("Enter 3 :QUIT");
		        

		         String count  = s.nextLine();
				 
				
			    switch (count)
			     {
				case "1":
				vehicleDetails();
					
					break;
					
					
			     case "2":
                  checkDetails();
				 
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
			
			public void contactDetails()
			{
			
	
}

       public void vehicleDetails()
     {
	              
	             boolean flag = true;
	      
	              while(flag)
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
								  //fourWheelerDetails();
								 
									  break;
									  
								
								case "3":
								  //heavyCatogoryDetails();
									  break;
									  
									  case "4":
								   flag = false;
									  break;
									  
								 }
				  }		
								
	 }
	        public void twoWheelerDetails()	
		     {
					boolean flag = true;	
					int i = 0;	
					while (flag)
						{
						if(controller.getVehicles()[i]==null)
						{
							controller.getVehicles()[i]=new Bike();
						}
						  
                          System.out.println("Enter  bike/scooty registration number");
                           controller.getVehicles()[i].setRegisterNumber(s.nextLine());
   
                            System.out.println("Enter Date");
                            controller.getVehicles()[i].setDate(s.nextLine());
   
					        System.out.println("enter brand");
							((Bike)controller.getVehicles()[i]).setBrand(s.nextLine());
					        System.out.println("Enter pollution controll center name");
					        controller.getVehicles()[i].setCenterName(s.nextLine());
   
                            System.out.println("Enter yes to continue no to quit");
                            String response = s.nextLine();
				        
                        if(response.equals("no"))
		                 {
                          flag = false;
                         }
					}
			}
					
					
			/*public void fourWheelerDetails()	
				{
					boolean flag=true;
					while (flag)
						{
							
							
                       System.out.println("Enter  car registration number");
                       controller.getVehicles()[i].setRegisterNumber(s.nextLine());
   
                       System.out.println("Enter Date");
                       controller.getVehicles()[i].setDate(s.nextLine());
					  
					   System.out.println("Enter pollution controll center name");
					   controller.getVehicles()[i].setCenterName(s.nextLine());
   
   
                       System.out.println("Enter yes to continue no to quit");
                       String response = s.nextLine();
				        
                        if(response.equals("no"))
		                 {
                          flag = false;
                         }
						} 									
				}*/
					
					
					
					
					
					
					
			/*public void heavyCatogoryDetails()	
				{
				boolean flag=true;
				while (flag)
					{
								
                       System.out.println("Enter  lorry registration number");
                       String re =s.nextLine();
   
                       System.out.println("Enter Date");
                       String st = s.nextLine();
					  
					   System.out.println("Enter pollution controll center name");
					   String pl = s.nextLine();
   
                       System.out.println("Enter yes to continue no to quit");
                       String response = s.nextLine();
				        
                        if(response.equals("no"))
		                 {
							 flag = false;
							 {
						     break;
							 }
						  
                         }

					}
				}*/
			


	           


          public void checkDetails()
               {
                    System.out.println(controller);    
			    }

               
  
}


