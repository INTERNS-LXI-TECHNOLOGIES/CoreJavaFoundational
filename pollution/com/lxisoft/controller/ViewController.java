package com.lxisoft.controller;
import java.util.Scanner;
import com.lxisoft.authentication.LogIn;
import com.lxisoft.vehicles.Vehicle;
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

        System.out.println("\t   Invalid Username or Password  \n");
        
    } 
        System.out.println("Enter yes to continue no to quit");
        String response = sc.nextLine();
        
    if(response.equals("no"))
     {
        break;

    }}}

public void homePage() {

           
        Vehicle v = new Vehicle();

        System.out.println("\t  -----Welcome To Pollution Service----- \n");

        System.out.println("\t    Enter Register Number \n");

        v.setRegNo(sc.nextLine());

    if (pollutionCenter.vehicles.contains(v)){

        System.out.println(pollutionCenter.vehicles);

    }

    else{

        mainMenu();

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
        updateVehicle();
        break;

        case ("4"):
        deleteCertificate();
        break;
					  
		case ("5"):
				
        System.out.print("Quit");			
		c = false;
        break;
					  
		default:
		System.out.println("Invalid Expression");		
			
    }}}
    
public void addPollition(){
        pollutionCenter.createCertificate();

	}

public void deleteCertificate() {
        boolean s = true;

    while(s){    
        Vehicle v = new Vehicle();

        System.out.println("\t  Enter Register Number \n");
        v.setRegNo(sc.nextLine());
        int i = pollutionCenter.vehicles.indexOf(v);
    if (pollutionCenter.vehicles.contains(v)){

        pollutionCenter.vehicles.remove(i);
        System.out.println("CERTIFICATE DELETED \n");
    }

        System.out.println("Do you want to continue yes to continue no to quit \n");
        String response = sc.nextLine();
        
    if(response.equals("no"))
            {

        mainMenu();
        s=false;
       
    }}}

public void updateVehicle() {
        boolean s = true;

    while(s){    
        Vehicle v = new Vehicle();

        System.out.println("\t  Enter Register Number \n");
        v.setRegNo(sc.nextLine());
        int i = pollutionCenter.vehicles.indexOf(v);
    if (pollutionCenter.vehicles.contains(v)){

        System.out.println("\t  Enter Brand Name \n");
        pollutionCenter.vehicles.get(i).setBrandName(sc.nextLine());
        
        System.out.println("CERTIFICATE UPDATED \n");
    }

        System.out.println("Do you want to continue yes to continue no to quit \n");
        String response = sc.nextLine();
        
    if(response.equals("no"))
            {

        mainMenu();
        s=false;
       
    }}}

public void viewCertificate() {

        pollutionCenter.viewVehicleDetails();
    
    }}