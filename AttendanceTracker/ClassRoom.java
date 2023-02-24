public class ClassRoom
{
private String classRoomNumber;

private Teacher teacher;
private Student[] students = new Student[6];

public String getClassRoomNumber()
{
return classRoomNumber;
}
public void setClassRoomNumber(String classRoomNumber)
{
this.classRoomNumber = classRoomNumber;	
}

public Teacher getTeacher()
{
return teacher;
}
public void setTeacher(Teacher teacher)
{
this.teacher = teacher;	
}

public Student[] getStudents()
{
return students;
}
public void setStudents(Student[] students)
{
this.students = students;	
}

public ClassRoom(){
	this.classRoomNumber = "";
		
		 teacher= new Teacher();
		
		for(int i=0; i<6;i++){
			
			students[i] = new Student("", "", "");
		}
	
}

	public ClassRoom(String classRoomNumber, Teacher teacher){
		this.classRoomNumber = classRoomNumber;
		this.teacher = teacher;
		 teacher= new Teacher();
		
		for(int i=0; i<6;i++){
			
			students[i] = new Student();
		}
	}

public String toString()
{
String returnValue = "";
returnValue = returnValue + "Class Room Number:" + classRoomNumber;
returnValue = returnValue + "Teacher:" + teacher;

for(int i=0; i<5; i++)
{
returnValue = returnValue + "Student" + i + students[i];
}	
return returnValue;
}	
}