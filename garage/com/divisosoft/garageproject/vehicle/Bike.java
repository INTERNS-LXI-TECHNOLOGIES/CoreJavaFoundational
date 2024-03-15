package com.divisosoft.garageproject.vehicle;
import com.divisosoft.garageproject.vehicle.*;

public class Bike extends Vehicle{
private boolean isGeared;
public void setIsGeared(boolean isGeared){
	this.isGeared=isGeared;
}
public boolean getIsGeared(){
	return isGeared;

}
 public boolean bikeDetails() {
	 
     int x = (int)(Math.random()*5);   
        if (x % 2 == 0) {
         isGeared=true;
        } else if(x % 2 == 1) {
        isGeared=false;
        }
		return isGeared;
    }
	
public String toString(){
	return "\n"+isGeared;
}
public boolean bikeType(){
	if(isGeared==true){
		System.out.println("This Bike is Geared");
	}
	else if(isGeared==false){
		System.out.println("This Bike is not Geared");
	}
	return isGeared;
}



}
