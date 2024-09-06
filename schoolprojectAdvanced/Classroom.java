public class Classroom{
	private String section;
	private Student[] student = new Student[2];
	private Teacher teacher;

	public String getSection(){
		return section;
	}
	public void setSection(String section){
		this.section=section;
	}
	
	public Student[] getStudent(){
		return student;
	}
	public Teacher getTeacher(){
		return teacher;
	}
	public void setTeacher(Teacher teacher){
		this.teacher=teacher;
	}
	
	public String toString(){
		String result="";
		for(int i=0;i<student.length;i++){
			result+=student[i];
		}
		return "\n"+"CLASSROOM SECTION: "+section+"\n"+result+teacher;
	} 
}