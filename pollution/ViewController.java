package pollution;
import java.util.ArrayList;
import java.util.List;
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
				addCar();
					
					break;
						
			     case ("2"):
                   
				 addLorry();
                      break;

                      case ("3"):
                   
                      addTwoWheeler();
                      break;
					  
				case ("4"):
				
                    System.out.print("Quit");			
					c = false;
                      break;
					  
				default:
					System.out.println("Invalid Expression");		
			}

        }

    }

    public void addCar() {

        
        boolean c = true;
        String response;
        // Car benz=new Car();
        // benz.setBrandName("response car");
           // carList.add(benz);
            //System.out.println("car list obj"+carList.toString());


        while(c){

            for (int i =0; i<10; i++){
                
                if (pollutionCenter.vehicles[i]==null){
                pollutionCenter.vehicles[i] = new Car();
              
                }
               
                
            
            System.out.println("\t  Add Car Brand Name \n");

            pollutionCenter.vehicles[i].setBrandName(sc.nextLine());

            System.out.println("\t  Add Car Register Number \n");
            pollutionCenter.vehicles[i].setRegNo(sc.nextLine());

            
            break;
            }
            
            System.out.println("\t  Type Yes to Continue No to Quit \n");

            response = sc.nextLine();
            if (response.equals("no")){

                c = false;
            }
            


        }
        
    }

    public void addLorry() {

        
        boolean c = true;
        String response;
        while(c){

            for (int i =0; i<10;i++){
                if (pollutionCenter.vehicles[i]==null){
                    pollutionCenter.vehicles[i] = new Lorry();
                    
                }
                
                
            
            System.out.println("\t  Add Lorry Brand Name \n");
            
            pollutionCenter.vehicles[i].setBrandName(sc.nextLine());

            System.out.println("\t  Add Lorry Register Number \n");
            pollutionCenter.vehicles[i].setRegNo(sc.nextLine());

            
            break;
            }
            
            System.out.println("\t  Type Yes to Continue No to Quit \n");

            response = sc.nextLine();
            if (response.equals("no")){

                c = false;
            }


        }
        
    }

    public void addTwoWheeler() {

        
        boolean c = true;
        String response;
        while(c){

            for (int i =0; i<10; i++){
                if (pollutionCenter.vehicles[i]==null){
                    pollutionCenter.vehicles[i] = new Twowheeler();
                
                }
               
                
            
            System.out.println("\t  Add Twowheeler Brand Name \n");
            
            pollutionCenter.vehicles[i].setBrandName(sc.nextLine());

            System.out.println("\t  Add Twowheeler Register Number \n");
            pollutionCenter.vehicles[i].setRegNo(sc.nextLine());

            break;
            }
            
            System.out.println("\t  Type Yes to Continue No to Quit \n");

            response = sc.nextLine();
            if (response.equals("no")){

                c = false;
            }
            


        }

        
    }

    public void viewCertificate() {

        System.out.println(pollutionCenter);
        
    }
    
}
