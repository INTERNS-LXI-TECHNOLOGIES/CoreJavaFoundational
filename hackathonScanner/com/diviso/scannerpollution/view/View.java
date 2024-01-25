package com.diviso.scannerpollution.view;

import com.diviso.scannerpollution.controller.*;
import com.diviso.scannerpollution.model.Car;

import java.util.*;

public class View {

  static Scanner scan = new Scanner(System.in);
  static Controller control = new Controller();
  List<Car> cars;

  public void uI() {

    boolean flag = true;

    while (flag) {

      System.out.println("press 1 : to create Car Details");
      System.out.println("press 2 : to show car details");
      System.out.println("press 3 : to find specific car Details");

      String scanner = scan.nextLine();
      switch (scanner) {

        case "1":

          cars = control.carController();
          break;

        case "2":

          control.showCarDetails();
         

          break;

        case "3":
         // control.searchCarDetails();
         // break;

        default:
          System.out.println("come back again");

      }

    }

  }

}
