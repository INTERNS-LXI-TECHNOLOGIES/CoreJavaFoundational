
public class Test {

public static void main(String [] args)  {

    School school1 = new School("oxford school", "223 wonderland road, london");

    school1.classroom1 = new ClassRoom(20, 5);

    
    ClassRoom  classroom1 = new ClassRoom(20, 4);
    
    classroom1.student1 = new Student(3,"mike");

    classroom1.teacher1 = new Teacher("pam", "maths");

   
   

        school1.printDetails();
        

 }
}