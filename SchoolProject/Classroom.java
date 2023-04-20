public class Classroom{
int std;
String division;
Teacher teacher;
Student[] students;

public Classroom( int std,String division,Teacher teacher,Student[] students)
{
this.std = std;
this.division = division;
this.teacher = teacher;
this.students = students;

}
public String toString() {
String text= "CLASSROOMS DETAILS"+"\n"+"std: " +std+ "\n"+ "division: " +division+ "\n"+"teacher: " +teacher+"\n";

for(Student s:students){
text=text+"STUDENTS DETAILS"+"\n" +s+ "\n";
}
return text;
}
}



