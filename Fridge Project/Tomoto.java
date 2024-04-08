public class Tomoto extends Vegitables
{
	private String color;
	
	
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
		return " Name:" +super.getName()+"\n Rate: "+super.getRate()+"\n Color: "+color;
	}
	
	
}
	