
public class Test {

public static void main(String [] args)  {

    School school1 = new School("oxford school", "223 wonderland road, london");

    school1.classroom1 = new ClassRoom(20, 5);

    
   school1. classroom1.student1 = new Student(3,"mike");

   school1.classroom1.teacher1 = new Teacher("pam", "maths");


   School school2 = new School("prime school", "235 oakrgde, london");
   school2.classroom1 = new ClassRoom(30, 6);
   school2.classroom1.student1 = new Student(4, "adam");
   school2.classroom1.teacher1 = new Teacher("jim", "physics");

   
   

        school1.printDetails();
        System.out.println("" );
        school2.printDetails();
        

 }
}