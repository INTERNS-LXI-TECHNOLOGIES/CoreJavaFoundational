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
  String a = "";

for(Vehicle vehicle:vehicles)
{

if(vehicle != null)
{
	
	
if(vehicle instanceof Bike)
{

 a=a+"\t  <<<Bike Details>>>  \n"+vehicle;	
}

else if(vehicle instanceof Car)
{	

 a=a+"\t  <<<Car Details>>>  \n"+vehicle;	
}


else if(vehicle instanceof Lorry)
{	
a=a+"\t  <<<Lorry Details>>>  \n"+vehicle;	
}


}
	
}

	
 return a;
}	
}