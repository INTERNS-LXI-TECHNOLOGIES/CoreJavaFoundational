import java.util.Scanner;
import java.util.*;
import java.text.*;


public class ViewController
{
  String regNo;
  PollutionCentre center = new PollutionCentre();
  Scanner scan= new Scanner(System.in);
  DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  Date date = new Date();
  List<User> userInfo = new ArrayList<User>();
  
 
  public void authenthicationProcess()
  {
	int i =0;
	boolean flag = true;
	while(flag){
	System.out.println("            --GETHISAKTHI--                  \n "); 
	System.out.println("            --ENTER USERNAME                  \n  "); 
	System.out.println("            --ENTER PASSWORD                   \n "); 
	

    userInfo.add(new User());	
	//Scanner scan= new Scanner(System.in);
    System.out.print("Username :");

    userInfo.get(i).userName = scan.nextLine();

    System.out.print("Password :");

    userInfo.get(i).passWord = scan.nextLine();
    	
	System.out.print("Type yes to login:");
	String response = scan.nextLine();
		if(response.equalsIgnoreCase("yes")){
	    System.out.println("\n Logged in \n");
		i++;
		flag = false;	
		checKing();	
		}
	
	  
  }}
  
 public void checKing(){
	 
	 System.out.print("Enter register number :");
	 String regNo = scan.nextLine();

        for(Vehicle v:center.getVehicle()){
			if(v.getRegno()!=null&&v.getRegno().equals(regNo)){
				System.out.println(center);
			}else{
				System.out.println("Checked in for pollution certification");
				
			}
			}
			cruD();
		}	 
	
	 
	 
	  
	  
  
  
  
  public void cruD()
  {
	
	boolean flag = true;
	do
	{
	  System.out.println("            --MAIN MENU--                 \n "); 
      System.out.println("     Click 1* Create    \n");
      System.out.println("     Click 2* Read      \n");
      System.out.println("     Click 3* Update    \n");	
      System.out.println("     Click 4* Delete    \n");	
      System.out.println("     Click 5* Quit      \n");	

      int info = Integer.parseInt(scan.nextLine());
      switch(info)
	  {
		case 1:
		vehicleInfo();
        break;
		
		case 2:
		printDetails();
		break;
	
		
		case 3:
		System.out.println("Update");
		break;
		
		case 4:
		System.out.println("Delete");
		break;
		
		case 5:
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
		System.out.println("            --INFORMATION TAB--                  \n "); 
		//System.out.println("            --TYPE BACK TO GO TO MAIN MENU--     \n "); 
		System.out.println("Which Vehicle ? \n");
		String type = scan.nextLine();
        
        switch(type){
			
			case "car":
			enterCarDetails();
			break;
			
			case "lorry":
			System.out.println("Check Vehicle");
			break;
			
			case "back":
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
	
	
	
		int j=0;
		System.out.println(" Enter Register number"+"\n");
		 regNo = scan.nextLine();		
		boolean vehicleExists =false ;
		//boolean dateCheck = true ;
		for(Vehicle machine:center.getVehicle())
		{
		  if((machine.getRegno()!=null)&&(machine.getRegno().equals(regNo)))
		  {
			System.out.println("\n ***This vehicle is already Certified*** \n");
			vehicleExists = true ;
		  }
		   
		}
		
		// create a temporary vehicle with the new regno let it be vehicle v 
		// int i =  list.indexOf(v) it returns either -1 or a whole number 
		
		if(!vehicleExists)
		{
		 center.getVehicle().add(new Car());
		 j++;
         createCertificate();		 
		 
		  
         		
	  
	
	}
	}
  
  
    public void enterLorryDetails() 
	{
		
	    boolean respond = true;
		
	    while(respond)
		{
	    System.out.println(" Enter Register number"+"\n");
        String regNo = scan.nextLine();		
		/*boolean vehicleExists =false ;
		for(int j=0;center.getVehicle()[j]!=null;j++)
		{
		  if((center.getVehicle()[j].getRegno()!=null)&&(center.getVehicle()[j].getRegno().equals(regNo)))
		  {
			System.out.println("\n ***This vehicle is already Certified*** \n");
			vehicleExists = true ;
		  }
		   
		  
		}*/  
		
		   //if( !vehicleExists)
		  //{
		   center.getVehicle().add(new Lorry());
		   
		    
			
		}
			
		}
		
	public void createCertificate()
	{
		boolean respond = true;
		int i =0;
		int j =0;
		while(respond){
		 center.getVehicle().get(i).setRegno(regNo);
		 System.out.println("\n Mode of Transport"+"\n");
	     center.getVehicle().get(i).setType(scan.nextLine());
		 System.out.println("\n How many Passengers..?"+"\n");
		 center.getVehicle().get(i).setPassenger(scan.nextLine());
		
		 
		
		 
		 try
		    {
            center.getVehicle().get(i).getInfo().add(new VehicleInfo());				
		    System.out.println("\n Date updated"+"\n");
			center.getVehicle().get(i).getInfo().get(j).setDate(df.format(date));
			System.out.println("Centre"+"\n");
            center.getVehicle().get(i).getInfo().get(j).setCentreName(scan.nextLine());
			}catch(Exception e) 
		    { 
		     e.printStackTrace();
		    }
		 
			
			
			//center.getVehicle().getInfo().add(info);
			
			i++;
			j++;
		    System.out.println("\n"+i+" "+"Register Number Entered \n\n");
		    System.out.println("\n"+j+" "+"Date Entered \n\n");
		
		//}  
        System.out.println("Type YES to Information Tab \n\n");
	   
        String response = scan.nextLine();
        if(response.equals("yes"))
		{
		  checKing();
		  respond = false;
		}
		System.out.println("\n"+i+" "+"VEHICLE CERTIFIED");
	}}  
			
		
	

   public void printDetails()
   {
	   System.out.println(center);
	   
		


	}}
