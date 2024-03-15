package com.divisosoft.vehiclegarage.vehicle;
import com.divisosoft.vehiclegarage.vehicle.*;
 
public class MotorCycle extends Vehicle{

private boolean isGear;



public void setGear(boolean gear){
	this.isGear=gear;
}

public boolean getGear(){
	return this.isGear;
}
 public boolean bikeDetails(){
	int x =(int)(Math.random()*5);
	 if(x%2==0){
	     isGear=true;
	     System.out.println("This motorcycle is Geared");
	 
	}
     else if(x%2==1){
	     isGear=false;
	     System.out.println("This motorcycle is not Geared");
	 
	}
	return isGear;
}

public String toString(){
	return "\n"+super.getBrand()+"\n"+super.getModel()+"\n"+super.getColor();
}
 

public boolean bikeType(){
	if(isGear==true){
		System.out.println("This car is a geared motorcycle"); 
	}else if(isGear==false){
		System.out.println("This car is not a geared motorcycle");
	}
	return isGear;
}
  















}