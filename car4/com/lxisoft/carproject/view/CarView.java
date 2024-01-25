package com.lxisoft.carproject.view;
import com.lxisoft.carproject.model.*;
import com.lxisoft.carproject.controller.*;

import java.util.Scanner;

public class CarView {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car();
    CarController controller = new CarController();
        static String registrationNumber;
    public void workDetails() {
        boolean programflow = true;
        while (programflow) {
            System.out.println("WELCOME TO CAR SERVICE");
            System.out.println("Press 1: Add Car Details");
            System.out.println("Press 2: Show Car Details");
            System.out.println("Press 3: Search Car Details");
            System.out.println("Press 4: Quit");

            String val = scanner.nextLine();
            switch (val) {
                case "1":
                    controller.addCarDetails();
                    break;
                case "2":
                    controller.showCarDetails();
                    break;
                case "3":
                    controller.searchCarDetails();
                    break;
                case "4":
                    System.out.println("Quit");
                    programflow = false;
                    break;


            }

        }
    }
}