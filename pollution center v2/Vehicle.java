import java.util.*;
public class Vehicle{
	
	private String registerNumber;
	private String type;
	private String passenger;
	private ArrayList<VehicleInfo> info = new ArrayList<VehicleInfo>();
	
	
	public String getRegno()
	{
	  return registerNumber;
	}
	
	public void setRegno(String registerNumber)
	{
		this.registerNumber = registerNumber;
	}
	
	public String getType()
	{
	   return type;	
	}
	
	public void setType(String type)
	{
	  this.type = type; 	
    }
	
	public String getPassenger()
	{
		return passenger;
	}
	
	public void setPassenger(String passenger)
	{
		this.passenger = passenger;
	}
	
	public  ArrayList<VehicleInfo> getInfo()
	{
	  return info;	
	}
	
	/*public Vehicle()
	{
		for(int i=0;i<10;i++)
		{
			info.add(i,new VehicleInfo());	
		}
	}*/
	
	
	/*public boolean equals(Vehicle v)
	{
		
		if(this.registernumber.equals(v.registernumber))
		{
			return true;
		}else{
			return false;
		}
	}*/
	
	
	public String toString()
	{
		
		String details = "      Registeration Number :"+" "+registerNumber+"\n"+"      Type :"+" "+type+"\n"+"      Passengers :"+" "+passenger+"\n\n";
		//System.out.println(info.toString());
		for(VehicleInfo infos: info){
			
			details = details+infos;
			
		}
		return details;
		
		
		
	}



}