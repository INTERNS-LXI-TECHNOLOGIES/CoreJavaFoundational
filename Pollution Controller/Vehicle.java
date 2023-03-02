public class Vehicle
{
	
String registerNumber;
String date;
String centerName;




	
	public String getRegisterNumber()
    {
	  return registerNumber;
	 
    }
    public void setRegisterNumber(String registerNumber)
        {
	      this.registerNumber=registerNumber;
		}
	
	
	
	public String getDate()
    {
	  return date;
    }
    public void setDate(String date)
        {
	      this.date=date;
		}
	
	
	
	
	public String getCenterName()
    {
	  return centerName;
    }
    public void setCenterName(String centerName)
        {
	      this.centerName=centerName;
		}
	

  public String toString()
	{
	 return      "Register Number:"  + registerNumber + "\n"
				 + "Date:" + date+ "\n" 
				 + "Center Name:" + centerName + "\n";	
	
    }

	
}

























