package com.lxisoft.vegetablestore;

import java.util.*;

import com.lxisoft.vegetables.BambooShoots;

import com.lxisoft.vegetables.Carrot;

import com.lxisoft.vegetables.Potato;
import com.lxisoft.vegetables.Spinach;



public class VegetableStore {



    Scanner scanner = new Scanner(System.in);

    List<Vegetable> vegetableList = new ArrayList<Vegetable>();



        

    public void addBambooShoots(){
        boolean flag = true;
        String response;
        while(flag){

        BambooShoots bambooShoots = new BambooShoots();

        System.out.println(".....Add Vegetables.....\n");
        System.out.println("\t \t Enter Vegetable Name: \n");
        bambooShoots.setName(scanner.nextLine());
        System.out.println("\t \t Enter Price:  \n");
        bambooShoots.setPrice(scanner.nextLine());
        System.out.println("\t \t Enter The Quantity: \n");
        bambooShoots.setQuantity(scanner.nextLine());
        vegetableList.add(bambooShoots);
        System.out.println("Do you want to continue : yes or no ?");
        response = scanner.nextLine();
        if(response .equals("no")){

           
            flag = false;
            break;
        }

        }
    
        
        
    }


    public void addCarrot(){

        Carrot carrot = new Carrot();

        System.out.println(".....Add Vegetables.....\n");
        System.out.println("Enter Vegetable Name: \n");
        carrot.setName(scanner.nextLine());
        System.out.println("Enter Price:  \n");
        carrot.setPrice(scanner.nextLine());
        System.out.println("Enter The Quantity: \n");
        carrot.setQuantity(scanner.nextLine());
        vegetableList.add(carrot);
    
    }

    

    public void addPotato(){

        Potato potato = new Potato();

        System.out.println(".....Add Vegetables.....\n");
        System.out.println("Enter Vegetable Name: \n");
        potato.setName(scanner.nextLine());
        System.out.println("Enter Price:  \n");
        potato.setPrice(scanner.nextLine());
        System.out.println("Enter The Quantity: \n");
        potato.setQuantity(scanner.nextLine());
        vegetableList.add(potato);

    }

    public void addSpinach() {

        Spinach spinach = new Spinach();

        System.out.println(".....Add Vegetables.....\n");
        System.out.println("Enter Vegetable Name: \n");
        spinach.setName(scanner.nextLine());
        System.out.println("Enter Price:  \n");
        spinach.setPrice(scanner.nextLine());
        System.out.println("Enter The Quantity: \n");
        spinach.setQuantity(scanner.nextLine());
        vegetableList.add(spinach);

    }
    


    

    public void showDetails(){

        System.out.println(vegetableList);


    }
}


    

