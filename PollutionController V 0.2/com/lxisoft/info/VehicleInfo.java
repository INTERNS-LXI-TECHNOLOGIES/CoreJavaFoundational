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
	
	return         "\n Date:" + date+ "\n" 
				 + "Center Name:" + centerName + "\n";
	
	}
	
}