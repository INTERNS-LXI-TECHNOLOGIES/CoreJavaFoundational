package com.lxisoft.carproject;

import java.util.Scanner;

public class CarView {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car();
    CarController controller = new CarController();

    public void workDetails() {
        boolean programflow = true;
        while (programflow) {
            System.out.println("WELCOME TO CAR SERVICE");
            System.out.println("Press 1: Add Car Details");
            System.out.println("Press 2: Show Car Details");
            System.out.println("Press 3: Quit");

            String val = scanner.nextLine();
            switch (val) {
                case "1":
                    controller.addCarDetails();
                    break;
                case "2":
                    controller.showCarDetails();
                    break;
                case "3":
                    System.out.println("Quit");
                    programflow = false;
                    break;


            }

        }
    }
}