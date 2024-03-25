public class Classroom
{
	private String name;
	private Student[] student=new Student[3];
	
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
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
		String result="";
		for(int i=0;i<student.length;i++)
		{
			result+=student[i];
		}
	
		return  "\n\n\n STANDARD : "+name+result;
	}
}



