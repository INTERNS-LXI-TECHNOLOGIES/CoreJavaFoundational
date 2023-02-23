
import java.util.Scanner;

public class ViewController
{
int studentId;
int monthNumber;
int dayNumber;	
Scanner s = new Scanner(System.in);

School school = new School();
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

System.out.println("Do you want to continue");
String c = s.nextLine();
boolean programContinue = false ;
if(c.equals("n"))
{
 flag = false;
}
return flag;
}

 void enterSchoolDetails()
{
    System.out.println("Enter School Address");
	school.schoolAddress = s.nextLine();
}

 void enterClassRoomDetails()
{
	
	System.out.println("Enter Class Room Number");
	school.classRoom.classRoomNumber = s.nextLine();
	
}


 void showAttendanceReport()
{
	System.out.println("Enter Student ID");
    studentId =Integer.parseInt(s.nextLine());
    
	
	
    System.out.println("Enter Month");
    monthNumber =Integer.parseInt(s.nextLine());
	
	
	for(Day days:school.classRoom.students[studentId].months[monthNumber].days)
	{
		System.out.println(days.present);
		
		
	}
	
   
}

 void enterStudentDetails()
 
{
	while(flag){
	
	System.out.println("Enter Student Name");
	String studentName = s.nextLine();
	
	System.out.println("Enter Student gender");
	String studentGender = s.nextLine();
	flag=quit();
}
}

 void markYourAttendance()
{
	System.out.println("Enter Student ID");
    studentId =Integer.parseInt(s.nextLine());
    
	
	
    System.out.println("Enter Month");
    monthNumber =Integer.parseInt(s.nextLine());


    System.out.println("Enter Day");
    dayNumber = Integer.parseInt(s.nextLine());
	
  school.classRoom.students[studentId].months[monthNumber].days[dayNumber].present = true;	
}
























}
