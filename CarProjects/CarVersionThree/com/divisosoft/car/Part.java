package com.divisosoft.car;
public class Part
{
private String name;
private String colour;
private int number;


public void setname(String name)
{
	this.name=name;
}
public String getname()
{
	return name;
}
public void setcolour(String colour)
{
	this.colour = colour;
}
public String getcolour()
{
	return colour;
}
public void setnumber(int number)
{
	this.number = number;
}
public int getnumber()
{
	return number;
}
public void printpart()
{
	System.out.println(name + colour+ number);
}
public String toString()
{
	String a=name;
	a=a+colour;
	a=a+number;
	return a;
}
}