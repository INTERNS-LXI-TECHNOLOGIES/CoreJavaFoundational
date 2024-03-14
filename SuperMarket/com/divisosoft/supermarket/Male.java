package com.divisosoft.supermarket;
public class Male extends Employ{
 

private int salary;
private  String maleemployname;
private int  age;

public void setAge(int Age){
	this.age= age;
	
}

public int getAge(){
	
	return this.age;
}


public void setSalary(int salary){
	
	this.salary= salary;

}

public int getSalary(){
	
	return this.salary;
}

public void setMalename(String  maleemployname){
	this.maleemployname = maleemployname;
}

public String getMalename(){
	
	return maleemployname;
}

public String toString(){
	
	return salary+maleemployname;
}

}
