import java.util.Scanner;
public class ViewController
{
   
  PollutionCentre center = new PollutionCentre();
  Scanner scan= new Scanner(System.in);
  
  public void viewInfo(){
	  System.out.println("            POLLUTION CENTRE                   ");
	  boolean flag = true;
	  
	  do
	  {
		System.out.println("     Click. 1  To view Vehicle Information    \n");  
		System.out.println("     Click. 2  To Checkout Vehicle Information \n");  
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
	int i = 0;
	boolean respond = true;
	while(respond)
	{
		
		if(center!=null)
		{
			center.getVehicle()[i] = new Car();
			
		}
	 System.out.println(" Enter Register number"+"\n");
	 center.getVehicle()[i].setRegno(scan.nextLine()); 
	 System.out.println("Enter Date"+"\n");
	 center.getVehicle()[i].setDate(scan.nextLine());
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
		int i = 0;
	    boolean respond = true;
		
	    while(respond)
		{
			
		for(int j=0;j<10;j++){
		   if(center.getVehicle()[i]==null)
		{
			center.getVehicle()[j] = new Lorry();
			break;
			
		}
		}	
		
		  System.out.println(" Enter Register number"+"\n");
	      center.getVehicle()[i].setRegno(scan.nextLine()); 
	      System.out.println("Enter Date"+"\n");
	      center.getVehicle()[i].setDate(scan.nextLine());
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
   }

}