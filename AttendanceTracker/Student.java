import java.util.Scanner;
public class Student
{
String studentName;
String studentId;
String studentGender;

Month[] months = new Month[12];

public Student(){
	
	this.studentName ="";
	this.studentId = "";
	this.studentGender = "";

	for(int i=0; i<months.length; i++)
	{
		months[i] = new Month();
	}
	
}

public Student(String studentName , String studentId, String studentGender)
{
	
	this.studentName = studentName;
	this.studentId = studentId;
	this.studentGender = studentGender;

	for(int i=0; i<months.length; i++)
	{
		months[i] = new Month();
	}
}
	
public String toString()
{
String returnValue = "";

returnValue = returnValue + "Student Name:" + studentName;
returnValue = returnValue + "Student ID" + studentId;
returnValue = returnValue + "Student Gender:" + studentGender;
for(int i = 0; i<11; i++)
{
returnValue = returnValue + "Month" + i + months[i];
}
return returnValue;
}
}
