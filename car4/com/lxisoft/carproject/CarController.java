package com.lxisoft.carproject;

import java.util.ArrayList;
import java.util.*;

public class CarController {

Scanner scanner = new Scanner(System.in);
    static List<Car> carList = new ArrayList<>();

    public  void addCarDetails(){

        Car car = new Car();

         System.out.print("Enter car name:");
            car.setCarName(scanner.nextLine());
         System.out.print("Enter car Variant:");
            car.setCarName(scanner.nextLine());
    carList.add(car);
    }

    public void showCarDetails(){

    }
}
