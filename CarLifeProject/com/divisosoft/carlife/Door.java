package com.divisosoft.carlife;
public class Door extends Parts{
	private double doorLife;

public double  getDlife(){
	return doorLife;
}
public void setDlife(double doorLife){
	this.doorLife=doorLife;
}

public String toString(){
	String toString ="";
	toString=toString+doorLife;
	return toString;
}
}