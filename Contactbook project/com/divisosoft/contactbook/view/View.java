package com.divisosoft.contactbook.view;
import com.divisosoft.contactbook.model.Contactbook;
import java.util.Scanner;


public class View{
	
	Scanner scan = new Scanner(System.in);
	
   public void viewMenu(){
	   System.out.println("\n\t<<<<<*****Welcome To ContactBook*****>>>>>\n");
	   System.out.println("1. Create New Contact");
	   System.out.println("2. Read All Contact");
	   System.out.println("3. Edit Contact");
	   System.out.println("4. Delete Contact");
	   System.out.println("5. Search Contact");
	   System.out.println("6. Exit From Contactbook");
    }
	
	
   public Contactbook newContact(){
	   
	   Contactbook contact = new Contactbook();
	   
	   System.out.println("\n\t<<<<CREATE NEW CONTACT>>>>\n");
	   System.out.println("Enter Name : ");
	   contact.setName(scan.nextLine());
	   System.out.println("Enter Number : ");
	   long number = Long.parseLong(scan.nextLine());
	   contact.setMobileNumber(number);
	   System.out.println("Enter Email : ");
	   contact.setEmail(scan.nextLine());
	   
	   return contact;
    }
	
	
   public Contactbook editContact(){
	   
	   Contactbook contact = new Contactbook();
	   
	   System.out.println("\n\t<<<<EDIT OLD CONTACT>>>>\n");
	   System.out.println("Enter New Name : ");
	   contact.setName(scan.nextLine());
	   System.out.println("Enter New Number : ");
	   long number = Long.parseLong(scan.nextLine());
	   contact.setMobileNumber(number);
	   System.out.println("Enter New Email : ");
	   contact.setEmail(scan.nextLine());
	   
	   return contact;
    }


}