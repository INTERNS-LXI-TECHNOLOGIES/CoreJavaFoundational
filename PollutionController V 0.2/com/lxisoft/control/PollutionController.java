package com.lxisoft.control;

import com.lxisoft.info.Vehicle;
import com.lxisoft.child.Bike;
import com.lxisoft.child.Car;
import com.lxisoft.child.Lorry;

import java.util.*;

public class PollutionController

{
private List <Vehicle> vehicles = new ArrayList<Vehicle>();


	public List<Vehicle> getVehicleI()
    {
	  return vehicles;
	 
    }
public void setVehicleI(List<Vehicle>vehicles)
        {
	      this.vehicles=vehicles;
		}
 
	
public PollutionController(){
	
} 
public String toString()
{
  
	
 return vehicles.toString();	
}
}