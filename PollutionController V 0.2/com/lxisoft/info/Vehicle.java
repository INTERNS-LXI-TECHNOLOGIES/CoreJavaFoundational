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
 
 
 
 
 
 
 

String registerNumber;

	public String getRegisterNumber()
    {
	  return registerNumber;
	 
    }
    public void setRegisterNumber(String registerNumber)
        {
	      this.registerNumber=registerNumber;
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

























