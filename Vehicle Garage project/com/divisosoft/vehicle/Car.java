package com.divisosoft.vehicle;
public class Car extends Vehicle{
	
String colour;
int numberoftyre;
boolean istaxi;





public void carTaxi() {
int x=(int)(Math.random()*3);

if(x%2==0){
	
	this.istaxi=true;
}
else{
	this.istaxi=false;
}


}
}