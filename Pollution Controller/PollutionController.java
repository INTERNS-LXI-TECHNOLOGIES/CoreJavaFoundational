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

for(Vehicle vehicle:vehicles)
{

if(vehicle != null)
{
	
	
if(vehicle instanceof Bike)
{

   a=a+"\t  <<<Bike Details>>>  \n"+vehicle;	
}

else if(vehicle instanceof Car)
{	

 a=a+"\t  <<<Car Details>>>  \n"+vehicle;	
}


else if(vehicle instanceof Lorry)
{	

 a=a+"\t  <<<Lorry Details>>>  \n"+vehicle;	
}


}
	
}	
 return a;
}	
}