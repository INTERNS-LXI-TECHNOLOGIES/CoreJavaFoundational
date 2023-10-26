package com.divisosoft.pollutionproject.info;
import com.divisosoft.pollutionproject.child.*;

import java.util.*;
public class VehicleInfo
{
	Scanner sc=new Scanner(System.in);
	List<Vehicle> vehicle = new ArrayList<>();
	
	
	public void create()
	{
      	System.out.println("*****CAR DETAILS*****");	
    	Vehicle car = new Car();
	
	  	System.out.println("OWNER NAME");
	   	String name =sc.nextLine();
	   	car.setownerName(name);
    	car.getownerName();
		System.out.println("\n");
		
    	System.out.println("REGISTRATION NUMBER");
		car.setregistrationNumber(sc.nextLine());
    	car.getregistrationNumber();
		System.out.println("\n");
		
   		System.out.println("PHONE NUMBER");
    	car.setphoneNumber(sc.nextLine());
    	car.getphoneNumber();
		System.out.println("\n");
		
    	vehicle.add(car);
	}
	    public void read()
		{
			System.out.println("YOUR CAR INFORMATION IS SUCCESSFULLY READED ");
	  		System.out.println(vehicle);
            System.out.println("\n");			
	   	}

            public void update()
        	{
            	System.out.println("TO UPDATE YOUR VEHICLE ENTER UR REGISTRATIONNUMBER");
    	       	String number = sc.nextLine();
	 	
	           	for(Vehicle u:vehicle)
            	{
               		if(number.equals(u.getregistrationNumber()))
	               	{
	                   	System.out.println("OWNER NAME");
                   		String name =sc.nextLine();
                   		u.setownerName(name);
                   		u.getownerName();
						System.out.println("\n");
		  
                   		System.out.println("REGISTRATION NUMBER");
                   		u.setregistrationNumber(sc.nextLine());
                   		u.getregistrationNumber();
                 		System.out.println("\n");
	 	
                  		System.out.println("PHONE NUMBER");
                  		u.setphoneNumber(sc.nextLine());
                   		u.getphoneNumber();
						System.out.println("\n");
						System.out.println("YOUR CAR HAS BEEN SUCCESSFULLY UPDATED");
						
	                   	System.out.println(u);
	                }
		        }	
  	        }
                    		public void delete()
	                  	{ 
			    			System.out.println("TO DELETE YOUR VEHICLE REGISTRATION NUMBER");
                        	String delete = sc.nextLine();
		
	                    	for(int i=0; i<1; i++)
		                    {
		                       	Vehicle x = vehicle.get(i);
		                       	if(delete.equals(x.getregistrationNumber()))
	                       		{
									System.out.println("\n");
									System.out.println("YOUR CAR DETAILS HAS BEEN SUCCESSFULLY DELETED");
		                    		vehicle.remove(i);
	                        	}	
		                    }
		                }
						            public void createb()
	                                {
                                       	System.out.println("*****BIKE DETAILS*****");	
                                    	Vehicle bike = new Bike();
	
	                                  	System.out.println("OWNER NAME");
                                  	   	String name =sc.nextLine();
	                                	bike.setownerName(name);
                                    	bike.getownerName();
	                                  	System.out.println("\n");
		
                                     	System.out.println("REGISTRATION NUMBER");
	                                 	bike.setregistrationNumber(sc.nextLine());
                                      	bike.getregistrationNumber();
	                                  	System.out.println("\n");
		
   	                                	System.out.println("PHONE NUMBER");
                                       	bike.setphoneNumber(sc.nextLine());
    	                                bike.getphoneNumber();
		                                System.out.println("\n");
		 
                                    	vehicle.add(bike);
	                                }
									     public void readb()
		                                {
			                                System.out.println("YOUR BIKE INFORMATION IS SUCCESSFULLY READED "); 
	                                  		System.out.println(vehicle);
                                            System.out.println("\n");			
	                                   	}
						       				public void updateb()
        	                                {
                                            	System.out.println("TO UPDATE YOUR VEHICLE ENTER UR REGISTRATIONNUMBER");
    	                                    	String number = sc.nextLine();
	 	
	                                         	for(Vehicle u:vehicle)
                                               	{
                                            		if(number.equals(u.getregistrationNumber()))
	                                               	{
	                                                	System.out.println("OWNER NAME");
                                                		String name =sc.nextLine();
                                                 		u.setownerName(name);
                                                		u.getownerName();
			                                   			System.out.println("\n");
		  
                                                   		System.out.println("REGISTRATION NUMBER");
                                                  		u.setregistrationNumber(sc.nextLine());
                                                		u.getregistrationNumber();
                                                		System.out.println("\n");
	 	
                                                   		System.out.println("PHONE NUMBER");
                                                   		u.setphoneNumber(sc.nextLine());
                                                		u.getphoneNumber();
				                                   		System.out.println("\n");
				                                 		System.out.println("YOUR CAR HAS BEEN SUCCESSFULLY UPDATED");
						
	                                                	System.out.println(u);
	                                                }
		                                        }	
  	                                        }
											          	public void deleteb()
	                                                   	{ 
			    	                                		System.out.println("TO DELETE YOUR VEHICLE REGISTRATION NUMBER");
                                                          	String delete = sc.nextLine();
		
	                                                      	for(int i=0; i<1; i++)
		                                                    {
		                                                     	Vehicle x = vehicle.get(i);
		                                                     	if(delete.equals(x.getregistrationNumber()))
	                                                    		{
				                                					System.out.println("\n");
				                                					System.out.println("YOUR BIKE DETAILS HAS BEEN SUCCESSFULLY DELETED");
		                                                     		vehicle.remove(i);
	                                                           	}	
		                                                    }
		                                                } 
                                                                    public void createq()
                                                                	{
                                                                    	System.out.println("*****BUS DETAILS*****");	
                                                                    	Vehicle bus = new Bus();
	 
	                                                                	System.out.println("OWNER NAME");
	                                                                	String name =sc.nextLine();
	                                                            	   	bus.setownerName(name);
	                                                                	bus.getownerName();
	                                                            		System.out.println("\n");	                                                            
		
	                                                                	System.out.println("REGISTRATION NUMBER");
	                                                            		bus.setregistrationNumber(sc.nextLine());
	                                                                	bus.getregistrationNumber();
	                                                            		System.out.println("\n");
		
	                                                               		System.out.println("PHONE NUMBER");
	                                                                	bus.setphoneNumber(sc.nextLine());
	                                                                	bus.getphoneNumber();
	                                                            		System.out.println("\n");
		
	                                                                	vehicle.add(bus);
	                                                            	}
	                                                            	    public void readq()
	                                                            		{
		                                                            		System.out.println("YOUR BUS INFORMATION IS SUCCESSFULLY READED ");
		                                                              		System.out.println(vehicle);
    	                                                                    System.out.println("\n");			
		                                                               	}

