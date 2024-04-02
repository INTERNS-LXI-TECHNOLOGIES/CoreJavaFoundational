package com.divisosoft.bus;
public class Door extends Part{

int length;

public Door(String brandName,String colour,int length){
	
	super(brandName,colour);
	this.length=length;
	
}

public Door(){};

public String String(){
	
	return  ""+length+super.toString();
}

public int addSum(int x,int y,int z){
	
	return x+y+z;
}

}