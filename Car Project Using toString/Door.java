public class Door
{
	 private String name;
	 private String color;
	 boolean isOpen;
	 boolean isclose;
	 
	public  void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	
	
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	
	
	
	public String toString()
	{
		return "\nDoor Position : "+name+"\nDoor Color : "+color;
	
	}
	
	
	}