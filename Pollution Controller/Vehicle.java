
public class Vehicle
{
	
String registerNumber;


	
	public String getRegisterNumber()
    {
	  return registerNumber;
	 
    }
    public void setRegisterNumber(String registerNumber)
        {
	      this.registerNumber=registerNumber;
		}
	

private VehicleInfo[] vehicleInf = new VehicleInfo[10];
 
 
 
 
 public Vehicle ()
 {
	 for(int i =0;i<10;i++)
	
	{
		
	vehicleInf[i] = new VehicleInfo();	
		
		
	}
 }	
		
		
public VehicleInfo[] getVehicleInf()
       {
        return vehicleInf;
       }
     	  
public void setVehicleInf(VehicleInfo[] vehicleInf)
       {
	    this.vehicleInf = vehicleInf;
       }
	
	
    /*public boolean equals(Vehicle v)
	{
		if(this.registerNumber.equals(v.registerNumber))
		{
			return true;
		}else
		{
			return false;
		}*/
		
	

	public String toString()
	{
	   String returnValue = "Register Number:"  + registerNumber;
		
	   for(VehicleInfo vehicleIfm:vehicleInf)
	   {

	   if(vehicleIfm.getDate() != null)
	   {
							
	    returnValue =  returnValue+ vehicleIfm;

	   }
	   }
	    return  returnValue;
										
						
	   }

					
}			

























