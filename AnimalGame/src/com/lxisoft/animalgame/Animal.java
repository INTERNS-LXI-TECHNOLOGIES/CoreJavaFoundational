package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
import  java.lang.Math;

public abstract class Animal
{
	int strength;
	public String name;
	boolean isDead;
	int xCordinate,yCordinate;
	int range;
	int forsight;

 	public void getDetails()
	{
		System.out.print("\t" + name + "\t\tStrength= " + strength +"\tDefault location: "+xCordinate+"  "+yCordinate+" ");	
	}

}