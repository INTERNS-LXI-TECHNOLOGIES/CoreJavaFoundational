import java.util.*;
public class Tdd{
public static void main(String[] args){
List<Student> students1 = Arrays.asList(new Student[] {new Student("sree","26","213",78),new Student("Dev","10","151",88)});
List<Student> students2 = Arrays.asList(new Student[] {new Student("ram", "29", "242", 68),new Student("anu","31","245",70)});
Teacher teacher1=new Teacher("renu","maths");
Teacher teacher2=new Teacher("raju","physics");
List<Classroom> classrooms = Arrays.asList(new Classroom[] {new Classroom(2,"A",teacher1,students1),new Classroom(2,"B",teacher2,students2)});
School school = new School(" \t\tBmcmi Public school","\t\t palakkad",classrooms);
System.out.println("School: "+school);
}
}



