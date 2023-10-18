package com.divisosoft.schoolproject;
public class Teacher
{
	private String name;
	private int age;
	private String gender;
	private String subject;
	
	public String getName()
	{
		return name ;
	}
	public void setName(String a)
	{
		this.name = a ;
	}
	
	public int getAge()
	{
		return age ;
	}
	public void setAge(int a)
	{
		this.age = a ;
	}
	
	public String getGender()
	{
		return gender ;
	}
	public void setGender(String b)
	{
		this.gender = b ;
	}
	
	public String getSubject()
	{
		return subject ;
	}
	public void setSubject(String c)
	{
		this.subject = c ;
	}
	
	void printTeacherDetails()
	{
		System.out.println("Teacher Name : "+getName());
		System.out.println("Age          : "+getAge());
		System.out.println("Gender       : "+getGender());
		System.out.println("Subject      : "+getSubject()+"\n");
		
	}
}