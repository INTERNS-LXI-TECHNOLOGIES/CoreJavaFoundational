public class Tdd{
public static void main(String[] args){
Student[] students = {new Student("sree","26","213","78"),new Student("Dev","10","151","88")};
//Student[] students2 = {new Student("ram", "29", "242", "68"),new Student("renu","31","245","70")};
Teacher teacher=new Teacher("renu","maths");
Classroom[] classrooms = {new Classroom(students,teacher,2,"A")};
School school = new School("Bmcmi Public school","palakkad",classrooms);
System.out.println("School: "+school);
}
}



