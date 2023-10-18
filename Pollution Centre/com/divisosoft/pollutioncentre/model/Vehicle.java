package com.divisosoft.pollutioncentre.model;
public class Vehicle
{
	private String name ;
	private String regno ;

	public String getName()
	{
		return name ;
	}
	public void setName(String a)
	{
		this.name = a ;
	}
	
	public String getRegno()
	{
		return regno ;
	}
	public void setRegno(String b)
	{
		this.regno = b ;
	}
	
	public String toString()
	{
		String toString =name+" "+regno;
		return toString;
	}
	
	public boolean equals(Object obj)
	{
		Vehicle aa = (Vehicle)obj;
		
		if(this.regno.equals(aa.regno))
		{
			return true ;	
		}
		else
		{
			return false ;
		}	
	}		
	
}
