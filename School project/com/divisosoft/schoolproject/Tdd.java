package com.divisosoft.schoolproject;
public class Tdd
{
	public static void main(String[] args)
	{
		School school = new School();
		
		System.out.println("\t"+"SCHOOL DETAILS"+"\n"); 
		
		school.setName ("A.U.P. SCHOOL");
		school.setAddress ("PATHIRIPALA");
		school.setTelephone (0466324565);
		
		school.printSchoolDetails();
		
		school.setGround(new Playground());
		
		System.out.println("\t"+"GROUND DETAILS"+"\n");
		
		school.getGround().setName("CAMP NOU");
		school.getGround().setCent(50);
		
		school.getGround().printPlaygroundDetails();
		
		for(int i = 0;i<5;i++)
		{
			
		System.out.println("\t"+"DIVISION DETAILS"+"\n");
		
		school.getClassroom()[i]= new Classroom();
		
		school.getClassroom()[i].setName("Room ");
		school.getClassroom()[i].setDivision("Division "+i);
		school.getClassroom()[i].printClassroomDetails();
		
			for(int j = 1;j<=1;j++)
			{
			school.getClassroom()[i].setTeacher(new Teacher());
		
			System.out.println("\t"+"TEACHER DETAILS"+"\n");
		
			school.getClassroom()[i].getTeacher().setName("Anita "+i);
			school.getClassroom()[i].getTeacher().setAge(36 +i);
			school.getClassroom()[i].getTeacher().setGender("Female");
			school.getClassroom()[i].getTeacher().setSubject("English");
		
			school.getClassroom()[i].getTeacher().printTeacherDetails();
			}
			System.out.println("\t"+"STUDENT DETAILS"+"\n");
		
			for(int a = 1;a<=5;a++)
			{
			school.getClassroom()[i].getStudent()[a] = new Student();
			
			school.getClassroom()[i].getStudent()[a].setName("Tintu "+a);
			school.getClassroom()[i].getStudent()[a].setAge(5 +a);
		
			school.getClassroom()[i].getStudent()[a].printStudentDetails() ;
			
			}
		}
		
		
	}
}