    	                                                                    public void updateq()
    	                                                                	{
        	                                                                	System.out.println("TO UPDATE YOUR VEHICLE ENTER UR REGISTRATIONNUMBER");
    		                                                                   	String number = sc.nextLine();
	 	
	    	                                                                   	for(Vehicle u:vehicle)
       	                                                                    	{
            	                                                               		if(number.equals(u.getregistrationNumber()))
	            	                                                               	{
	                	                                                               	System.out.println("OWNER NAME");
                   		                                                            	String name =sc.nextLine();
                   		                                                            	u.setownerName(name);
                   		                                                            	u.getownerName();
						                                                            	System.out.println("\n");
		  
                   		                                                            	System.out.println("REGISTRATION NUMBER");
                   		                                                            	u.setregistrationNumber(sc.nextLine());
                   		                                                            	u.getregistrationNumber();
                 		                                                            	System.out.println("\n");
	 	
                  		                                                            	System.out.println("PHONE NUMBER");
                  		                                                            	u.setphoneNumber(sc.nextLine());
                   		                                                            	u.getphoneNumber();
						                                                            	System.out.println("\n");
						                                                            	System.out.println("YOUR CAR HAS BEEN SUCCESSFULLY UPDATED");
						
	                	                                                               	System.out.println(u);
	            	                                                                }
		    	                                                                }	
  	     	                                                                }
                    		                                                           	public void deleteq()
	                  		                                                            { 
			    				                                                            System.out.println("TO DELETE YOUR VEHICLE REGISTRATION NUMBER");
                        		                                                            String delete = sc.nextLine();
		
	                    		                                                            for(int i=0; i<1; i++)
		                    	                                                            {
		                       		                                                            Vehicle x = vehicle.get(i);
		                       		                                                            if(delete.equals(x.getregistrationNumber()))
	                       	                                                             		{
									                                                            	System.out.println("\n");
									                                                            	System.out.println("YOUR CAR DETAILS HAS BEEN SUCCESSFULLY DELETED");
		                    		                                                            	vehicle.remove(i);
	                        		                                                            }	
		                   	                                                                }
		            	                                                                }																														   
} 	 