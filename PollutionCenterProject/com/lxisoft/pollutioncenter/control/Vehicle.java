package com.lxisoft.pollutioncenter.control;
public class Vehicle
{
private String ownerName;
private String registerNumber;
private String phoneNumber;

public void setOwnerName(String ownerName)
{
	this.ownerName = ownerName;
}

public String getOwnerName()
{
  return ownerName;	
}

public void setRegisterNumber(String registerNumber)
{
	this.registerNumber = registerNumber;
}
public String getRegisterNumber()
{
	return registerNumber;
}

public void setPhoneNumber(String phoneNumber)
{
	this.phoneNumber = phoneNumber;
}

public String getPhoneNumber()
{
	return phoneNumber;	
}

		public boolean equals(Object ob)
		{
			if(ob instanceof Vehicle)
			{
				Vehicle cc = (Vehicle) ob;
					if(this.registerNumber.equals(cc.registerNumber))
					{
						return true;
					}
				else
				{
				//System.out.println("not same referance");
				}				
			}
			else
			{
			System.out.println("this is not instanceof Vehicle");	
			}
			 return false;
		}


public String toString()
{
	String toString="";
	toString = 	ownerName+""+registerNumber+""+phoneNumber;
	return toString;
	
}
}