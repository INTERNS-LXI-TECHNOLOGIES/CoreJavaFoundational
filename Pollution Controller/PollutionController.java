public class PollutionController
{
	
	
	
private Vehicle[] vehicles = new Vehicle[10]; 
	
	
	 
public Vehicle[] getVehicles()
       {
        return vehicles;
       }
     	  
public void setVehicles(Vehicle[] vehicles)
       {
	    this.vehicles = vehicles;
       }
	
		
	
public PollutionController(){
}
  


public String toString()
{
  String a ="";

for(Vehicle v:vehicles)
{
	if(v.getRegisterNumber()!=null)
         {
           a = a + v;
		  
		 }	
	
 	
}	
 return a;
}	
}