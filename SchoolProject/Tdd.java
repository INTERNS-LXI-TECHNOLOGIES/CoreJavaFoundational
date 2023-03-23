public class Tdd{
public static void main(String[] args){
Student student1 = new Student("sree", "26", "213", "78");
Student student2 = new Student("Dev", "10", "151", "88");
Student student3 = new Student("ram", "29", "242", "68");
School school = new School("  Bmcmi Public school",student2);
school.showDetails();
}
}
class School{
String schoolname;
Student student;

public School(String schoolname,Student student){
this.schoolname =schoolname;
this.student = student;
}
public void showDetails(){
System.out.println("schoolname: "+schoolname);
student.showDetails();
}
}
class Student{
String studentname;
String rollno;
String regno;
String mark;
public Student(String studentname, String rollno, String regno, String mark)
{
this.studentname = studentname;
this.rollno = rollno;
this.regno = regno;
this.mark = mark;
}
public void showDetails()
{
System.out.println("studentname:  " +studentname  +  "\n" + "rollno:  " +rollno + "\n" + "regno:   " +regno + "\n" +   "marks: "  +mark);
}
}



