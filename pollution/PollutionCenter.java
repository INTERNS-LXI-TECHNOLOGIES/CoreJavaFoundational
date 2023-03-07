package pollution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PollutionCenter {

List <Vehicle> vehicles = new ArrayList<Vehicle>();
Scanner sc = new Scanner(System.in);
Car car = new Car();
Lorry lorry = new Lorry();
Twowheeler twowheeler = new Twowheeler();

public void addCar() {

        System.out.println("\t  You Selected Car \n");

        System.out.println("\t  Add Car Brand Name \n");

       car.setBrandName(sc.nextLine());

        System.out.println("\t  Add Car Register Number \n");
        car.setRegNo(sc.nextLine());

        vehicles.add(car);

       
        }

        public void addLorry() {
                    
                System.out.println("\t  You Selected Lorry \n");
                
                System.out.println("\t  Add Lorry Brand Name \n");
                
                lorry.setBrandName(sc.nextLine());
    
                System.out.println("\t  Add Lorry Register Number \n");
                lorry.setRegNo(sc.nextLine());

                vehicles.add(lorry);
    
            }

            public void addTwoWheeler() {
        
                    System.out.println("\t  You Selected TwoWheeler \n");

                    
                    System.out.println("\t  Add Twowheeler Brand Name \n");
                    
                    twowheeler.setBrandName(sc.nextLine());
        
                    System.out.println("\t  Add Twowheeler Register Number \n");
                    twowheeler.setRegNo(sc.nextLine());

                    vehicles.add(twowheeler);
    
                
            }

    }
    

