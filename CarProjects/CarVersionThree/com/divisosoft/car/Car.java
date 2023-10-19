package com.divisosoft.car;
public class Car //extends Object 
{
private String name;
private int modelNumber;
private Part[] parts = new Part[10];

public Car(String name,int RegisterNumber)   //CONCTRUCTOR Parameter Variable
{
	this.name = name;
	this.modelNumber = RegisterNumber;
	System.out.println("car details \n"+name+modelNumber);
}
public void setname(String a)
{
	this.name = a;
}
public String getname()
{
	return name;
}
public void setmodelNumber(int b)
{
	this.modelNumber = b;
}
public int getmodelNumber()
{
	return modelNumber;
}
public Part[] getpart()
{
	return parts;
}
public String toString()
{
	String toString=name+"\n"+modelNumber+"\n";
	for(int i = 0;i<10;i++)
	{
		toString=toString+"\n"+parts[i];
	}
	return toString;
}
}