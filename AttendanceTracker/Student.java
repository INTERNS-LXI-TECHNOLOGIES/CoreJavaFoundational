import java.util.Scanner;
public class Student
{
String studentName;
String studentId;
String studentGender;

Month[] months = new Month[12];

public String getStudentName()
{
return studentName;
}
public void setStudentName(String setStudentName)
{
this.studentName = studentName;
}

public String getStudentId()
{
return studentId;
}
public void setStudentId(String studentId)
{
this.studentId = studentId;
}

public String getStudentGender()
{
return studentGender;	
}
public void getStudentGender(String studentGender)
{
this.studentGender = studentGender;	
}

public Month[] getMonths()
{
return months;	
}
public void setMonths(Month[] months)
{
this.months = months;
}


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
for(int i = 0; i<months.length; i++)
{
returnValue = returnValue + "Month" + i + months[i];
}
return returnValue;
}
}
