public class Classroom
{
	private String standard;
	private Teacher teacher;
	private Student[] student=new Student[6];
	
	
	
	
	public void setStandard(String standard)
	{
		this.standard=standard;
	}
	public String getStandard()
	{
		return standard;
	}
	
	
	
	
	public void setTeacher(Teacher teacher)
	{
		this.teacher = teacher;
	}
	public Teacher getTeacher()
	{
		return teacher;
	}
	
	
	
	
	
	public void setStudent(Student[] student)
	{
		this.student=student;
	}
	public Student[] getStudent()
	{
		return student;
	}
	
	
		
	
	
	public String toString()
	{
		return "\n STANDARD :"+standard;
	}
	



}
	