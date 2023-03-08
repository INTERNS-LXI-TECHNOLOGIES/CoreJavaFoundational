//package pollution;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PollutionCenter {

List <Vehicle> vehicles = new ArrayList<Vehicle>();
Scanner sc = new Scanner(System.in);
VehicleInfo vehicleInfo = new VehicleInfo();
Date d = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
Car car = new Car();
Lorry lorry = new Lorry();
Twowheeler twowheeler = new Twowheeler();

public void addCar() {

        System.out.println("\t  You Selected Car \n");

        System.out.println("\t  Add Car Brand Name \n");

       car.setBrandName(sc.nextLine());

        System.out.println("\t  Add Car Register Number \n");
        car.setRegNo(sc.nextLine());

        System.out.println("\t  Center Name \n");
        vehicleInfo.setCenter(sc.nextLine());
        
        System.out.println("\t  Date Updated \n");
        
        vehicleInfo.setDate(formatter.format(d));

        vehicles.add(car);

       
        }

        public void addLorry() {
                    
                System.out.println("\t  You Selected Lorry \n");
                
                System.out.println("\t  Add Lorry Brand Name \n");
                
                lorry.setBrandName(sc.nextLine());
    
                System.out.println("\t  Add Lorry Register Number \n");
                lorry.setRegNo(sc.nextLine());

                System.out.println("\t  Center Name \n");
                vehicleInfo.setCenter(sc.nextLine());
        
                System.out.println("\t  Date Updated \n");
               
                vehicleInfo.setDate(formatter.format(d));

                vehicles.add(lorry);
    
            }

            public void addTwoWheeler() {
        
                    System.out.println("\t  You Selected TwoWheeler \n");

                    
                    System.out.println("\t  Add Twowheeler Brand Name \n");
                    
                    twowheeler.setBrandName(sc.nextLine());
        
                    System.out.println("\t  Add Twowheeler Register Number \n");
                    twowheeler.setRegNo(sc.nextLine());

                    System.out.println("\t  Center Name \n");
                    vehicleInfo.setCenter(sc.nextLine());
        
                    System.out.println("\t  Date Updated \n");
               
                    vehicleInfo.setDate(formatter.format(d));

                    vehicles.add(twowheeler);
    
                
            }

            public void viewVehicleDetails() {

                System.out.println(vehicles);
                System.out.println(vehicleInfo);
                
            }
    }
    

