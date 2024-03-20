public class Tyre
{
	String position;
	String brand;
	int size;
	
	public void setPosition(String position)
	{
		this.position=position;
	}
	public String getPosition()
	{
		return position;
	}
	
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return brand;
	}
	
	
	
	public  void setSize(int size)
	{
		this.size=size;
	}
	public int getSize()
	{
		return size;
	}
	
	
	
	public String toString()
	{
		return "\nTyre Position : "+position +"\nTyre Brand :"+brand  + "\nTyre Size : "+size;
	}
	
}