public class ClassRoom
{
	private String standard;
    private String division;

    private  Student[] students = new Student[20];


public String getStandard()
       {
        return this.standard;
       }
       public void setStandard(String standard)
       {
	    this.standard=standard;
       }

public String getDivision()
       {
        return this.division;
       }
       public void setDivision(String division)
       {
	    this.division=division;
       }


public Student[] getStudents()
	 {
		 return this.students;
	 }
    public void setStudents(Student[] students)	 
	  {
		  this.students = students;
	  }


      
	 
       public ClassRoom()
	   
	   {
	   
	    this.standard = "";
	    this.division = ""; 
	   
	     
	     for(int i=0;i<students.length;i++)
		 {
         students[i]= new Student();
		
	     }
	   }
	   public String toString()
	        {
			   
	return "Standard" + standard + "Division" + division;	
		
	}
 }

