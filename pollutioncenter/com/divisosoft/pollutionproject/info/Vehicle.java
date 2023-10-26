package com.divisosoft.pollutionproject.info;
public class Vehicle
{
	private String ownerName;
	private String registrationNumber;
	private String phoneNumber;
	 
	public void setownerName(String a)
	{
		this.ownerName = a;	 
	}
	    public String getownerName()
	    {
		    return ownerName;
	    }
        	public void setregistrationNumber(String b)
        	{
        		this.registrationNumber = b; 
        	}
            	public String getregistrationNumber()
            	{
            		return registrationNumber;
             	} 
                	public void setphoneNumber(String c)
	                {
                		this. phoneNumber = c;
                	}
                    	public String getphoneNumber()
                      	{
	                    	return  phoneNumber;
	                    } 
                            public boolean equals(Object obj)
							{
								Vehicle equal = (Vehicle) obj;
								if(this.registrationNumber.equals(equal.registrationNumber))
								{
								   	return true;
                                }
                                    else
                                    {
							        	return false;
								    }										 									
						    }
                        	public String toString()
                        	{
                           		String toString="";
                        		toString=toString+ownerName+"\n"+registrationNumber+"\n"+phoneNumber;
                         		return toString;
	                        }
}




                    
						
						
						
						/*public void delete()
	                  	{ 
						Vehicle v = new Vehicle();
						
			    			System.out.println("TO DELETE YOUR VEHICLE REGISTRATION NUMBER");
                        	//String delete = sc.nextLine();
                            int i=vehicle.indexOf(v);	
	                    	//for(int i=0; i<vehicle.size(); i++)
		                    //{
		                       //Vehicle x = vehicle.get(i);
		                       	if(vehicle.contains(v))
									
	                       		{
									System.out.println("\n");
									System.out.println("YOUR CAR DETAILS HAS BEEN SUCCESSFULLY DELETED");
		                    		vehicle.remove(i);
	                        	}	
		                    //}*/
		                