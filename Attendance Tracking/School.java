public class School
{
	  
private ClassRoom classroom = new ClassRoom();

	 public ClassRoom getClassRoom()
       {
        return this.classroom;
       }
       public void setClassRoom(ClassRoom classRoom)
       {
	    this.classroom=classRoom;
       }
	   
	   
	 public String toString()
	        {
			   
	return "ClassRoom" + classroom;	
		
	}
	   
	   
	   
	   
	   
}
       
    