package com.lxisoft.School;
import java.util.Scanner;
import com.lxisoft.Classroom.Classroom;
public class School
{

Classroom classroom=new Classroom();

public void details()
{
Scanner scanner= new Scanner(System.in);

System.out.println("                     welcome       ");
System.out.println("---------------ASSISI Public School----------------");
System.out.println("School Director			: Fr.John Davis");
System.out.println("School Manager			: Mr.Samuel");
System.out.println("School Principal		: Ms.Helen Job");
System.out.println("School Vice -Principal		: Ms.Aneeta"+"\n");
System.out.println("Enter the Class details"+"\n");



//System.out.println("Enter the teacher name		:");
//classroom.teacher= scanner.next();
//System.out.println("\n"+"Enter the division		:");
//classroom.division=scanner.nextInt();
//System.out.println("\n"+"Enter the Student Details	:"+"\n");

}
public void printd()
{
classroom.setPrint1();
classroom.setPrint2();
classroom.getPrint2();
classroom.getPrint3();
classroom.topper1();
classroom.topper2();
classroom.topper3();
classroom.teacher(classroom.teacher);
}
}