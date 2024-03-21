public class School
{
	private String name;
	private String location;
	private String number;
	private Classroom[] classroom=new Classroom[4];


	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	
	
	
	
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getLocation()
	{
		return location;
	}
	
	
	
	
	
	public void setNumber(String number)
	{
		this.number=number;
	}
	public String getNumber()
	{
		return number;
	}
	
	
	
	
	public void setClassroom(Classroom[] classroom)
	{
		this.classroom=classroom;
	}
	public Classroom[] getClassroom()
	{
		return classroom;
	}
	
	
	
	public String toString()
	{
		return "\n SCHOOl NAME  : "+name+"\n LOCATION     : "+location+"\n PHONE NUMBER : "+number ;
	}
}

	

