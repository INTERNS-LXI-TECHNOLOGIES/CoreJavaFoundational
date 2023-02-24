public class Month
{

private Day[] days = new Day[31];


public Day[] getDays()
{
return days;	
}

public void setDays(Day[] days)
{
this.days=days;
}


public Month()
{
	for (int i=0; i<days.length; i++)
{
		days[i] = new Day();
}
}
public String toString()
{
String returnValue = "";
for(int i=0; i<30; i++)
{
returnValue = returnValue + "Day" + i + days[i]; 	
}
return returnValue;
}
}