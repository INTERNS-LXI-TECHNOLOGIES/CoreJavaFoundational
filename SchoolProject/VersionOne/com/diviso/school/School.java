package com.diviso.school;
public class School
{
    String name;
    String address;
    int phoneNumber;
    ClassRoom[] classrooms = new ClassRoom[5];
    Canteen[] canteens = new Canteen[2];
	PlayGround playGround;
	public School()
	{
		
	}
	
    void printSchoolDetails()
  {
	System.out.println("SchoolName : " + name);
	System.out.println("address : " + address);
	System.out.println("phoneNumber : " + phoneNumber);  
  }
}