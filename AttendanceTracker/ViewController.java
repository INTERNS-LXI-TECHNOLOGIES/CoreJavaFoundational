
import java.util.Scanner;

public class ViewController
{
int studentId;
int monthNumber;
int dayNumber;	
Scanner s = new Scanner(System.in);
School school = new School();

public int getStudentId()
{
return studentId;
}
public void setStudentId(int studentId)
{
this.studentId = studentId;	
}

public int getMonthNumber()
{
return monthNumber;	
}
public void setMonthNumber(int monthNumber)
{
this.monthNumber = monthNumber;	
}

public int getDayNumber()
{
return dayNumber;	
}
public void setDayNumber(int dayNumber)
{
this.dayNumber = dayNumber;
}



 boolean flag = true;
boolean programContinue = true;
public void viewThings(){
while(programContinue)
{

System.out.println("---------WELCOME TO ATTENDANCE TRACKING SYSTEM----------");
System.out.println("______St Teresa's C.G.H.S.S Ernakulam_______");
System.out.println("Press 1: Enter Student Details");
System.out.println("Press 2: Mark Your Attendance");
System.out.println("Press 3: Show Attendance Report");
System.out.println("Press 4: Quit");

String number = s.nextLine();
switch(number)
{
case "1":
enterStudentDetails();
break;	
	
case "2":
markYourAttendance();
break;


case "3":
showAttendanceReport();
break;


case "4":
System.out.println("Quit");
programContinue = false; 
break;


default:
System.out.println("Invalid");
programContinue = quit();
}

}
}

public boolean quit()
{

System.out.println("Do you want to continue? Press 'y' to continue, 'n' to exit");
String c = s.nextLine();
boolean programContinue = false ;
if(c.equals("n"))
{
 flag = false;
}
return flag;
}
 //setMonthNumber

 void enterSchoolDetails()
{
    System.out.println("Enter School Address");
	school.setSchoolAddress(s.nextLine());
}

 void enterClassRoomDetails()
{
	
	System.out.println("Enter Class Room Number");
	school.getClassRoom().setClassRoomNumber(s.nextLine());
	
}


 void showAttendanceReport()
{
	System.out.println("Enter Student ID");
     setStudentId(Integer.parseInt(s.nextLine()));
    
	
	
    System.out.println("Enter Month");
    setMonthNumber(Integer.parseInt(s.nextLine()));
	
	
	for(Day days:school.getClassRoom().getStudents()[studentId].getMonths()[monthNumber].getDays())
	{
		System.out.println(days.getPresent());
		
		
	}
	
   
}

 void enterStudentDetails()
 
{
	while(flag){

	System.out.println("Enter Student ID");
    setStudentId(Integer.parseInt(s.nextLine()));
	
	
	System.out.println("Enter Student Name");
	String setStudentName = s.nextLine();
	
	System.out.println("Enter Student gender");
	String setStudentGender = s.nextLine();
	flag=quit();
}
}

 void markYourAttendance()
{
	System.out.println("Enter Student ID");
    setStudentId(Integer.parseInt(s.nextLine()));
    
	
	
    System.out.println("Enter Month");
    setMonthNumber(Integer.parseInt(s.nextLine()));


    System.out.println("Enter Day");
    setDayNumber(Integer.parseInt(s.nextLine()));
	
  school.getClassRoom().getStudents()[studentId].getMonths()[monthNumber].getDays()[dayNumber].setPresent(true);	
}
}
