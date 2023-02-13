import java.util.Scanner;
public class Tdd
{
public static void main(String[] args)
{

System.out.println("---------WELCOME TO ATTENDANCE TRACKING SYSTEM----------");
System.out.println("Press 1 : Mark your attendance");
System.out.println("Press 2: Show attendance report");
System.out.println("Press 3: Quit");

Scanner s = new Scanner(System.in);

boolean programContinue = true ;
while(programContinue)
{

String number= s.nextLine();
switch(number)
{


case "1":
 markYourAttendance();
break;


case "2":
 showAttendanceReport();
break;


case "3":
System.out.println("Quit");
programContinue = false; 
break;


default:
System.out.println("Invalid");

}
}
}
 static void markYourAttendance()
{
System.out.println("Mark your attendance");
}

 static void showAttendanceReport()
{
System.out.println("Show attendance report");
}
}

