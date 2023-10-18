package com.divisosoft.schoolproject;
public class School
{
	private String name ;
	private String address ;
	private int telephone ;
	
	private Playground ground ;
	private Classroom[] classroom = new Classroom[7];
	
	public String getName()
	{
		return name ;
	}
	public void setName(String a)
	{
		this.name = a ;
	}
	
	public String getAddress()
	{
		return address ;
	}
	public void setAddress(String b)
	{
		this.address = b ;
	}
	
	public int getTelephone()
	{
		return telephone ;
	}
	public void setTelephone(int a)
	{
		this.telephone = a ;
	}
	
	public Playground getGround()
	{
		return ground ;
	}
	public void setGround(Playground a)
	{
		this.ground = a ;
	}
	
	public Classroom[] getClassroom()
	{
		return classroom ;
	}
	public void setClassroom(Classroom[] a)
	{
		this.classroom = a ;
	}
	
	void printSchoolDetails()
	{
		System.out.println("SCHOOL NAME   : "+getName());
		System.out.println("ADDRESS       : "+getAddress());
		System.out.println("TELEPHONE     : "+getTelephone()+"\n");
	}
	
}