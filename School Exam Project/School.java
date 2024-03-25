public class School
{
	private String name;
	private String num;
	private String location;
	private Classroom classroom;

	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	
	
	
	public void setNum (String num)
	{
		this.num=num;
	}
	public String getNum()
	{
		return num;
	}
	
	
	
	
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getLocation()
	{
		return location;
	}
	
	
	
	
	public void setClassroom(Classroom classroom)
	{
		this.classroom=classroom;
	}
	public Classroom getClassroom()
	{
		return classroom;
	}






	public String toString()
	{
		return "\n\n SCHOOL NAME  : "+name+"\n LOCATION     : "+location+"\n PHONE NUMBER : "+num+classroom;
	
	}


}
