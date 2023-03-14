package com.lxisoft.controller;

import java.util.Scanner;

import com.lxisoft.authentication.LogIn;
import com.lxisoft.view.PollutionCenter;

public class ViewController {
   
    Scanner sc = new Scanner(System.in);
    PollutionCenter pollutionCenter = new PollutionCenter();
    
public void logIn() {

    LogIn logIn = new LogIn();

    System.out.println("\t   Please Log In   \n");

    System.out.println("\t   Enter UserName \n");

    String uname= sc.nextLine();
    System.out.println("\t    Enter Password \n");

    String pword = sc.nextLine();

    if(logIn.getUserName().equals(uname) && logIn.getPassWord().equals(pword)){

        System.out.println("\t   Logged In Successfull \n");

        pollutionDetails();

    }
    else {

        System.out.println("\t   Invalid Username Or Password  \n");
        
    }   
    
}

    public void pollutionDetails(){
        boolean c = true;
        while(c){
    System.out.println("\t  -----Welcome To Pollution Service----- \n");
    System.out.println("\t\t  -Choose Options Below- \n");

    System.out.println("\t  Press 1 : Add Pollution Certificate \n");
    System.out.println("\t  Press 2 : View Certificate  \n");
    System.out.println("\t  Press 3 : Quit \n");

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

