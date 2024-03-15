package com.divisosoft.garageproject.vehicle;
import com.divisosoft.garageproject.vehicle.*;

public class Car extends Vehicle{
private boolean isTaxi;

public void setIsTaxi(boolean isTaxi){
	this.isTaxi=isTaxi;
}
public boolean getIsTaxi(){
	return isTaxi;

}
 public boolean carDetails() {
	 
     int x = (int)(Math.random()*5);   
        if (x % 2 == 0) {
         isTaxi=true;
        } else if(x % 2 == 1) {
        isTaxi=false;
        }
		return isTaxi;
    }
	
public String toString(){
	return "\n"+isTaxi;
}
public boolean carType(){
	if(isTaxi==true){
		System.out.println("This car is Taxi");
	}
	else if(isTaxi==false){
		System.out.println("This car is not Taxi");
	}
	return isTaxi;
}


}