package com.lxisoft.fruitsStore.controller;

import java.util.Scanner;

import com.lxisoft.fruitsStore.store.Store;

public class ViewController {

    Store store = new Store("A M Fruits", "Palakkad");

    Scanner s = new Scanner(System.in);

    public void chooseOption() {

      boolean cse =true;

      while (cse){

        System.out.println(store + "\n");

        System.out.println("\t  ----- Welcome To Fruits Store ----- \n");

        System.out.println("\t  Press 1 :  Add Fruits  \n");
        System.out.println("\t  Press 2 :  View Fruits Details  \n");
        System.out.println("\t  Press 3 :  Quit \n");

        String st = s.nextLine();

        switch (st)
        {

          case ("1"):
            fruitsDetails();
					
					break;
					
			    case ("2"):
          categoryList();
				 
              break;

          case ("3"):
           
                     
          System.out.print("Quit");			
					cse = false;
            break;
					  
				default:
					System.out.println("Invalid Expression");		


        }
      }
      
    }

    public void categoryList() {

      boolean cs =true;

      while (cs){

        System.out.println("\t  Press 1 :  Show All Fruits  \n");
        System.out.println("\t  Press 2 :  Show MultiSeed Fruits \n");
        System.out.println("\t  Press 3 :  Show SeedLess Fruits \n");
        System.out.println("\t  Press 4 :  Show SingleSeed Fruits \n");
        System.out.println("\t  Press 5 :  Show Juicy Fruits \n");
        System.out.println("\t  Press 6 :  Quit \n");

        String st = s.nextLine();

        switch (st)
        {

          case ("1"):
          store.viewAllFruits();
					
					break;
					
			    case ("2"):
            store.viewMultiSeedFruits();
				 
              break;

              case ("3"):
            System.out.println("not completed");
              break;

              case ("4"):
              System.out.println("not completed");
            
              break;

              case ("5"):
              System.out.println("not completed");
				 
              break;

          case ("6"):
               
          System.out.print("Quit");			
					cs = false;
            break;
					  
				default:
					System.out.println("Invalid Expression");		

        }

        System.out.println("Enter yes to continue no to quit");
        String response = s.nextLine();
        
        if(response.equals("no"))
     {
        break;
   }

      }
      
    }

    public void fruitsDetails() {

        boolean c = true;
        while(c){


            System.out.println("\t\t\t   Add Fruits \n");

            System.out.println("\t\t  -Choose Categories Below- \n");

            System.out.println("\t  Press 1 :  MultiSeed  \n");
            System.out.println("\t  Press 2 :  SeedLess  \n");
            System.out.println("\t  Press 3 :  SingleSeed  \n");
            System.out.println("\t  Press 4 :  Juicy  \n");
            System.out.println("\t  Press 5 :  Quit \n");


            String count  = s.nextLine();
				 
				
			    switch (count)
			     {
				case ("1"):
                    store.addApple();
                    
					
					break;
					
			    case ("2"):
                  store.addGrape();
				 
                    break;

                case ("3"):
                  store.addMango();
                     
                    break;

                case ("4"):
                  store.addOrange();
                     
                    break;
					  
				case ("5"):
				
             System.out.print("Quit");			
					c = false;
                      break;
					  
				default:
					System.out.println("Invalid Expression");		
			}

      System.out.println("Enter yes to continue no to quit");
          String response = s.nextLine();
				  
          if(response.equals("no"))
		   {
          break;
     }
        
    }
    
}}
