import java.util.*;
public class PollutionCentre
{
	//private String centreName;
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
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
	
	public ArrayList<Vehicle> getVehicle()
	{
	  return vehicles; 
	}
	
	  public String toString(){
		String source = "";
		for(Vehicle machine:vehicles){
			   
			source = source+machine;
		    
		}
		return source;
	}







}