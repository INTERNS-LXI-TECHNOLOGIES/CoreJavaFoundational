public class Tyre
{
	private String brand;
	 private int size ;
	 
	 
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return brand;
	}
	
	
	
	
	public void setSize(int size)
	{
		this.size=size;
	}
	public int getSize()
	{
		return size;
	}
	
	
	public String toString()
	{
		return "\n\n TYRE BRAND : "+brand+"\n TYRE SIZE  : "+size;
	}
	
}