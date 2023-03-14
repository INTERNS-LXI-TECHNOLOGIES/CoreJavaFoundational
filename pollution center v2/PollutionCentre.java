import java.util.Scanner;
import java.util.*;
import java.text.*;
public class PollutionCentre
{
	
	int i = 0;
    int j = 0;
	
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	Scanner scan= new Scanner(System.in);
	
	public PollutionCentre()
	{		
	}
	
	
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