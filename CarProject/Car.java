public class Car
{
private String name;
private String colour;

Door [] door = new Door[4];
Tyre[] tyre = new Tyre [4];
Window[] window = new Window [4];

public String getName()
{
	return name;
	
}

public void setName(String name)
{
	this.name= name; 
		
}

public String getColour()
{
	return colour;
	
}

public void setColour(String colour)
{
	this.colour= colour; 
	
	
}

public String toString()
{
	
	return  name +""+"\n"+colour+"";
	

}
}