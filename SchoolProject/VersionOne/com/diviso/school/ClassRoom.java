package com.diviso.school;
public class ClassRoom
{
	String division;
	int benchSize;
	Teacher[] teachers=new Teacher[5];
	Student[] students=new Student[5];
	void printClassRoomDetails()
  {
    System.out.println("division" + division);
    System.out.println("benchSize" + benchSize);

   }
}