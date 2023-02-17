import java.util.Scanner;
public class Tdd
{
public static void main(String[] args)
{
School school = new School();

Scanner s = new Scanner(System.in);

boolean programContinue = true ;
while(programContinue)
{

System.out.println("---------WELCOME TO ATTENDANCE TRACKING SYSTEM----------");
System.out.println("______St Teresa's C.G.H.S.S Ernakulam_______");
System.out.println("Press 1 : Mark Your Attendance");
System.out.println("Press 2: Show Attendance Report");
System.out.println("Press 3: Quit");

String number = s.nextLine();
switch(number)
{


case "1":
Student student = new Student();
school.classRoom.students[0]=student;
student.markYourAttendance();


System.out.println("Enter Month");
school.classRoom.students[0].months[0] = s.nextLine();
int mnth = Integer.parseInt(school.classRoom.students[0].months[0]);

System.out.println("Enter Day");
school.classRoom.students[0].months[0].days[0] = s.nextLine();
int d = Integer.parseInt(day);
school.classRoom.students[0].months[0].days[0].present = true;
 break;


case "2":
Teacher teacher = new Teacher();
teacher.showAttendanceReport();
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
}


