package com.lxi.carpollution.view;
import com.lxi.carpollution.controller.*;
import com.lxi.carpollution.model.Car;
import java.util.Scanner;
import java.util.ResourceBundle.Control;

public class CarView {
    Scanner sc = new Scanner(System.in);
    Controller cont = new Controller();

    public void service() 
    {
        boolean flow = true;
        while (flow) {

            System.out.println("WELCOME TO CAR SERVICE");
            System.out.println("PRESS 1 SERVICE 1");
            System.out.println("ENTER 2 TO CHECK");
            System.out.println("ENTER 3 TO PRINT ");
            System.out.println("ENTER 5 TO QUIT");
            String s = sc.nextLine();
            switch ((s)) {
                case "1":
                    cont.enter();
                    break;
                case "2":
                    cont.serchCar();
                    break;
                case "3":
                cont.printCarDetailes();
                    break;
                case "5":
                    flow = false;
                default:
                    break;
            }
        }
    }

}
