package com.divisosoft.bike;
public class Bike{
	
	String model;
	
	String colour;
	
	Seat seat;
	
	Tyre tyre;
	
	Engine engine;
	
	Battery battery;
	
	Mirror mirror;
	
	Speedmeter speedmeter;
	
	Fueltank fueltank;
	
	Signal signal;
	
	Wheal wheal;
	
	Breakes breaks;
	
	public String toString(){
		
		return "Bike model name is\t:"+model+"\n"+"Bike of colour is \t:"+colour+"\n"+signal+"\n"+speedmeter;
	}

	
	
}