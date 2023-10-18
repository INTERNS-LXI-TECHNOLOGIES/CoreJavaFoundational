package com.divisosoft.schoolproject;
public class Student 
{
	private String name ;
	private int age ;
	
	public String getName()
	{
		return name ;
	}
	public void setName(String a)
	{
		this.name= a;
	}
	
	public int getAge()
	{
		return age ;
	}
	public void setAge(int a)
	{
		this.age = a ;
	}
	
	void printStudentDetails()
	{

		System.out.println("Student Name : "+getName());
		System.out.println("Age          : "+getAge()+"\n");
	}		
}