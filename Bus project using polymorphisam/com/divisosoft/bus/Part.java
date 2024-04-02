package com.divisosoft.bus;
public class Part{

String colour;

String brandName;


public Part(String colour,String brandName){
	
	this.brandName=brandName;
	this.colour=colour;
	
	
}
public Part(){};


public String toString(){
	
	return colour+brandName;
}



public int addSum(int x,int y){
	
	return x+y;
}



}