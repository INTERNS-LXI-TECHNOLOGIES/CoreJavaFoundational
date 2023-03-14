package com.lxisoft.child;
import com.lxisoft.info.Vehicle;


public class  Car extends Vehicle 
{
private String brand;

public String getBrand()
    {
	  return brand;
    }
    public void setBrand(String brand)
        {
	      this.brand = brand;
		}

public String toString()
{
	
return "Brand:" + brand + "\n"+
        super.toString();	
	
}	
	
}