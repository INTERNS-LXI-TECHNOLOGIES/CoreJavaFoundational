package com.lxisoft.factors;

import java.util.Scanner;

import com.lxisoft.vegetablestore.VegetableStore;

public class ViewController {
    Scanner scanner = new Scanner(System.in);

    VegetableStore store = new  VegetableStore();

    public void printVegetableDetails(){

        boolean count = true;

        while(count){

            System.out.println("PRESS 1 : ADD VEGETABLES \n");
            System.out.println("PRESS 2 : SHOW DETAILS \n");
            System.out.println("PRESS 3 : QUIT \n");

            String temp  = scanner.nextLine();

            switch (temp)
			     {

                    case ("1"):

             

                vegetableDetails();
                    
                break;
						
			     case ("2"):

                
                 vegetableDetails();
                   
				    break;

                      case ("3"):

                      count = false;
                      break;
					  
				default:
					System.out.println("Invalid Expression");

                      
                      }
    }
    }

    
    public void vegetableDetails(){

       

        
            boolean count = true;

            while(count){

    System.out.println("..........WELCOME TO VEGETABLE STORE.......... \n");
    System.out.println(".......Choose Options Below....... \n");
    System.out.println("....Choose The Categories Below:......  \n");
    
    System.out.println("\t  Press 1 : Stem Edible  \n");
    System.out.println("\t  Press 2 : Root Edible  \n");
    System.out.println("\t  Press 3 : Leaf Edible \n");
    System.out.println("\t  Press 4 : Juicy \n");
    System.out.println("\t  Press 5 : Show Details \n");
    System.out.println("\t  Press 6 :  Quit \n");

    String temp  = scanner.nextLine();

            switch (temp)
			     {
				case ("1"):

             

                store.addBambooShoots();
                    
                break;
						
			     case ("2"):

                
                 store.addCarrot();
                   
				    break;

                      case ("3"):

                      
                      store.addSpinach();
                   
                         break;

                      case ("4"):

                      
                      store.addPotato();
                   
                     
                      break;

                      case ("5"):

                      store.showDetails();

                      break;

                    case ("6"):
				
                    System.out.print("Quit");			
					count = false;
                      break;
					  
				default:
					System.out.println("Invalid Expression");		
			}

    
    }
}
}
