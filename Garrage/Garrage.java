public class Garrage
{
	private String name;
	Vehicle[] vehicle=new Vehicle[4];
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String GetName()
	{
		return name;
	}
	
	
	public String toString()
	{
		String b="";
		
		for(int i=0;i<vehicle.length;i++)
		{
			b+=vehicle[i];
		}
		
		return "\n GARAGE NAME : "+name+b;
	
	}
}
