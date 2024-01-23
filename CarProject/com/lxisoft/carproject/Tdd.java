package com.lxisoft.carproject;

import java.util.Scanner;

public class Tdd {
    public static void main(String[] args) {

        System.out.println(".........CAR1........");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Tyre Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter Tyre Type: ");
        String tyretype = scanner.nextLine();



        
        Tyre tyre = new Tyre(brand,tyretype);

        
        System.out.print("Enter door Color: ");
        String color = scanner.nextLine();
        System.out.print("Enter door Model: ");
        String model = scanner.nextLine();

        
        Door door = new Door(color, model);

        Tyre[] tyres = {tyre};
        Door[] doors = {door};

        
        System.out.print("Enter Car Brand: ");
        String carbrand = scanner.nextLine();
        System.out.print("Enter Car Model: ");
        String carmodel = scanner.nextLine();
        System.out.print("Enter Car Color: ");
        String carcolor = scanner.nextLine();
        System.out.print("Enter Car Price: ");
        String price = scanner.nextLine();
       


        
        Car cars = new Car(brand, model, color,price,tyres,doors);
        



         cars.printCarDetails();






}

        
   
    }
    
