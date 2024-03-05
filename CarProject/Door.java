public class Door
{
private String colour;
private String doorName ; 

public String getColour()
{
	return colour;
	
}

public void setColour(String colour)
{
	this.colour= colour; 
	
	
}

public String getDoorName()
{
	return doorName;
	
}

public void setDoorName(String doorName)
{
	this.doorName= doorName; 
	
	
}

public String toString ()
{
	return doorName+""+"\n"+colour+"";
	
	
	
}
}