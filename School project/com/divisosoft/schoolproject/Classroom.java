package com.divisosoft.schoolproject;
public class Classroom
{
	private String name ;
	private String division ;
	
	private Teacher teacher ;
	private Student[] student = new Student[9];
	
	public String getName()
	{
		return name ;
	}
	public void setName(String a)
	{
		this.name = a ;
	}
	
	public String getDivision()
	{
		return division ;
	}
	public void setDivision(String b)
	{
		this.division = b ;
	}
	
	public Teacher getTeacher()
	{
		return teacher ;
	}
	public void setTeacher(Teacher a)
	{
		this.teacher = a ;
	}
	
	public Student[] getStudent()
	{
		return student ;
	}
	public void setStudent(Student[] a)
	{
		this.student = a ;
	}
	
	
	void printClassroomDetails()
	{
		System.out.println("Room no  : "+getName());
		System.out.println("Division : "+getDivision()+"\n");	
	}
	
}