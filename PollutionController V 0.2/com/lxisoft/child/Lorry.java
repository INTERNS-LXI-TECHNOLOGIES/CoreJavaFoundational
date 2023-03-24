package com.lxisoft.child;
import com.lxisoft.info.Vehicle;



public class  Lorry extends Vehicle 
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
	
return "\t  <<<Lorry Details>>>  \n" + "Lorry Brand:" + brand + "\n"+                                                                                                                                                                                                                                                                                                                                                           
        super.toString();	
	
}

	
}