//package pollution;
import java.util.Scanner;

public class ViewController {
    Scanner sc = new Scanner(System.in);
    PollutionCenter pollutionCenter = new PollutionCenter();
    //List<Car> carList=new ArrayList<Car>();

    

    public void pollutionDetails(){
        boolean c = true;
        while(c){
System.out.println("\t  -----Welcome To Pollution Service----- \n");
System.out.println("\t\t  -Choose Options Below- \n");

System.out.println("\t  Press 1 : Add Pollution Certificate \n");
System.out.println("\t  Press 2 : View Certificate  \n");
System.out.println("\t  Press 3 : Quit \n");

        String count  = sc.nextLine();
				 
				
			    switch (count)
			     {
				case ("1"):
				addPollition();
					
					break;
					
			     case ("2"):
                   
				 viewCertificate();
                      break;
					  
				case ("3"):
				
                    System.out.print("Quit");			
					c = false;
                      break;
					  
				default:
					System.out.println("Invalid Expression");		
			}
        }

    }

    public void addPollition(){
        boolean c = true;
        while(c){
            System.out.println("\t  Select Vehicle Type  \n");
            
            System.out.println("\t  Press 1 : Add Car \n");
            System.out.println("\t  Press 2 : Add Lorry  \n");
            System.out.println("\t  Press 3 : Add TwoWheeler  \n");
            System.out.println("\t  Press 4 : Quit \n");


            String count  = sc.nextLine();

            switch (count)
			     {
				case ("1"):
				pollutionCenter.addCar();
					
					break;
						
			     case ("2"):
                   
				 pollutionCenter.addLorry();
                      break;

                      case ("3"):
                   
                      pollutionCenter.addTwoWheeler();
                      break;
					  
				case ("4"):
				
                    System.out.print("Quit");
                    System.out.println("\n");			
					c = false;
                      break;
					  
				default:
					System.out.println("Invalid Expression");		
			}

        }

    }


    public void viewCertificate() {

        pollutionCenter.viewVehicleDetails();


        
    }
    
}
