package com.divisosoft.car;
public class Car
{
String ownerName;
String initial;
String carColour;
int chassisNumber;

Door[] door = new Door[4];
Tyre[] tyre = new Tyre[4];
Steering steering;

public void printMethod()
{
System.out.println("OWNER NAME : "+ownerName);	
System.out.println("OWNER INITIAL : "+initial);
System.out.println("CAR COLOUR : "+carColour);
System.out.println("CHASSIS NUMBER : "+chassisNumber+"\n");
}
}
