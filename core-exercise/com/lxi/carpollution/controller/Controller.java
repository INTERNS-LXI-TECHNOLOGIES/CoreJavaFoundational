package com.lxi.carpollution.controller;
import java.util.*;
import com.lxi.carpollution.model.Car;

public class Controller {
    static Scanner sc = new Scanner(System.in);

   public  List<Car> list = new ArrayList<>();

    public void enter() {
        boolean flow = true;

        while (flow) {
            Car c = new Car();

            System.out.println("Enter your brand name:");
            c.setBranName(sc.nextLine());

            System.out.println("Enter your owner name:");
            c.setOwnerName(sc.nextLine());

            System.out.println("Enter your registration number:");
            c.setRegNumber(sc.nextLine());

            list.add(c);

            System.out.println("Do you want to enter another car? (yes/no)");
            String input = sc.nextLine();
            if ("no".equalsIgnoreCase(input)) {
                flow = false;
            }
            
        }
    }
        public void  printCarDetailes()
        {
        System.out.println(list);
        System.out.println(list.size());
        }

            public void serchCar() {
                Car car = new Car();
                Scanner sc=new Scanner(System.in);
                System.out.println("ENTER YOUR REGISTRATION");
                String s = sc.nextLine();
                car.setRegNumber(s);

                 if (list.contains(car)) {
                 int i = list.indexOf(car);
                 System.out.println("Brand Name: " + list.get(i).getBranName());
                 System.out.println("Owner Name: " + list.get(i).getOwnerName());
                 System.out.println("Registration Number: " + list.get(i).getRegNumber());
        } else {
                 System.out.println("Car not found in the list.");
        }
    }
}
