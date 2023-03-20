package com.lxisoft.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import com.lxisoft.factor.Login;        
import com.lxisoft.factor.PollutionCenter;
import com.lxisoft.vehicle.Vehicle;
import com.lxisoft.vehicle.VehicleInfo;
import com.lxisoft.vehicles.Bike;
import com.lxisoft.vehicles.Car;
import com.lxisoft.vehicles.Lorry;

public class ViewController {

     
    Scanner sc = new Scanner(System.in);
    PollutionCenter pollution = new PollutionCenter();
    Date date = new Date();
    VehicleInfo vehicleInfo = new  VehicleInfo(); 
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Login login = new Login();

    public void login(){

      boolean temp = true;

      while(temp){

    
        System.out.println("----USER NAME----- \n");

      System.out.print("USER NAME : ");
      String userName = sc.nextLine();

        System.out.println("----PASSWORD---- \n");

      System.out.print("PASSWORD : ");
      String password = sc.nextLine();

      System.out.println("\n Enter Yes to Login : ");
      String response = sc.nextLine();
     
     if(login.getUserName().equals(userName) && login.getPassword().equals(password)){

      if(response.equalsIgnoreCase("yes")){

        temp = false;
       
        crudDetails();

      }

      }

      else{

        System.out.println("Invalid Login and Password");

      }
    }

  }

    

    public void crudDetails(){

      boolean flag = true;

      do {

        System.out.println("..........MAIN MENU.......... \n");
        System.out.println("-----Press 1. Create---- \n");
        System.out.println("-----Press 2. Read---- \n");
        System.out.println("-----Press 3. Update---- \n");
        System.out.println("-----Press 4. Delete---- \n");
        System.out.println("-----Press 5. Quit---- \n");

        int fact = Integer.parseInt(sc.nextLine());

        switch(fact){

          case 1:
            createCertificate();
            break;

          case 2:
            printDetailsOfVehicle();
            break;

          case 3:
            System.out.println("Update");
            break;

          case 4:
          delete();
            break;

          case 5:
            System.out.println("Quit");
            flag = false;
            break;

            default:
            System.out.println("Default");

        }
  }
      while(flag);
}

public void createCertificate()
            {

              System.out.println("Available plots are Car , Lorry , Bike");

              System.out.println("Enter Vechile Type");

              String type = sc.nextLine();

              if(type.equalsIgnoreCase("Bike")){

                 Bike bike = new Bike();

                 System.out.println("Enter Register Number: \n");
                 bike.setRegisterNo(sc.nextLine());

                 if(pollution.getVehicleList().contains(bike)){

                  System.out.println("This Vehicle is Certified");
                }

                System.out.println("Enter Owner Name: \n");
                bike.setOwnerName(sc.nextLine());

                System.out.println("Enter Date: \n");
                vehicleInfo.setDate(dateFormat.format(date));

            System.out.println("Center Name: \n");
            vehicleInfo.setCentreName(sc.nextLine());

            pollution.getVehicleList().add(bike);

            bike.vehicleInfo.add(vehicleInfo);
                 
              
          
          }

          else if(type.equalsIgnoreCase("Car")){

             Car car = new Car();

             System.out.println("Enter Register Number: \n");
                car.setRegisterNo(sc.nextLine());

                if(pollution.getVehicleList().contains(car)){

                  System.out.println("This Vehicle is Certified");
                }

                System.out.println("Enter Owner Name: \n");
                car.setOwnerName(sc.nextLine());

            System.out.println("Enter Date: \n");
            vehicleInfo.setDate(dateFormat.format(date));

            System.out.println("Center Name: \n");
            vehicleInfo.setCentreName(sc.nextLine());
          

           pollution.getVehicleList().add(car);

           car.vehicleInfo.add(vehicleInfo);
      }

      else if(type.equalsIgnoreCase("Lorry")){

        Lorry lorry = new Lorry();

        System.out.println("Enter Register Number: \n");
        lorry.setRegisterNo(sc.nextLine()); 

        if(pollution.getVehicleList().contains(lorry)){

          System.out.println("This Vehicle is Certified");
        }


            System.out.println("Enter Owner Name: \n");
            lorry.setOwnerName(sc.nextLine());  

           System.out.println("Enter Date: \n");
            vehicleInfo.setDate(dateFormat.format(date));

            System.out.println("Center Name: \n");
            vehicleInfo.setCentreName(sc.nextLine());

            pollution.getVehicleList().add(lorry);

            lorry.vehicleInfo.add(vehicleInfo);
          

      }

      else
        System.out.println("The vechile is not Checked Here");
    }

    public void updateCertificate(){

      System.out.println("------Updated Certificate-----");
      





    }

      public void delete(){

        Vehicle v = new Vehicle();
        System.out.print("\n Enter Register Number :");
        v.setRegisterNo(sc.nextLine());
        int i = pollution.getVehicleList().indexOf(v);
        if(pollution.getVehicleList().contains(v)){
          
           pollution.getVehicleList().remove(i);

           System.out.println("Deleted");

        }
      }
            
          
          public void printDetailsOfVehicle()
          {

          System.out.println(pollution); 
          
         //System.out.println( vehicleInfo);

          }

          
    
}
        
    

