public class Car
{
	private String name;
	private String color;
	private String brand;
	Door[] door=new Door[4];
	Tyre[] tyre=new Tyre[4];
	Steering steering;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	
	
	
	public void setColor (String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	
	
	
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return brand;
	}

	
	
	public String toString()
	{
		return "CAR NAME : "+ name+"\nCOLOR : "+color+"\nBRAND : "+brand;
	}
	
	
	
	
} 