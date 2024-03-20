package com.divisosoft.garageproject.vehicle;
import com.divisosoft.garageproject.garage.Vehicles;

public class Car extends Vehicles{
private boolean isTaxi;

public void setIsTaxi(boolean isTaxi){
	this.isTaxi = isTaxi;
}
public boolean getIsTaxi(){
	return isTaxi;
}
	
public void carDetail(){
	
	int x  = (int)(Math.random()*5);
		if(x%2==0){
			isTaxi = true;
		}
		else{
			isTaxi = false;
		}
}

public String toString(){
	return ("\n")+super.getName()+super.getColour()+super.getRegnum()+""+isTaxi;
}
}