package com.diviso.carproject.view;
import java.util.Scanner;

import com.diviso.carproject.controller.CarController;
import com.diviso.carproject.model.*;

public class CarView {

    public void displayMenu() {
        System.out.println("1. Add a new car");
        System.out.println("2. Search by Register Number");
        System.out.println("3. Exit");
        
    }

    public void displayCarDetails(CarModel car) {
        System.out.println("Owner: " + car.getOwnerName());
        System.out.println("Car Name: " + car.getCarName());
        System.out.println("Register Number: " + car.getRegisterNumber());
        System.out.println("----------------------------");
    }

    public void viewDetails(){
           CarController carController = new CarController();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Choose an option:");
        System.out.println("1. Add Car");
        System.out.println("2. Display All Cars");
        System.out.println("3. Check Car by Register Number");
        System.out.println("4. Exit");

        String flag = scanner.nextLine();

        switch (flag) {
            case "1":

                System.out.println("Enter Car Name:");
                String carName = scanner.nextLine();
                System.out.println("Enter Owner Name:");
                String ownerName = scanner.nextLine();
                System.out.println("Enter Register Number:");
                String registerNumber = scanner.nextLine();
                CarModel car = new CarModel(carName, ownerName, registerNumber);
                carController.addCar(car);
                break;

            case "2":
                carController.displayAllCars();
                break;

            case "3":
                
                System.out.println("Enter Register Number to check:");
                String registerNumberToCheck = scanner.nextLine();
                carController.checkCarByRegisterNumber(registerNumberToCheck);
                break;

            case "4":
                System.out.println("Exit From The Application");

            default:
                System.out.println("Invalid value Please choose a valid option");
        }
    }

   
}
}