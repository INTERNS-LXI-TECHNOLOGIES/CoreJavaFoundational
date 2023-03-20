package com.lxisoft.info;
import java.util.*;


public class Vehicle
{
	
	
private List <VehicleInfo> vehiclesIn = new ArrayList<VehicleInfo>();
 
public List<VehicleInfo> getVehicleInfm()
    {
	  return vehiclesIn;
	 
    }
public void setVehicleInfm(List<VehicleInfo>vehiclesIn)
        {
	      this.vehiclesIn=vehiclesIn;
		}
 
 
 

 private String registerNumber;

	public String getRegisterNumber()
    {
	  return registerNumber;
	 
    }
    public void setRegisterNumber(String registerNumber)
        {
	      this.registerNumber=registerNumber;
		}
	
public boolean equals(Object o){
	boolean found= false;
	if(o!=null&&o instanceof Vehicle)
	if(((Vehicle)o).getRegisterNumber().equals(this.registerNumber)){
		found=true;
	}
		
	return found;
	
}






	public String toString()
	{
	   String returnValue = "Register Number:"  + registerNumber;
		
	  for(VehicleInfo info:vehiclesIn){

	   if(info.getDate() != null)
	   {
							
	    returnValue =  returnValue+ info;

	   }
	  }
	    return  returnValue;
										
						
	   }

					
}			

























