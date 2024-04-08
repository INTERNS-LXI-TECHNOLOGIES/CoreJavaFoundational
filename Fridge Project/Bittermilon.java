public class Bittermilon extends Vegitables
{
	private String taste;
	
	public void setTaste(String taste)
	{
		this.taste=taste;
	}
	public String getTaste()
	{
		return taste;
	}
	
	
	
	
	public String toString()
	{
		return "\n Name: "+getName()+"\n Rate: "+getRate()+"\n Taste: "+taste; 
	}
}