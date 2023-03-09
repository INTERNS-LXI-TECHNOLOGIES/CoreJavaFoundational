import java.util.Scanner;
import java.util.*;
import java.text.*;


public class ViewController
{
    
  PollutionCentre center = new PollutionCentre();
  Scanner scan= new Scanner(System.in);
  DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
  Date date = new Date();
  int i = 0;
  int j = 0;
  
  public void viewInfo(){
	  System.out.println("            POLLUTION CENTRE                   ");
	  boolean flag = true;
	  
	  do
	  {
		System.out.println("     Click. 1  To view Vehicle Information    \n");  
		System.out.println("     Click. 2  Check Vehicle Information      \n");  
		System.out.println("     Click. 3  To Print Vehicle Certificate   \n");  
		System.out.println("     Click. 4  To  Quit                       \n");  
		int info = Integer.parseInt(scan.nextLine());
        
        switch(info){
			
			case 1:
			System.out.println("Here is the Vehicle Information");
			vehicleInfo();
			break;
			
			case 2:
			System.out.println("Check Vehicle");
			break;
			
			case 3:
		    printDetails();
		    break;
			
			case 4:
			System.out.println("Quit");
			flag = false;
			break;
			
			default:
			System.out.println("Default");
			
			
		}		
		}
		while(flag);
	  
	  
	  
  }
  
  
  public void vehicleInfo()
  {
	
	boolean flag = true;
	do
	{
      System.out.println("     Click 1 Enter Car Details    \n");
      System.out.println("     Click 2 Enter Lorry Details  \n");
      System.out.println("     Click 3       Quit           \n");	

      int info = Integer.parseInt(scan.nextLine());
      switch(info)
	  {
		case 1:
		System.out.println("Enter car Details here");
		enterCarDetails();
		break;
		
		case 2:
		System.out.println("Enter Lorry Details here");
		enterLorryDetails();
		break;
	
		
		case 3:
	    System.out.println("Quit");
		flag = false;
		break;
		
		default:
		System.out.println("Default");
	}
	}
    while(flag);	
	  
   }
  
  public void enterCarDetails()
  {
	
	boolean respond = true;
	while(respond)
	{
		System.out.println(" Enter Register number"+"\n");
		String regNo = scan.nextLine();		
		boolean vehicleExists =false ;
		//boolean dateCheck = true ;
		for(int j=0;center.getVehicle()[j]!=null;j++)
		{
		  if((center.getVehicle()[j].getRegno()!=null)&&(center.getVehicle()[j].getRegno().equals(regNo)))
		  {
			System.out.println("\n ***This vehicle is already Certified*** \n");
			vehicleExists = true ;
		  }
		   
		}
		
		if(!vehicleExists)
		{
		 center.getVehicle()[i] = new Car();  
		 center.getVehicle()[i].setRegno(regNo);
		 System.out.println("\n Mode of Transport"+"\n");
	     center.getVehicle()[i].setType(scan.nextLine());
		 System.out.println("\n How many Passengers..?"+"\n");
		 center.getVehicle()[i].setPassenger(scan.nextLine());
		 try
		    {				
		    System.out.println("Enter Date"+"\n");
			center.getVehicle()[i].getInfo()[j].setDate(df.format(date));
			}catch(Exception e) 
		    { 
		     e.printStackTrace();
		    }
		 
			System.out.println("Centre"+"\n");
            center.getVehicle()[i].getInfo()[j].setCentreName(scan.nextLine());
			i++;
			j++;
		    System.out.println("\n"+i+" "+"Register Number Entered \n\n");
		    System.out.println("\n"+j+" "+"Date Entered \n\n");
		
		}  
        System.out.println("Type YES to continue NO to quit \n\n");
	   
        String response = scan.nextLine();
        if(response.equals("no"))
		{
		  respond = false;
		}
          
		  
         		
	  
	  
  }
  }
  
  
    public void enterLorryDetails()
	{
		
	    boolean respond = true;
		
	    while(respond)
		{
	    System.out.println(" Enter Register number"+"\n");
        String regNo = scan.nextLine();		
		boolean vehicleExists =false ;
		for(int j=0;center.getVehicle()[j]!=null;j++)
		{
		  if((center.getVehicle()[j].getRegno()!=null)&&(center.getVehicle()[j].getRegno().equals(regNo)))
		  {
			System.out.println("\n ***This vehicle is already Certified*** \n");
			vehicleExists = true ;
		  }
		   
		  
		}  
		
		   if( !vehicleExists)
		  {
		   center.getVehicle()[i] = new Lorry();
		   center.getVehicle()[i].setRegno(regNo);
		   System.out.println("\n Mode of Transport"+"\n");
	       center.getVehicle()[i].setType(scan.nextLine());
		   System.out.println("\n How many Passenger"+"\n");
	       center.getVehicle()[i].setPassenger(scan.nextLine());
		   
			
		   try
		    {				
		    System.out.println("Enter Date"+"\n");
			center.getVehicle()[i].getInfo()[j].setDate(df.format(date));
			}catch(Exception e) 
		    { 
		     e.printStackTrace();
		    }
		 
			System.out.println("Centre"+"\n");
            center.getVehicle()[i].getInfo()[j].setCentreName(scan.nextLine());
		   }
		   i++;
		   j++;
		   System.out.println("\n"+i+" "+"Register Number Entered \n\n");
           System.out.println("\n"+j+" "+"Date Entered \n\n");
	      
		   
		   
          
	      
            System.out.println("Type YES to continue NO to quit \n\n");
            String response = scan.nextLine();
            if(response.equals("no"))
		    {
		       respond = false;
		    }
			
			
		}
			
		}
	
		/*public void checkDetails()
		{
			
		  
		  try
		  {
		   System.out.println("Enter Date"+"\n");
	       vehicle.getInfo()[i].setDate(df.format(date));  
		  }
		  catch(ParseException e) 
		  { 
		    e.printStackTrace();
		  }
		  System.out.println("Centre"+"\n");
          vehicle.getInfo()[i].setCentreName(scan.nextLine());	
			
			
			
			
		}*/
		
		
		
	

   public void printDetails()
   {
	   System.out.println(center);
	   
		
}}