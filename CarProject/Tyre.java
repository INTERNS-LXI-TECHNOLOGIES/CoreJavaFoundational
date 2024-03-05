public class Tyre
 {
private String name;
private String tyre;

public String getName()
{
	return name;
	
}

public void setName(String name)
{
	this.name= name;
	
}	

public String getTyre() 
{
	return tyre;
}

public void setTyre(String tyre)
{
	this.tyre = tyre;
	
}

public String toString()
{
	
	return  name +""+"\n"+tyre+"";
	
}
}