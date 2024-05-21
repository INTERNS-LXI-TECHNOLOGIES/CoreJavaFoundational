package com.lxisoft.garage;
public class Car extends Vehicle{
String carcolour;


boolean istaxi;

public void  carTaxy(){
	
	int x=(int)(Math.random()*3);
    if(x%2==0){
		this.istaxi=true;
	}
	else{
		this.istaxi=false;
	}
	

}

public String toString(){
	
	return carcolour;
}

}