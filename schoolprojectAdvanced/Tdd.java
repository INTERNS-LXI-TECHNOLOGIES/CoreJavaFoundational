public class Tdd{
	public static void main(String args[]){
	
	School s =new School();
	s.setName("BEMS");
	s.setAddress("PARALI");
	s.setCode(2458);
	
	s.getClassroom()[0] = new Classroom();
	s.getClassroom()[0].setSection("10th A");
	s.getClassroom()[0].getStudent()[0]=new Student();
	s.getClassroom()[0].getStudent()[0].setName("SRUTHI");
	s.getClassroom()[0].getStudent()[0].setGender("FEMALE");
	s.getClassroom()[0].getStudent()[1]=new Student();
	s.getClassroom()[0].getStudent()[1].setName("RAHUL");
	s.getClassroom()[0].getStudent()[1].setGender("MALE");
	s.getClassroom()[0].setTeacher(new Teacher());
	s.getClassroom()[0].getTeacher().setName("ABDUL SIR");
	s.getClassroom()[0].getTeacher().setSubject("HINDI");
	
	s.getClassroom()[1] = new Classroom();
	s.getClassroom()[1].setSection("12th A");
	s.getClassroom()[1].getStudent()[0]=new Student();
	s.getClassroom()[1].getStudent()[0].setName("REHNA");
	s.getClassroom()[1].getStudent()[0].setGender("FEMALE");
	s.getClassroom()[1].getStudent()[1]=new Student();
	s.getClassroom()[1].getStudent()[1].setName("ROHITH");
	s.getClassroom()[1].getStudent()[1].setGender("MALE");
	s.getClassroom()[1].setTeacher(new Teacher());
	s.getClassroom()[1].getTeacher().setName("ABIJITH");
	s.getClassroom()[1].getTeacher().setSubject("MATHS");
	
	System.out.println(s);
	}
}