package com.divisosoft.garageproject.vehicle;
import com.divisosoft.garageproject.garage.Vehicles;

public class Bike extends Vehicles{
private boolean isGeared;

public void setIsGeared(boolean isGeared){
	this.isGeared = isGeared;
}
public boolean getIsGeared(){
	return isGeared;
}

public void bikeDetail(){
	
	int x  = (int)(Math.random()*5);
		if(x%2==0){
			isGeared = true;
		}
		else{
			isGeared= false;
		}
	}
public String toString(){
	return ("\n")+super.getName()+super.getColour()+super.getRegnum()+""+isGeared;
}
	

}