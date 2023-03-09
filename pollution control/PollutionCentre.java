public class PollutionCentre
{
	//private String centreName;
	private Vehicle[] vehicles = new Vehicle[10];
	
	public PollutionCentre()
	{		
	}
	/*public String getCentreName()
	{
		return centreName;
	}
	public void setCentreName(String centrename)
	{
		this.centreName = centrename;
	}*/
	
	public Vehicle[] getVehicle()
	{
	  return vehicles; 
	}
	
	  public String toString(){
		String source = "";
		for(Vehicle machine:vehicles){
			if(machine!=null)
			{
			   source = source+machine;
		    }
		}
		return source;
	}







}