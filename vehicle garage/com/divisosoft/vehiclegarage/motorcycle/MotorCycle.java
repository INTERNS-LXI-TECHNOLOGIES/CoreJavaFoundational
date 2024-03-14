package com.divisosoft.vehiclegarage.motorcycle;
import com.divisosoft.vehiclegarage.vehicle.Vehicle;



public class MotorCycle extends Vehicle{
private boolean isGeared;

public boolean getIsgeared(){
	
	return isGeared;
}

public void setIsgeared(boolean isGeared){
	
	this.isGeared=isGeared;
}

public void checkIsGeared(){
	int x=(int)(Math.random()*5);
	if(x%2==0){
		isGeared=true;
	}
	else
	{
		isGeared=false;
	}
}

public String toString(){

return "\n"+"BIKE BRANDNAME IS:"+super.getName()+"\n"+"BIKE regno is:"+getRegno()+"\n"+"BIKE color is:"+getColor()+"\n"+isGeared;
	

}

}