import java.util.Scanner;
import java.util.*;
import java.text.*;
public class PollutionCentre
{
	
	
	
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	Scanner scan= new Scanner(System.in);
	
	public PollutionCentre()
	{		
	}
	
	
	public List<Vehicle> getVehicle()
	{
	  return vehicles; 
	}
	
		
		
		
	
	
	  public String toString(){
	
		return vehicles.toString();
	}







}