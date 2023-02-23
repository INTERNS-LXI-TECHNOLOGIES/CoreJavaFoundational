public class Month
{

Day[] days = new Day[31];


public Month(Day[] days)
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