import java.util.Scanner;
import java.util.*;
import java.text.*;


public class ViewController
{
   
  PollutionCentre center = new PollutionCentre();
  Scanner scan= new Scanner(System.in);
  DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
  int i = 0;
  String receive;
  
  public void viewInfo(){
	  System.out.println("            POLLUTION CENTRE                   ");
	  boolean flag = true;
	  
	  do
	  {
		System.out.println("     Click. 1  To view Vehicle Information    \n");  
		System.out.println("     Click. 2  To Print Vehicle Certificate \n");  
		System.out.println("     Click. 3  To  Quit                        \n");  
		int info = Integer.parseInt(scan.nextLine());
        
        switch(info){
			
			case 1:
			System.out.println("Here is the Vehicle Information");
			vehicleInfo();
			break;
			
			case 2:
			printDetails();
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
		for(int j=0;j<10;j++){
		   if(center.getVehicle()[j]==null)
		{
		  center.getVehicle()[j] = new Car();
		  break;
			
		}
		}
		  System.out.println(" Enter Register number"+"\n");
		  //String registerNumber = scan.nextLine(); 
		  //if(center.getVehicle()[i].getRegno().equals(registerNumber))
		  //{
			//System.out.println("Register number is already entered!!!!");
	      //}else if(center.getVehicle()[i].getRegno()!=registerNumber)
		  //{
		    center.getVehicle()[i].setRegno(scan.nextLine());
		  //}
		 
		  System.out.println("Enter Date"+"\n");
		  try{
		  Date date = df.parse(scan.nextLine()); 
	      center.getVehicle()[i].setDate(date);
		  }catch(ParseException e) { e.printStackTrace();}
	      System.out.println("Centre"+"\n");
          center.setCentreName(scan.nextLine());
	      System.out.println("\n How many Passenger"+"\n");
	      center.getVehicle()[i].setPassenger(scan.nextLine());
		  i++;
		  System.out.println("\n"+i+" "+"Register Number Entered \n\n");
		  
          System.out.println("\n"+i+" "+"Date Entered \n\n");
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
			
		for(int j=0;j<10;j++){
		   if(center.getVehicle()[j]==null)
		{
			center.getVehicle()[j] = new Lorry();
			break;
			
		}
		}	
		
		  System.out.println(" Enter Register number"+"\n");
	      center.getVehicle()[i].setRegno(scan.nextLine()); 
	      System.out.println("Enter Date"+"\n");
		  try{
		  Date date = df.parse(scan.nextLine()); 
	      center.getVehicle()[i].setDate(date);
		  }catch(ParseException e) { e.printStackTrace();}
		  System.out.println("Centre"+"\n");
          center.setCentreName(scan.nextLine());
	      System.out.println("\n How many Passenger"+"\n");
	      center.getVehicle()[i].setPassenger(scan.nextLine());
	      i++;
			System.out.println("\n"+i+" "+"Register Number Entered \n\n");
            System.out.println("\n"+i+" "+"Date Entered \n\n");
            System.out.println("Type YES to continue NO to quit \n\n");
            String response = scan.nextLine();
            if(response.equals("no"))
		    {
		       respond = false;
		    }
			
			
			
		}
		
		
		
		
		
	}

   public void printDetails()
   {
	   System.out.println(center);
	   
		
}}