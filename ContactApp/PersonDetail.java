public class PersonDetail{

private String name;
private String number;
private String email;
   
   public String getName()
   {
	   return this.name;
	   
   }
   public void setName(String name)
   {
	   this.name = name;
   }
   public String getNumber()
   {
	   return this.number;
	   
   }
   public void setNumber(String number)
   {
	   this.number = number;
   }
   public String getEmail()
   {
	   return this.email;
	   
   }
   public void setEmail(String email)
   {
	   this.email = email;
   }

    public String toString()
	{
		
		return "\n"+"Name :"+" "+ name+" "+"\n"+"\n"+"Phone number :"+" "+number+"\n"+"\n"+"Email id :"+" "+email+"\n";
	}



}