public class Day
{
	
private boolean present=false;	

public boolean getPresent()
{
return present;
}
public void setPresent(boolean present)
{
this.present = present;	
}


public Day()
{
}
public Day(boolean present)
{
this.present = present;	
}
public String toString()
{
return present+"";
}
}
