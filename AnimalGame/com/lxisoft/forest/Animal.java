package com.lxisoft.forest;
import java.util.*;

public class Animal
{
 
 private String animalname;
 private int animalStrength;
private boolean isAlive;
public void setAnimalName(String arg)
{
	this.animalname=arg;

}

public String getAnimalName()
{
	return animalname;
}

public void setAnimalStrength(int str)
{
	this.animalStrength=str;
}
		 
public int getAnimalStrength()
{
	return animalStrength; 
}
public void setAlive(boolean a)
{
	isAlive=a;
}
public boolean getAlive()
{
	return isAlive;

}

}