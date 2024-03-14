package com.divisosoft.vehiclegarage.garage;
import com.divisosoft.vehiclegarage.vehicle.Vehicle;

import com.divisosoft.vehiclegarage.motorcycle.MotorCycle;
import com.divisosoft.vehiclegarage.car.Car;


public class Garage{

private String name;
private long phnno;
private String address;
public Vehicle[] vehicle=new Vehicle[10];

public String getName()
{
	return name;
	
}

public void setName(String name)
{
	this.name=name;
	
	
} 

public long getPhnno()
{
  return phnno;
	
}

public void setPhnno(long phnno)
{
	this.phnno=phnno;
	
	
} 

public String getAddress()
{
	return address;
	
}

public void setAddress(String address  )
{
	this.address=address;
	
	
} 
public void showCar(){
	String result="";
	for(int i=0;i<vehicle.length;i++){
		
if(vehicle[i] instanceof Car){
	
	if(((Car)vehicle[i]).getIsTaxi()==true)
	{
	
	result ="this is a taxi";
}
else{
	
	
	result="this is a private vehicle";
}
System.out.println("car name is:"+vehicle[i].getName()+"\n"+"car color is:"+vehicle[i].getColor()+"\n"+"car regno is:"+vehicle[i].getRegno()+"\n"+result);

}
} 

}


public void showMotorcycle(){
	String result="";
	for(int i=0;i<vehicle.length;i++){
		if(vehicle[i] instanceof MotorCycle){
			if(((MotorCycle)vehicle[i]).getIsgeared()==true)
			{
				result="this is a geared bike";
				
			}
			else{
				
				result="this is not geared bike";
			}
			
		
	System.out.println("motorcycle name is:"+vehicle[i].getName()+"\n"+"color is:"+vehicle[i].getColor()+"\n"+"reg no is:"+vehicle[i].getRegno()+"\n"+result);
	}
}
}
public String toString()
{
	String result="";
	
for(int i=0;i<vehicle.length;i++)
{
	result+=vehicle[i];
}
return "Garage name is:"+name+"\n"+"Garage location is:"+address+"\n"+"Garage phoneno is:"+phnno+"\n"+result;
	
	
}


}
