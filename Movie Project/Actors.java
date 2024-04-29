public class Actors
{
	private String name;
	private int age;
	private  String gender;
	private Dailoge[] dailoge=new Dailoge[4];
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
		
	}
	
	
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	
	
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	
	public String getGender()
	{
		return gender;
	}
	
	
	
	
	
	public void setDailoge(Dailoge[] dailoge)
	{
		this.dailoge=dailoge;
	}
	
	
	public Dailoge[] getDailoge()
	{
		return dailoge;
	}
		
		
	
	public void pickDailoge() {
    int a = (int)(Math.random() * dailoge.length);
    System.out.println(dailoge[a]);
	}

	
	
	
	
	public String toString()
	{
		String b="";
		for(int i=0;i<dailoge.length;i++)
		{
		 b+=dailoge[i];
		}
		return "\n\n\n\n\n ACTOR NAME : "+name+b;
	}
	
	
	
}