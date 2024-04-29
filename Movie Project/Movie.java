public class Movie
{
	private String name;
	private int year;
	private Actors[] actors=new Actors[4];
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	
	public void setYear(int year)
	{
		this.year=year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	
	
	public void setActors (Actors[] actors)
	{
		this.actors=actors;
	}
	
	public Actors[] getActors()
	{
		return actors;
	}
	
	
	
	
	
	public String toString()
	{
		String a="";
		
		
		for(int i=0;i<actors.length;i++)
		{
			a+=actors[i];
		}
		
		return "\n MOVIE NAME : "+name+a;
	}
}