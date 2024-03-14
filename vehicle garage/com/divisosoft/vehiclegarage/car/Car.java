package com.divisosoft.vehiclegarage.car;
import com.divisosoft.vehiclegarage.vehicle.Vehicle;


public class Car extends Vehicle{
private boolean isTaxi;

public boolean getIsTaxi(){
	return isTaxi;
}

public void setIsTaxi(boolean isTaxi){
	this.isTaxi=isTaxi;
}

public void checkIsTaxi(){
	int a=(int)(Math.random()*5);
	if(a%2==0)
	{
		isTaxi=true;
	}
	else 
	{
		
		isTaxi=false;
	}
		
}
	


public String toString(){
	return "\n"+"car brandname is:"+super.getName()+"\n"+"car regno is:"+getRegno()+"\n"+"car color is:"+getColor()+"\n"+isTaxi;
	
}
}