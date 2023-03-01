import java.util.Scanner;

public class ViewController {

     
    Scanner sc = new Scanner(System.in);
    PollutionCenter pollution = new PollutionCenter();
    
    public void vechilePollutionDetails(){
    boolean count = true;

        while(count){

            System.out.println("..............WELCOME TO POLLUTION CENTER..............\n");
            System.out.println("....Choose The Below Option....");

            System.out.println("....SELECT VECHICLE DETAILS....");
            System.out.println("\t ENTER 1:VEHICLE DETAILS");
            System.out.println("\t ENTER 2:PRINT VEHICLE DETAILS");
            System.out.println("\t ENTER 3:QUIT");


            String condition = sc.nextLine();
        
        switch(condition){

        case "1":
              vehicleDetails();

        break;

        case "2":

          printDetailsOfVehicle();

        break;

        case "3":
          System.out.println("Quit");
          count = false;

        break; 

        }}}
        public void vehicleDetails()
        {
      boolean count = true;
      while (count)
      {

            System.out.println("Enter 1 for: bike details");
            System.out.println("Enter 2 for: car details");
            System.out.println("Enter 3 for: lorry details");
            System.out.println("Enter 4 for:  back");

               String copy = sc.nextLine();
        
               switch(copy){

                case "1":
                      bikeDetails();
        
                break;
        
                case "2":
        
                  carDetails();
        
                break;
        
                case "3":
                  lorryDetails();
        
                break; 

                case "4":
                System.out.println("back");
                count = false;
      
                break; 

               }}}


            public void bikeDetails()
            {

            boolean count = true;
            
            while (count)
            {

            System.out.println("Enter owner name:");
            String en = sc.nextLine();

            System.out.println("Enter register number:");
            String re = sc.nextLine();

            System.out.println("Enter date:");
            String da = sc.nextLine();

            System.out.println("Enter yes or no");
            String yn = sc.nextLine();

           count = false;
          }
        }
        
    
        
        public void carDetails()
            {

            boolean count = true;
            
            while (count)
            {

            System.out.println("Enter owner name:");
            String en = sc.nextLine();

            System.out.println("Enter register number:");
            String re = sc.nextLine();

            System.out.println("Enter date:");
            String da = sc.nextLine();

            System.out.println("Enter yes or no");
            String yn = sc.nextLine();

           count = false;
          }
        }
        
        
        
        public void lorryDetails()
            {

            boolean count = true;
            
            while (count)
            {

            System.out.println("Enter owner name:");
            String en = sc.nextLine();

            System.out.println("Enter register number:");
            String re = sc.nextLine();

            System.out.println("Enter date:");
            String da = sc.nextLine();

            System.out.println("Enter yes or no");
            String yn = sc.nextLine();

           count = false;
          }
          }
          
        
         public void printDetailsOfVehicle()
          {

          System.out.println(pollution);  
          }
          
        
          }
        

        
        

        
        

    
    

