import java.util.*;
public class Standard
{
	int cls_No;
	
	String classTopper;
	
	float topMarks;
	
	Scanner sc=new Scanner(System.in);
	
	Teacher t=new Teacher();          //Teacher object to access name of the teacher,topper method and to check pass or fail
	
	Student s=new Student();  
	
	Student stdnt[]=new Student[3];
	
public void initialize()
{
	stdnt[0] =new Student();	
	stdnt[1] =new Student();	
	stdnt[2] =new Student();
}	
		
public void setStandard()     //to set Standard in which student studies
{
System.out.println("Enter the Standard in which student is studying ");
cls_No=sc.nextInt();
System.out.println("Student is studying in "+cls_No);
}

	public void setStudent()       // to set studentname,marks
	{
		initialize();
		
		stdnt[0].setName();
		stdnt[0].setMarks();
		
		stdnt[1].setName();
		stdnt[1].setMarks();
		
		stdnt[2].setName();
		stdnt[2].setMarks();
		
	}
	
	public void displayStandard()     //to display teachername,total marks of the student and check whether each student is pass or fail
	{
		t.teacherName();
		
		stdnt[0].displayStudentMarks(stdnt[0]);
		stdnt[0].totalMarks();	
		t.checkPassOrFail(stdnt[0]);
		
		stdnt[1].displayStudentMarks(stdnt[1]);
		stdnt[1].totalMarks();	
		t.checkPassOrFail(stdnt[1]);
		
		
		stdnt[2].displayStudentMarks(stdnt[2]);
		stdnt[2].totalMarks();	
		t.checkPassOrFail(stdnt[2]);
	}
	
	public void classTopperCheck()  //to print class topper
	{	
	    classTopper=t.topper(stdnt);
		topMarks=t.topperMarks;
		System.out.println("Topper of the class "+cls_No+" is "+classTopper+" with marks "+topMarks);	
	}
	
}