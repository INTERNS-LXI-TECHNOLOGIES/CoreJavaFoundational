package com.divisosoft.supermarket.market;

public class Female extends Employ{

private int salary;
private int age;
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

public void setAge(int age){
	
	this.age= age;
}

public int getAge(){
	
	return this.age;
}

public String toString(){
	
	return femaleemployname+age+salary+jobname;
}




}



