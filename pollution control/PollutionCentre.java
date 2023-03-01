public class PollutionCentre
{
	private String centreName;
	private Vehicle[] vehicles = new Vehicle[10];
	
	public PollutionCentre()
	{		
	}
	public String getCentreName()
	{
		return centreName;
	}
	public void setCentreName(String centrename)
	{
		this.centreName = centrename;
	}
	
	public Vehicle[] getVehicle()
	{
	  return vehicles; 
	}
	
	  public String toString(){
		String source = "Center Name :"+" "+ centreName;
		for(Vehicle machine:vehicles){
			
			source = source+machine;
		}
		
		
		return source;
	}







}