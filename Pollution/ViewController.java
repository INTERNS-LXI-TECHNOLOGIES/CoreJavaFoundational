import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ViewController {

     
    Scanner sc = new Scanner(System.in);
    PollutionCenter pollution = new PollutionCenter();
    Date date = new Date();
    VehicleInfo vehicleInfo = new  VehicleInfo(); 
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
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

        }
      }
    }
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

              Bike bike = new Bike();

           

            System.out.println("Enter owner name:");
            bike.setOwnerName(sc.nextLine());

            System.out.println("Enter register number:");
            bike.setRegisterNo(sc.nextInt());

            System.out.println("Enter date:");
            vehicleInfo.setDate(dateFormat.format(date));
          
        }
        
    
        
        public void carDetails()
            {

              Car car = new Car();

          

            System.out.println("Enter owner name:");
            car.setOwnerName(sc.nextLine());


            System.out.println("Enter register number:");
            car.setRegisterNo(sc.nextInt());

            System.out.println("Enter date:");
            vehicleInfo.setDate(dateFormat.format(date));

           pollution.vehicleList.add(car);

           


          
          }
        
        
        
        
        public void lorryDetails()
            {

            Lorry lorry = new Lorry();
            

        
            
            

            System.out.println("Enter owner name:");
            lorry.setOwnerName(sc.nextLine());  

            System.out.println("Enter register number:");
             lorry.setRegisterNo(sc.nextInt()); 

            System.out.println("Enter date:");
           vehicleInfo.setDate(dateFormat.format(date));


           
          }
          
        
         public void printDetailsOfVehicle()
          {

          System.out.println(pollution); 
          
         System.out.println( vehicleInfo);

          }


          
        
          }
        

        
        

        
        

    
    

