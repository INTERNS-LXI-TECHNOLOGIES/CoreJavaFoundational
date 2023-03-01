public class Vehicle{
	
	
	private String registernumber;
	private String date;
	private String passenger;
	
	public String getPassenger()
	{
		return passenger;
	}
	
	public void setPassenger(String passenger)
	{
		this.passenger = passenger;
	}
	public String getRegno()
	{
		return registernumber;
	}
	
	public void setRegno(String registernumber)
	{
		this.registernumber = registernumber;
	}
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	
	public String toString()
	{
		
		String details = "Register number :"+registernumber+"\n"+"Date :"+date+"\n"+"Passengers :"+" "+passenger+"\n\n";
		
		return details;
		
		
		
	}



}