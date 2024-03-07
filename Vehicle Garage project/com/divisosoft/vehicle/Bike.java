package com.divisosoft.vehicle;
public class Bike extends Vehicle{

String colour;
int numberofmirror;
boolean isgeared;
public void Bikegear(){
	
	int y=(int)(Math.random()*3);
	
	if(y%2==0){
		
		isgeared=true;
	}
	
	else{
		
		isgeared=false;
	}
}

}