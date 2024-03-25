public class Student
{
	private String name;
	private int rollno;
	private Exam exam;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	
	
	
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	
	
	
	
	public void setExam(Exam exam)
	{
		this.exam=exam;
	}
	public Exam getExam()
	{
		return exam;
	}
	
	
	public String toString()
	{
		
		
		return "\n\n\n STUDENT NAME : "+name+"\n ROLL NO : "+rollno+exam;
	}
	
	
	
}