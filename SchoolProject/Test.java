import java.util.ArrayList;
import java.util.Scanner;

public class Test {

public static void main(String [] args)  {

    Student student1 = new Student(10, "mike");

    Teacher teacher1 = new Teacher("pam", "maths");


    ClassRoom classroom1 = new ClassRoom(40, 5, student1, teacher1);


    School school1 = new School("oxford school", "455 oxfrod at wonderland, london, ON", classroom1);
    
   

        
    

     school1.printDetails();
     classroom1.printdetails();
     teacher1.printDetails();
     student1.printDetails();
 }
}