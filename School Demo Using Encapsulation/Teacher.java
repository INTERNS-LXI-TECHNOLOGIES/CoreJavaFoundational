public class Teacher
{
	private String name;
	private int age;
	private String subject;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	
	
	public void setSubject(String subject)
	{
		this.subject=subject;
	}
	public String setSubject()
	{
		return subject;
	}
	

		public String toString()
		{
			return "\n TEACHER NAME : "+name+"\n AGE : "+age+"\n SUBJECT : "+subject;
		}
}


		