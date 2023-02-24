public class Teacher
{
String teacherName;	

public String getTeacherName()
{
return teacherName;	
}
public void setTeacherName(String teacherName)
{
this.teacherName = teacherName;	
}

public Teacher()
{	
}
public Teacher(String teacherName)
{
this.teacherName = teacherName;
}

public String toString()
{
return "Teacher Name:" + teacherName;
}
}