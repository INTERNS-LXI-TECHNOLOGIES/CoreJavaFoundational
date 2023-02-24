public class Student
{
 private String name;
 private int idStudent;
 private Month[] month = new Month[12];
 
 public String getName()
    {
	  return this.name;
    }
    public void setName(String name)
        {
	      this.name=name;
		}
	 public int getIdStudent()
	 {
		 return this.idStudent;
	 }
	 public void setIdStudent(int id)
	 {
		 this.idStudent=id;
	 }
	 public Month[] getMonth()
	 {
		 return this.month;
	 }
    public void setMonth(Month[] month)	 
	  {
		  this.month = month;
	  }
        
 public Student(){
	for(int i=0;i<12;i++){
	 
   month[i]	= new Month();
		
	}
  }
   
	public String toString()
	 {
			 			 
	String a =  "Name" + name + "idStudent" + idStudent; 

    for(Month m:month)
	{
		
	 a = a+"Month" + month;	
		
	}

	return a;
		
	}
	
	
	
}

	
