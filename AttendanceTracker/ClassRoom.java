public class ClassRoom
{
String classRoomNumber;

Teacher teacher;
Student[] students = new Student[6];

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