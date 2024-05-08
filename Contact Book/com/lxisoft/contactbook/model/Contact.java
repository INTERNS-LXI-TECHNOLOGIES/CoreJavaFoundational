package com.lxisoft.contactbook.model;

public class Contact
{
	private String name;
	
	private long number;
	
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	
	
	
	
	public void setNumber(long number)
	{
		this.number=number;
	}
	
	
	public long getNumber()
	{
		return number;
	}
	
	
	public String toString()
	{
		return "\n\n NAME   : "+name+"\n NUMBER : "+number;
	}
	
	
	
	
}
	
	

