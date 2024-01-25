package com.diviso.carproject.controller;
import com.diviso.carproject.model.CarModel;
import java.util.*;




public class CarController {
    
    private List<CarModel> cars = new ArrayList<>();

    public void addCar(CarModel car) {
        cars.add(car);
        System.out.println("Car added successfully!");
    }

    public void displayAllCars() {
        System.out.println("List of Cars:");
        for (CarModel car : cars) {
            System.out.println("Car Name: " + car.getCarName()+"\n" +"  Owner Name: " + car.getOwnerName()+"\n" +"  Register Number: " + car.getRegisterNumber());
            System.out.println("\n");
        }
    }

    public void checkCarByRegisterNumber(String registerNumber) {
        for (CarModel car : cars) {
            if (car.getRegisterNumber().equals(registerNumber)) {
                System.out.println("Car found:");
                System.out.println("Car Name: " + car.getCarName()+"\n" +" Owner Name: " + car.getOwnerName()+"\n" +"  Register Number: " + car.getRegisterNumber());
                System.out.println("\n");
                return;
            }
        }
        System.out.println("Car not found with register number: " + registerNumber);
    }

   
        }
    



