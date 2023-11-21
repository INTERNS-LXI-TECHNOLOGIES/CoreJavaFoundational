package com.divisosoft.car;
public class Tyre extends Part 
{
   private int size;
   
	public void setSize(int size)
	{
		this.size = size;
	}

	public int getSize()
	{
		return size;
	}

	public String toString()
	{
	System.out.println("\t Tyre Details");
	String toSting = "Tyre Size is :"+size+"\nTyre model_No is : "+super.toString();
	return toSting;	
	}
}