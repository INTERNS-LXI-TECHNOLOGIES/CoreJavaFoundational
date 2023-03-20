import java.util.Scanner;
import java.util.*;
import java.text.*;


public class ViewController
{
  String regNo;
  PollutionCentre center = new PollutionCentre();
  Scanner scan= new Scanner(System.in);
  DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
  Date date = new Date();
  User userInfo = new User();
  
 
  public void authenthicationProcess()
  {
	System.out.println(" \n ===========================================\n ");
	System.out.println(" \n             GETHISAKTHI                  \n ");
	System.out.println(" \n=============================================\n ");
	
	 
	System.out.println("            --ENTER USERNAME--                  \n  "); 
	
	

    
    System.out.print("Username :");
    String username= scan.nextLine();
	System.out.println(" \n         --ENTER PASSWORD--                   \n "); 
	System.out.print("Password :");
	String password= scan.nextLine();
	
    if(userInfo.getUsername().equals(username)&&userInfo.getPassword().equals(password))
	{
	    System.out.println("\n Logged in \n");	
		cruD();	
		}	
	else{
		
		System.out.println("Invalid entry");
	}

   

   
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
		createCertificate();
        break;
		
		case 2:
		readCertificate();
		break;
	
		
		case 3:
		updateCertificate();
		break;
		
		case 4:
		deleteCertificate();
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
  
 
	
	/*public void vehicleInfo()
	{
	  boolean flag = true;
	  
	  do
	  {
		System.out.println("            --INFORMATION TAB--                  \n "); 
		System.out.println("            --TYPE BACK TO GO TO MAIN MENU--     \n "); 
		System.out.println("Which Vehicle ? \n");
		String type = scan.nextLine();
        
        switch(type){
			
			case "car":
			center.getVehicle().add(createCertificate(new Car()));
			System.out.println("Vehicle added");
			System.out.println(center) ;
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
		  
			
		}*/
		
	
		   
		
		
		// create a temporary vehicle with the new regno let it be vehicle v 
		// int i =  list.indexOf(v) it returns either -1 or a whole number 
	
  
  
   
		
	public void createCertificate()
	{
		boolean respond = true;
		//int i = center.getVehicle().indexOf(center.getVehicle());
		System.out.println("\n           Certification Page          \n");
		while(respond){
		 Vehicle v =new Vehicle();
	     System.out.print("Enter register number :");
	     v.setRegno(scan.nextLine());
	     

	    if(center.getVehicle().contains(v))
		{
			int k = center.getVehicle().indexOf(v);
			System.out.println("\n This Vehicle is Certified you can update this vehicle \n");
			System.out.println(center.getVehicle().get(k));
			System.out.println("\n Go back to update the certificate Type yes to go back");
			String receive = scan.nextLine();
            if(receive.equalsIgnoreCase("yes"))
			{
				respond = false;
			}
	    }else{
		   System.out.println("\n Checked in for certification \n");
		   
		}
		System.out.print("Note : Available portals (Car,Lorry).\n");
		System.out.print("\n Enter Vehicle : ");
		String type = scan.nextLine();
		if(type.equalsIgnoreCase("car")){
			Car car = new Car();
			System.out.print("\nEnter register number :");
			car.setRegno(scan.nextLine());
			System.out.print("\nMode of Transport :");
			car.setType(scan.nextLine());
			System.out.print("\nPassengers :");
				
			car.setPassenger(scan.nextLine());
			
			//int i = center.getVehicle().indexOf(car);
			
			
			
			 try
		    {
            //center.getVehicle().get(i).getInfo().add(new VehicleInfo());
            VehicleInfo info = new VehicleInfo();		
		
			
		    System.out.println("\n Date updated"+"\n");
			info.setDate(df.format(date));
			System.out.print("Centre :");
            info.setCentreName(scan.nextLine());
			car.getInfo().add(info);
			center.getVehicle().add(car);
			
			}catch(Exception e) 
		    { 
		     e.printStackTrace();
		    }
			
			
		}
		else if(type.equalsIgnoreCase("lorry")){
			Lorry lorry = new Lorry();
			System.out.print("\nEnter register number :");
			lorry.setRegno(scan.nextLine());
			System.out.print("\nMode of Transport :");
			lorry.setType(scan.nextLine());
			System.out.print("\nPassengers :");
			lorry.setPassenger(scan.nextLine());
			
			//int j = center.getVehicle().indexOf(lorry);
			
			 try
		    {
            //center.getVehicle().get(i).getInfo().add(new VehicleInfo());
            VehicleInfo info = new VehicleInfo();			
		    System.out.println("\n Date updated"+"\n");
			info.setDate(df.format(date));
			System.out.print("Centre :");
            info.setCentreName(scan.nextLine());
			lorry.getInfo().add(info);
			center.getVehicle().add(lorry);
			}catch(Exception e) 
		    { 
		     e.printStackTrace();
		    }
			
			
		}else{
			
			System.out.println("This Vehicle is not checked in this centre");
		}
		 
        System.out.println("Type No return Main Menu \n\n");
	   
        String response = scan.nextLine();
        if(response.equalsIgnoreCase("no"))
		{
		  respond = false;
		}
		
		
	}
    
}

   public void updateCertificate(){
	   System.out.println("            --UPDATE CERTIFICATE--                  \n ");
	    boolean flag = true;
        
	  while(flag)
	  {
		
		//System.out.print("Enter Register number :");
		System.out.print("\n Enter Certified Vehicle : ");
		String type = scan.nextLine();
		if(type.equalsIgnoreCase("car")){
			Car car = new Car();
			System.out.print("\nEnter register number :");
			car.setRegno(scan.nextLine());
			int i = center.getVehicle().indexOf(car);
			if(center.getVehicle().contains(car))
		     {
			  System.out.print("\nMode of Transport :");
			  center.getVehicle().get(i).setType(scan.nextLine());
			  System.out.print("\nPassengers :");
			  center.getVehicle().get(i).setPassenger(scan.nextLine());
			  
			  VehicleInfo info = new VehicleInfo();
              System.out.println("\n Entered Date \n");
			  info.setDate(df.format(date));
			  if(center.getVehicle().get(i).getInfo().contains(info)){
				int j = center.getVehicle().get(i).getInfo().indexOf(info);  
				System.out.print("\nCentre :");
                center.getVehicle().get(i).getInfo().get(j).setCentreName(scan.nextLine());
			    
				System.out.println(center.getVehicle().get(i).getInfo().size());
				//center.getVehicle().get(i).getInfo().set(j,info);
				//center.getVehicle().set(i,car);
            }
			   
			   
			
             
			  //int j = center.getVehicle().get(i).getInfo().indexOf(info);
             
			  
			 // center.getVehicle().get(i).getInfo().get(i).setDate(df.format(date));
			  
			   
			  //car.getInfo().get(j).set(j,info);
			 
			    System.out.println("\nCertificate Updated\n");
				System.out.println("Enter yes To see the updated certificate");
				String r = scan.nextLine();
				if(r.equalsIgnoreCase("yes"))
				{
		        System.out.println(center.getVehicle().get(i));
		        
		        }
				
			 }
		
        }else if(type.equalsIgnoreCase("lorry")){
			Lorry lorry = new Lorry();
			System.out.print("\nEnter register number :");
			lorry.setRegno(scan.nextLine());
			int k = center.getVehicle().indexOf(lorry);
			if(center.getVehicle().contains(lorry))
		    {
			System.out.print("\nMode of Transport :");
			center.getVehicle().get(k).setType(scan.nextLine());
			System.out.print("\nPassengers :");
			center.getVehicle().get(k).setPassenger(scan.nextLine());
			
			 VehicleInfo info = new VehicleInfo();
             System.out.println("\n Entered Date \n");
			 info.setDate(df.format(date));
			 if(center.getVehicle().get(k).getInfo().contains(info)){
				int e = center.getVehicle().get(k).getInfo().indexOf(info);
            System.out.print("\nCentre :");
            center.getVehicle().get(k).getInfo().get(e).setCentreName(scan.nextLine());
			System.out.println("\n Date updated \n");
			center.getVehicle().get(k).getInfo().get(e).setDate(df.format(date));
				
			//center.getVehicle().get(k).getInfo().set(e,info);
				
			 }	
			
			
			
			System.out.println("\nCertificate Updated\n");
			System.out.println("Enter yes To see the updated certificate(lorry)");
			String t = scan.nextLine();
		   if(t.equalsIgnoreCase("yes")){
			System.out.println(center.getVehicle().get(k));
		}
		}
		}
	   /* if(center.getVehicle().contains(v))
		  {
			int i = center.getVehicle().indexOf(v);
		   System.out.print("\nMode of Transport :");
	       v.setType(scan.nextLine());
		   System.out.print("\nPassengers :");
           v.setPassenger(scan.nextLine());
            
            VehicleInfo info = new VehicleInfo();
            System.out.print("\nCentre :");
            info.setCentreName(scan.nextLine());
            if(center.getVehicle().get(i).getInfo().contains(info))
		    {
            int j = v.getInfo().indexOf(info);				
		    System.out.println("\n Date updated \n");
			info.setDate(df.format(date));
			center.getVehicle().get(i).getInfo().set(j,info);
			}*/			
		else{
			
			System.out.println("invalid Entry");
		}
		
		System.out.println(" Type no to return main menu \n");
        String response = scan.nextLine();
        if(response.equalsIgnoreCase("no")){
			flag =false;
		}
	   
	   
	   
	  }   
   }	
	  
    public void deleteCertificate()
	{
	  
	  
	  System.out.println("            --DELETE CERTIFICATE--                  \n ");
      boolean flag = true;
      while(flag)
	  {
		System.out.print("Enter Register number :");
		Vehicle v =new Vehicle();
		v.setRegno(scan.nextLine());
        int i = center.getVehicle().indexOf(v);	
		  if(center.getVehicle().contains(v))
		  {
				
            center.getVehicle().remove(i);
            System.out.println("Certificate Deleted");			
		  }
		  
	  
       System.out.println("Do you want to continur yes to continue no to quit \n");
        String response = scan.nextLine();
         if(response.equalsIgnoreCase("no"))
		{
		  flag = false;
		}		
	  } 
	
	}	
			
		
	

   public void readCertificate()
   {
	 Vehicle v =new Vehicle();
	 System.out.print("Enter register number :");
	 v.setRegno(scan.nextLine());
	 int j = center.getVehicle().indexOf(v);

	    if(center.getVehicle().contains(v))
		{
			
			System.out.println("\n Certified Vehicles \n");
			System.out.println(center.getVehicle().get(j));
	    }else{
		   System.out.println("\n Sorry this vehicle is not certified \n");
		   
		}
			
	   
	   
		


	}}
