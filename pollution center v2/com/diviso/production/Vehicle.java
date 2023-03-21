package com.diviso.production;
import java.util.*;
public class Vehicle{
	
	private String registerNumber;
	private String type;
	private String passenger;
	private List<VehicleInfo> info = new ArrayList<VehicleInfo>();
	boolean response = false;
	
	public String getRegno()
	{
	  return registerNumber;
	}
	
	public void setRegno(String registerNumber)
	{
		this.registerNumber = registerNumber;
	}
	
	public String getType()
	{
	   return type;	
	}
	
	public void setType(String type)
	{
	  this.type = type; 	
    }
	
	public String getPassenger()
	{
		return passenger;
	}
	
	public void setPassenger(String passenger)
	{
		this.passenger = passenger;
	}
	
	public List<VehicleInfo> getInfo()
	{
	  return info;	
	}
	
	
	/*public Vehicle()
	{
		for(int i=0;i<10;i++)
		{
			info.add(i,new VehicleInfo());	
		}
	}*/
	
	
	public boolean equals(Object o)
	{
		
		if(o!=null&&o instanceof Vehicle)
		if(((Vehicle)o).getRegno().equals(this.registerNumber))
		{
		   response = true;
		}
		return response;
	}
	
	
	public String toString()
	{
		
		String details = "      Registeration Number :"+" "+registerNumber+"\n"+"      Type :"+" "+type+"\n"+"      Passengers :"+" "+passenger+"\n\n";
		//System.out.println(info.toString());
		
			
			details = details+info.toString();
			
		
		return details;
		
		
		
	}



}