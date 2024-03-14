package com.divisosoft.supermarket;
public class Female extends Employ{

private int salary;

private  String femaleemployname;

public void setfemalesalary(int salary){
	
	this.salary =salary;
}

public int getSalary(){
	
	return this.salary;
}


public void setfemalename(String femaleemployname){
	
	this.femaleemployname=femaleemployname;
}

public String getfemalename(){
	
	return this.femaleemployname;
}


public String toString(){
	
	return salary+"\n"+femaleemployname;
}



}



