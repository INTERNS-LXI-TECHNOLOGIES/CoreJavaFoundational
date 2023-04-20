public class School1{
public static void main(String[] sargs){
Student student = new Student("Deepu","26","213","78");
School school = new School("bmcmim Public school",student);
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
class Student{
String name;
int rollno;
double regno;
double mark;
public Student(String name, rollno, double regno, double mark)
{
this.name = name;
this.rollno = rollno;
this.regno = regno;
this.mark = mark;
}
public void showdetails()
{
System.out.println(name+" "+rollno+" rollno"  +regno+" regno" +mark);
}
}
}


