public class Vegitables
{
	private String name;
	private int rate;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	
	
	
	public void setRate(int rate)
	{
		this.rate=rate;
	}
	public int getRate()
	{
		return rate;
	}
	
	
	
	
	
	
	public String toString()
	{
		return name+rate;
	}
}