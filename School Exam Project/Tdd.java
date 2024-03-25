public class Tdd
{
	public static void main(String ar[])
	{
		School school=new School();
		
		school.setName("SADANAM");
		school.setLocation("PATHIRIPPALA");
		school.setNum("9946830323");
		
		System.out.println("\n\t SCHOOL DETAILS");
		
		
	
		
		school.setClassroom(new Classroom());
		
		school.getClassroom().setName("5 th Standard");
		
		school.getClassroom().getStudent()[0]= new Student();
		
		school.getClassroom().getStudent()[0].setName("VIPIN");
		school.getClassroom().getStudent()[0].setRollno(1);
		
		school.getClassroom().getStudent()[0].setExam(new Exam());
		
		school.getClassroom().getStudent()[0].getExam().getSubject()[0]=new Subject();
		
		
		school.getClassroom().getStudent()[0].getExam().getSubject()[0].setName("HINDI");
		school.getClassroom().getStudent()[0].getExam().getSubject()[0].setMark(84);
		
		school.getClassroom().getStudent()[0].getExam().getSubject()[1]=new Subject();
		
		school.getClassroom().getStudent()[0].getExam().getSubject()[1].setName("ENGLISH");
		school.getClassroom().getStudent()[0].getExam().getSubject()[1].setMark(86);
		
		school.getClassroom().getStudent()[0].getExam().getSubject()[2]=new Subject();
		
		school.getClassroom().getStudent()[0].getExam().getSubject()[2].setName("MALAYALAM");
		school.getClassroom().getStudent()[0].getExam().getSubject()[2].setMark(89);
		
		
		
		school.getClassroom().getStudent()[1]=new Student();
		
		school.getClassroom().getStudent()[1].setName("FAHAD");
		school.getClassroom().getStudent()[1].setRollno(2);
		
		
		school.getClassroom().getStudent()[1].setExam(new Exam());
		
		school.getClassroom().getStudent()[1].getExam().getSubject()[0]=new Subject();
		
		school.getClassroom().getStudent()[1].getExam().getSubject()[0].setName("HINDI");
		school.getClassroom().getStudent()[1].getExam().getSubject()[0].setMark(82);
		
		
		school.getClassroom().getStudent()[1].getExam().getSubject()[1]=new Subject();
		
		school.getClassroom().getStudent()[1].getExam().getSubject()[1].setName("ENGLISH");
		school.getClassroom().getStudent()[1].getExam().getSubject()[1].setMark(80);
		
		school.getClassroom().getStudent()[1].getExam().getSubject()[2]=new Subject();
		
		school.getClassroom().getStudent()[1].getExam().getSubject()[2].setName("MALAYALAM");
		school.getClassroom().getStudent()[1].getExam().getSubject()[2].setMark(88);
		
		
		school.getClassroom().getStudent()[2]=new Student();
		
		school.getClassroom().getStudent()[2].setName("JAYARAM");
		school.getClassroom().getStudent()[2].setRollno(3);
		
		school.getClassroom().getStudent()[2].setExam( new Exam());
		
		school.getClassroom().getStudent()[2].getExam().getSubject()[0]=new Subject();
		
		school.getClassroom().getStudent()[2].getExam().getSubject()[0].setName("HINDI");
		school.getClassroom().getStudent()[2].getExam().getSubject()[0].setMark(84);
		
		
		
		school.getClassroom().getStudent()[2].getExam().getSubject()[1]=new Subject();
		
		school.getClassroom().getStudent()[2].getExam().getSubject()[1].setName("ENGLISH");
		school.getClassroom().getStudent()[2].getExam().getSubject()[1].setMark(86);
		
		school.getClassroom().getStudent()[2].getExam().getSubject()[2]=new Subject();
		
		school.getClassroom().getStudent()[2].getExam().getSubject()[2].setName("MALAYALAM");
		school.getClassroom().getStudent()[2].getExam().getSubject()[2].setMark(90);
	

		
		System.out.println(school);




	System.out.println("\n\n\n TOTAL MARK OF AJAY : "+school.getClassroom().getStudent()[0].getExam().totalMark());
	System.out.println("\n TOTAL MARK OF FAHAD : "+school.getClassroom().getStudent()[1].getExam().totalMark());
	System.out.println("\n TOTAL MARK OF JAYARAM : "+school.getClassroom().getStudent()[2].getExam().totalMark());
	
	}
}