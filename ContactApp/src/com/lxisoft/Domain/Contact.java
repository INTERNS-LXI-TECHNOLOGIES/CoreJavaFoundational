package com.lxisoft.Domain;

public class Contact
{
	private int id;
	private String name;
	private String phno;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setNo(String phno)
	{
		this.phno=phno;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public String getNo()
	{
		return phno;
	}
	public int getId()
	{
		return id;
	}
	public boolean equals(Contact c)
	{
			if(this.name=c.name)
				return true;

			else return false;

	}
}