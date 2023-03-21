package com.diviso.production;
import java.util.*;
import java.text.*;
public class VehicleInfo{

    private String centreName;
	private String date;
	boolean response = false;
	
	public String getCentreName()
	{
		return centreName;
	}
	
	public void setCentreName(String centreName)
	{
		this.centreName = centreName;
	}
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public boolean equals(Object o)
	{
		
		if(o!=null&&o instanceof VehicleInfo)
		if(((VehicleInfo)o).getDate().equals(this.date))
		{
		   response = true;
		}
		return response;
	}



public String toString(){
	
	return "      Center Name :" + centreName+"\n" + "      Updated Date : " + date + "\n";
	
}

}