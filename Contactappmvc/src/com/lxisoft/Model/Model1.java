package com.lxisoft.Model;
import com.lxisoft.Controller.Controller;
public class Model1
{   
	private int id;
	private String name;

	public void setName(String n)
	{
     this.name=n;
	}
	public String getName()
	{
      return this.name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
}