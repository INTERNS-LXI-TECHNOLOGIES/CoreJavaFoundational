import java.util.Scanner;
public class Student
{
String studentName;
String registrationNumber;



static void markYourAttendance()
{
Month[] months = new Month[12];
	
Scanner s = new Scanner(System.in);

System.out.println(" Mark your Attendance");
String attendance = s.nextLine();

for(int i=0; i<6; i++)
{
System.out.println(" Enter Name");
String studentName = s.nextLine();
System.out.println("Enter Registration Number");
String registrationNumber = s.nextLine();
int regNo = Integer.parseInt(registrationNumber);

System.out.println("Enter Month");
//school.classRoom.student[0].month[0] = s.nextLine();
//int mnth = Integer.parseInt(months[0]);

System.out.println("Enter Day");
//school.classRoom.student[0].day[0] = s.nextLine();
//int d = Integer.parseInt(days);
school.classRoom.student[0].month[0].day[0].present = true;

boolean programContinue = true ;
while(programContinue)
{
System.out.println("Do you want to continue");
String c = s.nextLine();

if(c.equals("n"))
{
programContinue = false;
}
}
}
}
}