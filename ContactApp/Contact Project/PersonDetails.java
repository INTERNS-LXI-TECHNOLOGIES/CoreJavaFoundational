public class PersonDetails
{
private String name;
private int number;
private String emailId;



   public String getName()
    {
	  return name;
    }
    public void setName(String name)
        {
	      this.name=name;
		}
		
		
	public int getNumber()
    {
	  return number;
    }
    public void setNumber(int number)
        {
	      this.number=number;
		}

		
		
	 public String getEmailId()
	 {
		 return emailId;
	 }
    public void setEmailId(String emailId)
	 {
		 this.emailId=emailId;
	 }
	
	
	
	public String toString()
	{
		
		
		return "Name: " + name + "\n"
		+"Number: " + number + "\n"
		+ "emailId: " + emailId;
		
		
	}
	
	
	
	
	
	
}