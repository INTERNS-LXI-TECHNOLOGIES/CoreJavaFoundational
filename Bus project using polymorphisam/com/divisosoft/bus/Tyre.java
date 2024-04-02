package com.divisosoft.bus;
public class Tyre extends Part{

int weight;

public Tyre(int Weight,String brandName,String colour){
	
	super(colour,brandName);
	this.weight=weight;
}

public Tyre(){};



public String toString(){
	
	return ""+weight+super.toString();
}


public int addSum(int x,int y,int z,int a){
	
	return x+y+z+a;
}

}