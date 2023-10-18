package com.diviso.school;
public class Main
{
	public static void main(String[]args)
	{
		
		School school = new School();
		school.name = "fazil";
		school.address = "gcgege";
		school.phoneNumber = 122432443;
		school.printSchoolDetails();
		
		System.out.println("\t\t"+"---------------ClassRoom Details----------------");
		
		for(int i=0;i<4;i++)
		{
		school.classrooms[i]= new ClassRoom();
		school.classrooms[i].division = "firstclass"+i;
		school.classrooms[i].benchSize = 1000+i;
		school.classrooms[i].printClassRoomDetails();
		}
		
		System.out.println("\t\t"+"-------------Teacher Details------------");
		
		for(int i=0;i<4;i++)
		{
		school.classrooms[i].teachers[i]= new Teacher();
		school.classrooms[i].teachers[i].name="akshaya"+i;
		school.classrooms[i].teachers[i].subject="maths"+i;
		school.classrooms[i].teachers[i].age=22+i;
		school.classrooms[i].teachers[i].printTeacherDetails();
		}
		
		System.out.println("\t\t"+"---------------Students Details-----------------");
		
		for(int i=0;i<4;i++)
		{
		school.classrooms[i].students[i] = new Student();
		school.classrooms[i].students[i].name = "athul"+i;
		school.classrooms[i].students[i].age = 25+i;
		school.classrooms[i].students[i].rollNumber = 2+i;
		school.classrooms[i].students[i].printStudentDetails();
		}
		
		System.out.println("\t\t"+"-------------Canteen Details-------------");
		
		for(int i=0;i<1;i++)
		{
		school.canteens[i] = new Canteen();
		school.canteens[i].name ="boss"+i;
		school.canteens[i].phoneNumber = 12344566+i;
		school.canteens[i]. printCanteenDetails();
		}
		
	school.playGround = new PlayGround();
		school.playGround.name = "jjjs";
		school.playGround.cent = 1233;
		school.playGround.coachName = "vasu";
		school.playGround.printPlayGroundDetails();
	}
	
	
	
	
	
	
}