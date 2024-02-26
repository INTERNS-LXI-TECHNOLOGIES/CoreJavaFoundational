package com.divisosoft.alto.Alto;
public class Door{
	
public String doorName;

public String number;

public boolean engindoor;


public void doorOpen(){
	if(engindoor){
		System.out.println("Door is closed");
	}
	
	else{
		System.out.println("Door is open");
	}
}

public String toString(){
	
	return "Door number is\t:"+number+"\n"+doorName+"\n";
}




}