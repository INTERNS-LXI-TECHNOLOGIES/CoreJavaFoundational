package com.lxisoft.info;



import java.util.*;
import java.text.*;

public class VehicleInfo
{
private String  date;
private String centerName;	
	
	public String getDate()
    {
	  return date;
    }
    public void setDate(String date)
        {
	      this.date=date;
		}
		
		
		public boolean equals(Object o){
	
	boolean found= false;
	if(o!=null&&o instanceof VehicleInfo)
	if(((VehicleInfo)o).getDate().equals(this.date)){
		found=true;
	}
		
	return found;
	
}
		
		
		
		
		
		
		
		
		
	
	
	public String getCenterName()
    {
	  return centerName;
    }
    public void setCenterName(String centerName)
        {
	      this.centerName=centerName;
		}
	public String toString()
	{
	
	return         "Date:" + date+ "\n" 
				 + "Center Name:" + centerName + "\n";
	
	}
	
}