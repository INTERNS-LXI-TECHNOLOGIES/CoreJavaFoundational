package com.divisosoft.bus;
public class Bus{
String colour;

Part[]part = new Part[8];

public String toString(){
	
	
	
String bus="";
bus=bus+colour+"";

	for(int i=0;i<part.length;i++){
		
		bus=bus+part[i];
	}
	
	return bus;
	
}


}

