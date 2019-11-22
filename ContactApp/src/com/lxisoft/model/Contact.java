package com.lxisoft.model;
import com.lxisoft.view.*;
import com.lxisoft.controller.*;
import java.util.Scanner;
import com.lxisoft.test.*;

public class Contact implements Comparable <Contact>
{
	private String name,number;
	private int id;

	public void setName(String name)
	{
		this.name= name;
	}      
	public String getName()
	{
		return this.name;
	}
	public void setNumber(String number)
	{
		this.number= number; 
	}
	public String getNumber()
	{
		return this.number;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}
	public int compareTo(Contact c)
	{
		int z= this.getName().compareTo(c.getName());
		return z;
	}
}
