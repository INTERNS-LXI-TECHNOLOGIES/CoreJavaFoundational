public class Tdd
{
	public static void main(String...args)
	{
		School school=new School();
		
		school.setName("SADANAM");
		school.setLocation("Pathirippala");
		school.setNumber("6547383209");
		
		System.out.println("\n\tSCHOOL DETAILS");
		
		System.out.println(school);
		
		
		
		school.getClassroom()[0]=new Classroom();
		
		school.getClassroom()[0].setStandard("1 st Standard");
		
		school.getClassroom()[0].setTeacher(new Teacher());
		
		
		school.getClassroom()[0].getTeacher().setName("Sindhu");
		school.getClassroom()[0].getTeacher().setAge(45);
		school.getClassroom()[0].getTeacher().setSubject("Maths");
		
		
		
		school.getClassroom()[0].getStudent()[0]=new Student();
		
		school.getClassroom()[0].getStudent()[0].setName("Vipin");
		school.getClassroom()[0].getStudent()[0].setRollno(1);
		school.getClassroom()[0].getStudent()[0].setAge(5);
		

		
		
		school.getClassroom()[0].getStudent()[1]=new Student();
		
		school.getClassroom()[0].getStudent()[1].setName("Anila");
		school.getClassroom()[0].getStudent()[1].setRollno(2);
		school.getClassroom()[0].getStudent()[1].setAge(5);
		
		
		school.getClassroom()[0].getStudent()[2]=new Student();
		
		school.getClassroom()[0].getStudent()[2].setName("Akhil");
		school.getClassroom()[0].getStudent()[2].setRollno(3);
		school.getClassroom()[0].getStudent()[2].setAge(5);
		
		school.getClassroom()[0].getStudent()[3]=new Student();
		
		school.getClassroom()[0].getStudent()[3].setName("Farseena");
		school.getClassroom()[0].getStudent()[3].setRollno(4);
		school.getClassroom()[0].getStudent()[3].setAge(5);
		
		
		school.getClassroom()[0].getStudent()[4]=new Student();
		
		school.getClassroom()[0].getStudent()[4].setName("Mahesh");
		school.getClassroom()[0].getStudent()[4].setRollno(5);
		school.getClassroom()[0].getStudent()[4].setAge(5);
		
		
		school.getClassroom()[0].getStudent()[5]=new Student();
		
		
		school.getClassroom()[0].getStudent()[5].setName("Sruthi");
		school.getClassroom()[0].getStudent()[5].setRollno(6);
		school.getClassroom()[0].getStudent()[5].setAge(5);
		
		
		for(int i=0;i<school.getClassroom()[0].getStudent().length;i++)
		{
			if(school.getClassroom()[0].getStudent()[i].getRollno()%2==0)
		{
			school.getClassroom()[0].getStudent()[i].setGender("Male");
			
		}
		else
		{
			
			school.getClassroom()[0].getStudent()[i].setGender("Female");
		}
		
	}	
	

		
		
		
		school.getClassroom()[1]=new Classroom();
		
		school.getClassroom()[1].setStandard("2 nd Standard");
		
		school.getClassroom()[1].setTeacher(new Teacher());
		
		school.getClassroom()[1].getTeacher().setName("Sreeja");
		school.getClassroom()[1].getTeacher().setAge(40);
		school.getClassroom()[1].getTeacher().setSubject("English");
		
		school.getClassroom()[1].getStudent()[0]=new Student();
		
		school.getClassroom()[1].getStudent()[0].setName("Mahesh");
		school.getClassroom()[1].getStudent()[0].setAge(6);
		school.getClassroom()[1].getStudent()[0].setRollno(1);
		
		
		school.getClassroom()[1].getStudent()[1]=new Student();
		
		school.getClassroom()[1].getStudent()[1].setName("Sruthi");
		school.getClassroom()[1].getStudent()[1].setAge(6);
		school.getClassroom()[1].getStudent()[1].setRollno(2);
		
		
		school.getClassroom()[1].getStudent()[2]=new Student();
		
		school.getClassroom()[1].getStudent()[2].setName("Farseena");
		school.getClassroom()[1].getStudent()[2].setAge(6);
		school.getClassroom()[1].getStudent()[2].setRollno(3);
		
		school.getClassroom()[1].getStudent()[3]=new Student();
		
		school.getClassroom()[1].getStudent()[3].setName("Akhil");
		school.getClassroom()[1].getStudent()[3].setAge(6);
		school.getClassroom()[1].getStudent()[3].setRollno(4);
		
		school.getClassroom()[1].getStudent()[4]=new Student();
		
		school.getClassroom()[1].getStudent()[4].setName("Anila");
		school.getClassroom()[1].getStudent()[4].setAge(6);
		school.getClassroom()[1].getStudent()[4].setRollno(5);
		
		school.getClassroom()[1].getStudent()[5]=new Student();
		
		school.getClassroom()[1].getStudent()[5].setName("Vipin");
		school.getClassroom()[1].getStudent()[5].setAge(6);
		school.getClassroom()[1].getStudent()[5].setRollno(6);
		
		
		
		
		
		for(int i=0;i<school.getClassroom()[1].getStudent().length;i++)
		{
			if(school.getClassroom()[1].getStudent()[i].getRollno()%2==0)
		{
			school.getClassroom()[1].getStudent()[i].setGender("male");
			
		}
		else
		{
			
			school.getClassroom()[1].getStudent()[i].setGender("Female");
		}
		
	}	
	
		
		
		
		
		school.getClassroom()[2]=new Classroom();
		
		school.getClassroom()[2].setStandard("3 rd Standard");
		
		school.getClassroom()[2].setTeacher(new Teacher());
		
		school.getClassroom()[2].getTeacher().setName("Dhanya");
		school.getClassroom()[2].getTeacher().setAge(39);
		school.getClassroom()[2].getTeacher().setSubject("Malayalam");
		
		
		school.getClassroom()[2].getStudent()[0]=new Student();
		
		school.getClassroom()[2].getStudent()[0].setName("Megha");
		school.getClassroom()[2].getStudent()[0].setAge(7);
		school.getClassroom()[2].getStudent()[0].setRollno(1);
		
		school.getClassroom()[2].getStudent()[1]=new Student();
		
		school.getClassroom()[2].getStudent()[1].setName("Amal");
		school.getClassroom()[2].getStudent()[1].setAge(7);
		school.getClassroom()[2].getStudent()[1].setRollno(2);
		
		school.getClassroom()[2].getStudent()[2]=new Student();
		
		school.getClassroom()[2].getStudent()[2].setName("Amala");
		school.getClassroom()[2].getStudent()[2].setAge(7);
		school.getClassroom()[2].getStudent()[2].setRollno(3);
		
		school.getClassroom()[2].getStudent()[3]=new Student();
		
		school.getClassroom()[2].getStudent()[3].setName("Nikhil");
		school.getClassroom()[2].getStudent()[3].setAge(7);
		school.getClassroom()[2].getStudent()[3].setRollno(4);
		
		
		school.getClassroom()[2].getStudent()[4]=new Student();
		
		school.getClassroom()[2].getStudent()[4].setName("Amritha");
		school.getClassroom()[2].getStudent()[4].setAge(7);
		school.getClassroom()[2].getStudent()[4].setRollno(5);
		
		school.getClassroom()[2].getStudent()[5]=new Student();
		
		school.getClassroom()[2].getStudent()[5].setName("Fahad");
		school.getClassroom()[2].getStudent()[5].setAge(7);
		school.getClassroom()[2].getStudent()[5].setRollno(6);
		
		
		
		for(int i=0;i<school.getClassroom()[2].getStudent().length;i++)
		{
			if(school.getClassroom()[2].getStudent()[i].getRollno()%2==0)
		{
			school.getClassroom()[2].getStudent()[i].setGender("Female");
			
		}
		else
		{
			
			school.getClassroom()[2].getStudent()[i].setGender("Male");
		}
		
	}	
	
		
		
		
		
		
		school.getClassroom()[3]=new Classroom();
		
		school.getClassroom()[3].setStandard("4 th Standard");
		
		school.getClassroom()[3].setTeacher(new Teacher());
		
		school.getClassroom()[3].getTeacher().setName("Sreeja");
		school.getClassroom()[3].getTeacher().setAge(42);
		school.getClassroom()[3].getTeacher().setSubject("Hindi");
		
		school.getClassroom()[3].getStudent()[0]=new Student();
		
		school.getClassroom()[3].getStudent()[0].setName("sneha");
		school.getClassroom()[3].getStudent()[0].setAge(8);
		school.getClassroom()[3].getStudent()[0].setRollno(1);
		
		
		school.getClassroom()[3].getStudent()[1]=new Student();
		
		school.getClassroom()[3].getStudent()[1].setName("Sai");
		school.getClassroom()[3].getStudent()[1].setAge(8);
		school.getClassroom()[3].getStudent()[1].setRollno(2);
	
		school.getClassroom()[3].getStudent()[2]=new Student();
		
		
		school.getClassroom()[3].getStudent()[2].setName("Aiswarya");
		school.getClassroom()[3].getStudent()[2].setAge(8);
		school.getClassroom()[3].getStudent()[2].setRollno(3);
		
		school.getClassroom()[3].getStudent()[3]=new Student();
		
		school.getClassroom()[3].getStudent()[3].setName("Ajay");
		school.getClassroom()[3].getStudent()[3].setAge(8);
		school.getClassroom()[3].getStudent()[3].setRollno(4);
		
		school.getClassroom()[3].getStudent()[4]=new Student();
		
		school.getClassroom()[3].getStudent()[4].setName("Veena");
		school.getClassroom()[3].getStudent()[4].setAge(8);
		school.getClassroom()[3].getStudent()[4].setRollno(5);
		
		
		school.getClassroom()[3].getStudent()[5]=new Student();
		
		school.getClassroom()[3].getStudent()[5].setName("Arshaf");
		school.getClassroom()[3].getStudent()[5].setAge(8);
		school.getClassroom()[3].getStudent()[5].setRollno(6);
		
		
		
		
		for(int i=0;i<school.getClassroom()[3].getStudent().length;i++)
		{
			if(school.getClassroom()[3].getStudent()[i].getRollno()%2==0)
		{
			school.getClassroom()[3].getStudent()[i].setGender("Male");
			
		}
		else
		{
			
			school.getClassroom()[3].getStudent()[i].setGender("Female");
		}
		
	}	
	
		
		
		
		System.out.println("\n\tCLASS ROOM DETAILS");
		
		for(int i=0;i<school.getClassroom().length;i++)
		{
		
			System.out.println(school.getClassroom()[i]);		
		
		for(int j=0;j<school.getClassroom()[i].getStudent().length;j++)
		{
			System.out.println(school.getClassroom()[i].getStudent()[j].toString());	
		}
		}
	
	
	
	
	
	}
}