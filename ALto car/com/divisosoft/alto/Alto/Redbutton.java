package com.divisosoft.alto.Alto;
public class Redbutton{

public String colour;

public boolean buttonpress; 

public void clickButton(){
	
	if(buttonpress){
		System.out.println("Headlight on");
	}
	else{
		
		System.out.println("Headlight off");
	}
	
}


public String toString(){
	
	return  "Car redbutton colour is\t:"+colour;
}
}