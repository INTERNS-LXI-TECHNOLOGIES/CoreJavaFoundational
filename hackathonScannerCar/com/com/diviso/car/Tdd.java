package com.diviso.car;
import java.util.*;
public class Tdd{

   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] scannerCar)
    {

        Car car = new Car();
        System.out.println("name");
        car.setName(scanner.nextLine());
       System.out.println("colour");
          car.setColour(scanner.nextLine());

        // System.out.println(car);
                
            for(int door=0;door<3;door++){
          car.getDoors()[door]= new Door();
         System.out.println("door name");
         car.getDoors()[door].setName(scanner.nextLine());
           System.out.println("door colour");
          car.getDoors()[door].setColour(scanner.nextLine());
            }


            for(int tyre=0;tyre<3;tyre++){
          car.getTyres()[tyre]= new Tyre();
           System.out.println("tyre name");
          car.getTyres()[tyre].setName(scanner.nextLine());
           System.out.println("tyre colour");
          car.getTyres()[tyre].setColour(scanner.nextLine());
            }

            car.getTyres()[0]= new Tyre();
             System.out.println("steering name");
          car.getSteering().setName(scanner.nextLine());
           System.out.println("steering colour");
          car.getSteering().setColour(scanner.nextLine());

    }
}