import java.util.ArrayList;
import java.util.Scanner;

public class Test {

public static void main(String [] args)  {

    Student student1 = new Student(10, "mike");

    Teacher teacher1 = new Teacher("pam", "maths");

    ArrayList<Student> studentlist = new ArrayList<Student>();

    studentlist.add(student1);

    ArrayList<Teacher> teacherlist = new ArrayList<Teacher>();

    teacherlist.add(teacher1);


    ClassRoom classroom1 = new ClassRoom(40, 5, studentlist, teacher1);

    ArrayList<ClassRoom> classroomlist = new ArrayList<ClassRoom>();

    classroomlist.add(classroom1);


    School school1 = new School("oxford school", "455 oxfrod at wonderland, london, ON", classroomlist);
    
    System.out.println("School Information:");

    school1.printDetails();

    ArrayList<ClassRoom> classroomlist1 = school1.getclassroom();

    for(int i =0; i<classroomlist1.size(); i++){
        ClassRoom tempClass = classroomlist1.get(i);
        System.out.println("Classroom Information:");

        tempClass.printdetails();

        Teacher tempTeacher = tempClass.getteachers();
        System.out.println("Teacher Information:");

        tempTeacher.printDetails();
        /*for(int k =0; k< tempTeacherlist.size(); k++){
            tempTeacherlist.get(k).printDetails();
        }*/
        ArrayList<Student> tempstudentlist = tempClass.getstudents();
        System.out.println("Student Information:");

        for(int k=0; k<tempstudentlist.size(); k++){
            tempstudentlist.get(k).printDetails();
        }
    }

     school1.printDetails();
     classroom1.printdetails();
     teacher1.printDetails();
     student1.printDetails();
 }
}