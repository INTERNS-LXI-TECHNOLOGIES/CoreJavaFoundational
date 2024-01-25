package com.lxisoft.carproject.controller;

import com.lxisoft.carproject.view.*;
import com.lxisoft.carproject.model.*;
import java.util.*;
public class CarController {

    Scanner scanner = new Scanner(System.in);
    static List<Car> carList = new ArrayList<>();

    public void addCarDetails() {
        Car car = new Car();

        System.out.print("Enter car name:");
        car.setCarName(scanner.nextLine());

        System.out.print("Enter car varient:");
        car.setVarient(scanner.nextLine());

        System.out.print("Enter car colour:");
        car.setColour(scanner.nextLine());

        System.out.print("Enter car registration Number:");
        car.setRegistrationNumber(scanner.nextLine());

        carList.add(car);
    }

    public void showCarDetails() {
        System.out.println("**************Car Details***********:");
        for (Car car : carList) {
            System.out.println("Car Name: " + car.getCarName());
            System.out.println("Car Variant: " + car.getVarient());
            System.out.println("Car Colour: " + car.getColour());
            System.out.println("Car Registration Number: " + car.getRegistrationNumber());

        }
    }

    public void searchCarDetails() {
        boolean carFound = false;

        System.out.println("enter registration number");
        String registrationNumber= scanner.nextLine();

        for (Car car : carList) {
            if (car.getRegistrationNumber().equals(registrationNumber)) {
                carFound = true;
                System.out.println("Car Details:");
                System.out.println("Car Name: " + car.getCarName());
                System.out.println("Car Variant: " + car.getVarient());
                System.out.println("Car Colour: " + car.getColour());
                System.out.println("Registration Number: " + car.getRegistrationNumber());
                break;
            }
        }

        if (!carFound) {
            System.out.println("Car not found with Registration Number: " + registrationNumber);
        }
    }



}
