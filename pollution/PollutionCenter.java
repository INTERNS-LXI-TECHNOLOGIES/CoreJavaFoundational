
import java.text.SimpleDateFormat;
import java.util.*;


public class PollutionCenter {

List <Vehicle> vehicles = new ArrayList<Vehicle>();
Scanner sc = new Scanner(System.in);
VehicleInfo vehicleInfo = new VehicleInfo();
Date d = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


public void addCar() {

        Car car = new Car();
        System.out.println("\t  You Selected Car \n");

        System.out.println("\t  Add Car Brand Name \n");

        car.setBrandName(sc.nextLine());

        System.out.println("\t  Add Car Register Number \n");
        car.setRegNo(sc.nextLine());

        System.out.println("\t  Center Name \n");
        vehicleInfo.setCenter(sc.nextLine());
        
        System.out.println("\t  Date Updated \n");
        
        vehicleInfo.setDate(formatter.format(d));

        car.info.add(vehicleInfo);
        vehicles.add(car);


       
        }

        public void addLorry() {

                Lorry lorry = new Lorry();
                    
                System.out.println("\t  You Selected Lorry \n");
                
                System.out.println("\t  Add Lorry Brand Name \n");
                
                lorry.setBrandName(sc.nextLine());
    
                System.out.println("\t  Add Lorry Register Number \n");
                lorry.setRegNo(sc.nextLine());

                System.out.println("\t  Center Name \n");
                vehicleInfo.setCenter(sc.nextLine());
        
                System.out.println("\t  Date Updated \n");
               
                
                vehicleInfo.setDate(formatter.format(d));

                lorry.info.add(vehicleInfo);
                vehicles.add(lorry);
    
            }

            public void addTwoWheeler() {

                    Twowheeler twowheeler = new Twowheeler();
        
                    System.out.println("\t  You Selected TwoWheeler \n");

                    
                    System.out.println("\t  Add Twowheeler Brand Name \n");
                    
                    twowheeler.setBrandName(sc.nextLine());
        
                    System.out.println("\t  Add Twowheeler Register Number \n");
                    twowheeler.setRegNo(sc.nextLine());

                    System.out.println("\t  Center Name \n");
                    vehicleInfo.setCenter(sc.nextLine());
        
                    System.out.println("\t  Date Updated \n");
               
                    vehicleInfo.setDate(formatter.format(d));

                    twowheeler.info.add(vehicleInfo);    
                    vehicles.add(twowheeler);
    
                
            }

            public void viewVehicleDetails() {

                System.out.println(vehicles);
                //System.out.println(vehicleInfo);
                
            }
    }
    

