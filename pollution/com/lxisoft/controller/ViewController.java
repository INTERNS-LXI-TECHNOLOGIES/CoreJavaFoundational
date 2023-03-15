package com.lxisoft.controller;

import java.util.Scanner;

import com.lxisoft.authentication.LogIn;
import com.lxisoft.view.PollutionCenter;

public class ViewController {
   
    Scanner sc = new Scanner(System.in);
    PollutionCenter pollutionCenter = new PollutionCenter();
    
    public void logIn() {

    LogIn logIn = new LogIn();

    boolean c = true;
    
    while(c){

    System.out.println("\t  -----Welcome To Pollution Service----- \n");

    System.out.println("\t   Please Log In   \n");

    System.out.println("\t   Enter UserName \n");

    String uname= sc.nextLine();
    System.out.println("\t    Enter Password \n");

    String pword = sc.nextLine();

    if(logIn.getUserName().equals(uname) && logIn.getPassWord().equals(pword)){

        System.out.println("\t   Logged In Successfull \n");

        homePage();
        break;

    }
    else {

        System.out.println("\t   Invalid Username Or Password  \n");
        
    } 
    
    System.out.println("Enter yes to continue no to quit");
        String response = sc.nextLine();
        
        if(response.equals("no"))
     {
        break;
   }
}
}

public void homePage() {

    boolean c = true;
        while(c){

            System.out.println("\t  -----Welcome To Pollution Service----- \n");

            System.out.println("\t  Press 1 : Enter Register Number \n");

            String register = sc.nextLine();
            
            System.out.println("Enter M to Main Menu , Q to quit");
            String response = sc.nextLine();
            
            if(response.equals("M"))
         {
            mainMenu();
            break;
            
       } 

       else{

        System.out.print("Quit  \n");			
					c = false;
                      break;


       }
					
			}}


            public void mainMenu() {
                
                boolean c = true;
                while(c){

                System.out.println("\t  -----Welcome To Pollution Service----- \n");

                System.out.println("\t\t  -Choose Options Below- \n");

                
                System.out.println("\t  Press 1 : Create \n");
                System.out.println("\t  Press 2 : Read  \n");
                System.out.println("\t  Press 3 : Update \n");
                System.out.println("\t  Press 4 : Delete \n");
                System.out.println("\t  Press 5 : Quit \n");
                String count  = sc.nextLine();
				 
				
			    switch (count)
			     {
				case ("1"):
				addPollition();
					
					break;
					
			     case ("2"):
                 viewCertificate();
				 
                      break;

                      case ("3"):
                
                    System.out.println("Update");
                      break;

                      case ("4"):
                
                      System.out.println("Delete");
                      break;
					  
				case ("5"):
				
                    System.out.print("Quit");			
					c = false;
                      break;
					  
				default:
					System.out.println("Invalid Expression");		
			}

                }
            }
    

    public void addPollition(){
        boolean c = true;
        while(c){
            System.out.println("\t  Select Vehicle Type  \n");
            
            System.out.println("\t  Press 1 : Add Car \n");
            System.out.println("\t  Press 2 : Add Lorry  \n");
            System.out.println("\t  Press 3 : Add TwoWheeler  \n");
            System.out.println("\t  Press 4 : Quit \n");


            String count  = sc.nextLine();

            switch (count)
			     {
				case ("1"):
				pollutionCenter.addCar();
					
					break;
						
			     case ("2"):
                   
				 pollutionCenter.addLorry();
                      break;

                      case ("3"):
                   
                      pollutionCenter.addTwoWheeler();
                      break;
					  
				case ("4"):
				
                    System.out.print("Quit");
                    System.out.println("\n");			
					c = false;
                      break;
					  
				default:
					System.out.println("Invalid Expression");		
			}

        }

    }


    public void viewCertificate() {

        pollutionCenter.viewVehicleDetails();


        
    }
    
}

