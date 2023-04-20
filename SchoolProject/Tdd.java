public class Tdd{
public static void main(String[] args){
Student[] students1 = {new Student("sree","26","213","78"),new Student("Dev","10","151","88")};
Student[] students2 = {new Student("ram", "29", "242", "68"),new Student("anu","31","245","70")};
Teacher teacher1=new Teacher("renu","maths");
Teacher teacher2=new Teacher("raju","physics");
Classroom[] classrooms = {new Classroom(2,"A",teacher1,students1),new Classroom(2,"B",teacher2,students2)};
School school = new School(" \t\tBmcmi Public school","\t\t palakkad",classrooms);
System.out.println("School: "+school);
}
}



