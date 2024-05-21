package com.lxisoft.garage;
public class Bike extends Vehicle {
	
	String modelname;
	
	boolean isgeared;
	
	public void bikeGeared(){
		
		int y=(int)(Math.random()*4);
		
		if(y%2==0){
			
			this.isgeared=true;
		}
		
		else{
			this.isgeared=false;
		}
	}
	
	public String toString(){
		
		return modelname;
	}
	
	
}