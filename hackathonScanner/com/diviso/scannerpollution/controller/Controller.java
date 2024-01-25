package com.diviso.scannerpollution.controller;

import com.diviso.scannerpollution.model.*;
import java.util.*;

public class Controller {

  static Scanner scan = new Scanner(System.in);
  static List<Car> cars = new ArrayList<>();

  static Car car = new Car();

  public List<Car> carController() {

    System.out.println("Car Name");
    car.setName(scan.nextLine());
    System.out.println("Reg No");
    car.setRegNo(scan.nextLine());

    cars.add(car);
    return cars;

    
  }

  public void showCarDetails() {

    System.out.println(cars);

  }

 /*
  * public boolean searchCarDetails() {
  * 
  * if (cars.contains(car)) {
  * 
  * cars.get(car.setRegNo());
  * 
  * }
  * 
  * }
  */

  

}
