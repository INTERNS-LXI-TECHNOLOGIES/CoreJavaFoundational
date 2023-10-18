package com.divisosoft.schoolproject;
public class Playground
{
	private String name ;
	private int cent ;
	
	public String getName()
	{
		return name ;
	}
	public void setName(String a)
	{
		this.name = a ;
	}
	
	public int getCent()
	{
		return cent ;
	}
	public void setCent(int a)
	{
		this.cent = a ;
	}
	
	void printPlaygroundDetails()
	{
		System.out.println("GROUND NAME : "+getName()); 
		System.out.println("CENT        : "+getCent()+"\n");
	}
}