public class School
{
String schoolAddress;	

ClassRoom classRoom = new ClassRoom();
public School()
{
}

public School(String schoolAddress)
{
this.schoolAddress = schoolAddress;
}


public String toString()
{
return "School Address:"  + schoolAddress;
}	
}
