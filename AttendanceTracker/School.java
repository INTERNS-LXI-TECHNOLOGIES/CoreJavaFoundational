public class School
{
private String schoolAddress;	

private ClassRoom classRoom = new ClassRoom();

public ClassRoom getClassRoom()
{
return classRoom;	
}


public String getSchoolAddress()
{
return schoolAddress;	
}
public void setSchoolAddress(String schoolAddress)
{
this.schoolAddress = schoolAddress;
}

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
