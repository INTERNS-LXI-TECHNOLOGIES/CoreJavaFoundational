public class stm{
public static void main(String[] args){
int marks =0;
String name ="asas";
Student std1=new Student();
Student std2=new Student();
Student std3=new Student();
Student std4=new Student();
std1.name="Adam";
std2.name="Esra";
std3.name="isha";
std4.name="srihan";

std1.Marks();
std2.Marks();
std3.Marks();
std4.Marks();
}
}
class Student{
String name;
int mark;
public void Marks()
{
System.out.println(this.name+" , "+this.mark);

}
}
